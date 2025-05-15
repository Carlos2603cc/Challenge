package com.swaglabsmobileapp.qualityassurance.stepdefinitions;

import com.swaglabsmobileapp.qualityassurance.questions.visibleElement;
import com.swaglabsmobileapp.qualityassurance.tasks.Login;
import net.thucydides.core.annotations.Managed;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static com.swaglabsmobileapp.qualityassurance.userinterfaces.Login.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class LoginDefinition {

    @Managed(driver = "appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario quiere ingresar a Login")
    public void queElUsuarioQuiereIngresarALogin(){
        theActorCalled("User")
                .can(BrowseTheWeb.with(hisMobileDevice));
    }

    @Cuando("ingresa las credenciales correctas")
    public void ingresaLasCredencialesCorrectas() {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials());
    }

    @Entonces("podra ver el home de la SawagLabs")
    public void podraVerElHomeDeLaSawagLabs() {
        theActorInTheSpotlight().should(seeThat(visibleElement.withCredentials(HOME), is(true)));
    }

    @Cuando("ingresa las credenciales bloqueadas")
    public void ingresaLasCredencialesBloqueadas() {
        theActorInTheSpotlight().attemptsTo(Login.withLockedCredentials());
    }

    @Entonces("el usuario no podra acceder")
    public void elUsuarioNoPodraAcceder() {
        theActorInTheSpotlight().should(seeThat(visibleElement.withCredentials(HOME), is(false)));
        theActorInTheSpotlight().should(seeThat(visibleElement.withCredentials(LOCKED), is(true)));

    }









}
