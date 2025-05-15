package com.swaglabsmobileapp.qualityassurance.utils;


import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class Environments {
    static EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    public static String getVariable(String nameEnv) {
        return environmentVariables.getProperty(nameEnv);
    }
}
