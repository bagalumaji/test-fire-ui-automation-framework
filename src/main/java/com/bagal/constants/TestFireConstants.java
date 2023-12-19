package com.bagal.constants;

import lombok.Getter;

public final class TestFireConstants {
    private TestFireConstants(){}

    private static final String BASE_PATH=System.getProperty("user.dir");
    private static final @Getter String extentReportFilePath = BASE_PATH+"/target/report/index.html";
    private static final @Getter String extentReportName="Automation Regression Test Report";
    private static final @Getter String documentTitle = "Automation Test Report - Umaji Bagal";
}
