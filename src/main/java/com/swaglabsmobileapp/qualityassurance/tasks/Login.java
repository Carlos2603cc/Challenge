package com.swaglabsmobileapp.qualityassurance.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.swaglabsmobileapp.qualityassurance.utils.Environments.getVariable;
import static com.swaglabsmobileapp.qualityassurance.userinterfaces.Login.*;


public class Login implements Task{
    static String USER;
    static String PASSWORD;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_LOGIN, isVisible()).forNoMoreThan(20).seconds());
        actor.attemptsTo(Enter.theValue(getVariable(USER)).into(CORREO));
        actor.attemptsTo(Enter.theValue(getVariable(PASSWORD)).into(CONTRASENA));
        actor.attemptsTo(Click.on(BTN_LOGIN).afterWaitingUntilPresent());

    }

    public static Login withCredentials() {
        USER = "USERNAME";
        PASSWORD = "PASSWORD";
        return Tasks.instrumented(Login.class);
    }

    public static Login withLockedCredentials() {
        USER = "LOCKED_USERNAME";
        PASSWORD = "PASSWORD";
        return Tasks.instrumented(Login.class);
    }

}
