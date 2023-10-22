package com.bagal.report;

public final class ExtentLogger {
    private ExtentLogger(){}
    public static void info(String message){
        ExtentManager.getExtentTest().info(message);
    }
    public static void pass(String message){
        ExtentManager.getExtentTest().pass(message);
    }
    public static void fail(String message){
        ExtentManager.getExtentTest().fail(message);
    }
    public static void skip(String message){
        ExtentManager.getExtentTest().skip(message);
    }
}
