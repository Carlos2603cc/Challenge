package com.swaglabsmobileapp.qualityassurance.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/01-front/login.feature",
                "src/test/resources/features/02-backEnd/createAccount.feature"
        },
        glue = "com.swaglabsmobileapp.qualityassurance.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags  = ""
)

public class AllFeatures {
}
