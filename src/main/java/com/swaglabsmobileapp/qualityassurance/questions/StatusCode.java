package com.swaglabsmobileapp.qualityassurance.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class StatusCode implements Question<Integer> {

    public StatusCode(int expected) {
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }

    public static StatusCode is(int expected) {
        return new StatusCode(expected);
    }
}