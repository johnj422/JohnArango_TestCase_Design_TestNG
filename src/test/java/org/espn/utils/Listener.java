package org.espn.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.tinylog.Logger;

public class Listener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        Logger.info("Test " + result.getName() + "[PASSED]");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Logger.error("Test " + result.getName() + "[FAILED]");
    }
}
