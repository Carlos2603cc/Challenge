package com.swaglabsmobileapp.qualityassurance.stepdefinitions;

import com.swaglabsmobileapp.qualityassurance.questions.StatusCode;
import com.swaglabsmobileapp.qualityassurance.tasks.CreateAccount.PostCreateAccount;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static com.swaglabsmobileapp.qualityassurance.utils.constants.Dictionary.*;

public class CreateAccount {

    @Dado("que existe un usuario")
    public static void queExisteUnUsuario() {
        OnStage.theActor("User");
    }

    @Cuando("el usuario intenta crear una cuenta")
    public static void elUsuarioIntentaCrearUnaCuenta() {
        theActorInTheSpotlight().attemptsTo(PostCreateAccount.create());
    }

    @Entonces("el usuario crea la cuenta de manera exitosa")
    public static void elUsuarioCreaLaCuentaDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(StatusCode.is(200)));

    }

    @Cuando("el usuario intenta crear una cuenta con credenciales no validas")
    public static void elUsuarioIntentaCrearUnaCuentaConCredencialesNoValidas() {
        theActorInTheSpotlight().attemptsTo(PostCreateAccount.createFail());
    }

    @Entonces("el usuario no crea la cuenta de manera exitosa")
    public static void elUsuarioNoCreaLaCuentaDeManeraExitosa() {
        theActorInTheSpotlight().should(seeThat(StatusCode.is(400)));

    }

}
