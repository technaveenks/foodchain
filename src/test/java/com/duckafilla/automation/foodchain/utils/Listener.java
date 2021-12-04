package com.duckafilla.automation.foodchain.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener implements ITestListener{
	protected static ExtentReports reports;
	protected static ExtentTest test;
	protected ExtentSparkReporter spark;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" Test Started ");
		test = reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(" Test Success ");
		test.log(Status.PASS, "Test " + result.getMethod().getMethodName()+" Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" Test Failed ");
		test.log(Status.FAIL, "Test " + result.getMethod().getMethodName()+" FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Test Skipped ");
		test.log(Status.FAIL, "Test " + result.getMethod().getMethodName()+" FAILED");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(" On start of Test ");
		reports = new ExtentReports();
		spark = new ExtentSparkReporter(
				"target/" + new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms").format(new Date()) + "-reports.html");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(" On FInish of test ");
		reports.attachReporter(spark);
		reports.flush();
	}

}
