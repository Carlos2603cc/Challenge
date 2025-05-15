package com.swaglabsmobileapp.qualityassurance.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.id;
import static com.swaglabsmobileapp.qualityassurance.utils.AndroidElement.*;
import static org.openqa.selenium.By.xpath;

public class Login {

    public static final Target CORREO = Target.the("Campo correo")
            .locatedForAndroid(AccesibilityId("test-Usuario"))
            .locatedForIOS(id(""));

    public static final Target CONTRASENA = Target.the("Campo contraseña")
            .locatedForAndroid(AccesibilityId("test-Contraseña"))
            .locatedForIOS(id(""));

    public static final Target BTN_LOGIN = Target.the("boton Login")
            .locatedForAndroid(AccesibilityId("test-LOGIN"))
            .locatedForIOS(id(""));

    public static final Target HOME = Target.the("Home")
            .locatedForAndroid(AccesibilityId("test-Zona de caída del carrito de compras"))
            .locatedForIOS(id(""));

    public static final Target LOCKED = Target.the("Ususari Bloqueado")
            .locatedForAndroid(AccesibilityId("test-Error"))
            .locatedForIOS(id(""));


}
