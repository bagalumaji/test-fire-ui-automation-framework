package com.bagal.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bagal.constants.TestFireConstants;

import java.util.Objects;

public final class ExtentReport {
    private ExtentReport(){}
    private static ExtentReports extentReports;

    public static void initReport(){
        if(Objects.isNull(extentReports)){
            extentReports = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(TestFireConstants.getExtentReportFilePath());
            sparkReporter.config().setReportName(TestFireConstants.getExtentReportName());
            sparkReporter.config().setDocumentTitle(TestFireConstants.getDocumentTitle());
            sparkReporter.config().setTheme(Theme.DARK);
            extentReports.attachReporter(sparkReporter);
        }
    }

    public static void createTest(String testCaseName){
         extentReports.createTest(testCaseName);
    }
    public static void flushReport(){
        if(Objects.nonNull(extentReports)){
            extentReports.flush();
        }
    }
}
