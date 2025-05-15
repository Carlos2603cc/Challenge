package com.swaglabsmobileapp.qualityassurance.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.swaglabsmobileapp.qualityassurance.userinterfaces.Login.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class visibleElement implements Question<Boolean> {
    static Target TARGET;
    @Override
    public Boolean answeredBy(Actor actor) {
        return TARGET.resolveFor(actor).isVisible();
    }

    public static visibleElement withCredentials(Target target){
        TARGET = target;
        return new visibleElement();
    }
}