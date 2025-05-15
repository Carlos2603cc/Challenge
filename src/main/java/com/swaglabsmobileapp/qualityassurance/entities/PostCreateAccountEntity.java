package com.swaglabsmobileapp.qualityassurance.entities;

import com.google.gson.JsonObject;

import static com.swaglabsmobileapp.qualityassurance.utils.Environments.getVariable;

public class PostCreateAccountEntity {
    private PostCreateAccountEntity(){}

    public static JsonObject createBody(String email, String passwod){
        JsonObject body = new JsonObject();
        body.addProperty("email", email);
        body.addProperty("password",passwod);
        return body;
    }
}
