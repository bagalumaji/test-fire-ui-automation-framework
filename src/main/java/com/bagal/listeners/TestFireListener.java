package com.bagal.listeners;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.bagal.report.ExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import static com.bagal.report.ExtentLogger.*;

public class TestFireListener implements ISuiteListener, ITestListener {
    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
       ExtentReport.flushReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
       ExtentReport.createTest(result.getMethod().getConstructorOrMethod().getMethod().getDeclaredAnnotation(Test.class).description());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        pass( MarkupHelper.createLabel(result.getMethod().getConstructorOrMethod().getMethod().getDeclaredAnnotation(Test.class).description()+ " is passed",ExtentColor.GREEN).getMarkup());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        fail(result.getThrowable().getCause().getMessage());
        fail(MarkupHelper.createLabel(result.getMethod().getConstructorOrMethod().getMethod().getDeclaredAnnotation(Test.class).description()+ " is failed", ExtentColor.RED).getMarkup());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        skip(MarkupHelper.createLabel(result.getMethod().getConstructorOrMethod().getMethod().getDeclaredAnnotation(Test.class).description()+ " is skipped",ExtentColor.YELLOW).getMarkup());
    }
}
