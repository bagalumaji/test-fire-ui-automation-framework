package com.bagal.listeners;

import com.bagal.configs.TestFireConfigReader;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private int retryCount=0;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(TestFireConfigReader.getTestFireConfigs().retry()){
            if(!iTestResult.isSuccess()){
                if(retryCount<TestFireConfigReader.getTestFireConfigs().retryCount()){
                    retryCount++;
                    return true;
                }
            }
        }
        return false;
    }
}
