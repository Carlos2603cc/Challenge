package com.swaglabsmobileapp.qualityassurance.tasks.CreateAccount;

import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.swaglabsmobileapp.qualityassurance.endpoints.CreateAccount.*;
import static com.swaglabsmobileapp.qualityassurance.entities.PostCreateAccountEntity.createBody;
import static com.swaglabsmobileapp.qualityassurance.utils.Environments.getVariable;
import static com.swaglabsmobileapp.qualityassurance.utils.constants.Dictionary.*;

public class PostCreateAccount implements Task {

    static String USER;
    static String PASSWORD;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(getVariable(BASE_URL))).attemptsTo(
                Post.to(CREATE_ACCOUNT).with(
                        request -> request.config(RestAssuredConfig.config().sslConfig(new SSLConfig().relaxedHTTPSValidation()))
                                .contentType("application/json")
                                .accept("application/json")
                                .headers("x-api-key", getVariable(API_KEY))
                                .body(createBody(getVariable(USER), getVariable(PASSWORD)).toString())
                                .log().all()));
        actor.remember(STATUS_CODE_CREATE, SerenityRest.lastResponse().getStatusCode());
        System.out.println("\nStatus Code: "+ SerenityRest.lastResponse().getStatusCode());
        SerenityRest.lastResponse().prettyPrint();
    }

    public static PostCreateAccount create(){
        USER = "CREATEACCOUNT";
        PASSWORD = "CREATEPASS";
        return Tasks.instrumented(PostCreateAccount.class);}

    public static PostCreateAccount createFail(){
        USER = "CREATEACCOUNTFAILD";
        PASSWORD = "CREATEPASS";
        return Tasks.instrumented(PostCreateAccount.class);}
}
