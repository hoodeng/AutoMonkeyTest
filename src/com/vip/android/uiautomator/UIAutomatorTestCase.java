package com.vip.android.uiautomator;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by wudeng on 17/6/15.
 */
public class UIAutomatorTestCase extends UiAutomatorTestCase {


    public void testDemo(){
        System.out.println("testDemo()");
        UiDevice uiDevice = getUiDevice();
//        uiDevice.pressHome();
        String activity = uiDevice.getCurrentActivityName();
        System.out.println("activity name --> " + activity);
    }

//    public void testStartActivity(){
//        System.out.println("testStartActivity()");
//    }

    public void testFindButton(){
        System.out.println("testFindButton()");
        UiDevice uiDevice = getUiDevice();
        UiObject buttonA = new UiObject(new UiSelector().text("A"));
        try {
            buttonA.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private boolean startActivity(String activity){
        return false;
    }
}
