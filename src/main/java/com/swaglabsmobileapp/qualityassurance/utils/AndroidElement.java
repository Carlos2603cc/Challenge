package com.swaglabsmobileapp.qualityassurance.utils;

import io.appium.java_client.AppiumBy;

public class AndroidElement {

    public static org.openqa.selenium.By Id(String id){
        return AppiumBy.androidUIAutomator("new UiSelector().resourceId(\""+id+"\")");
    }

    public static org.openqa.selenium.By AccesibilityId(String id){
        return new AppiumBy.ByAccessibilityId(id);
    }



}
