package com.bagal.listeners;

import com.bagal.report.ExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestFireListener implements ISuiteListener{
    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
       ExtentReport.flushReport();
    }
}
