package com.cjc.Testclass;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Demoisuit implements ISuiteListener {
public void onStart(ISuite c) {
	System.out.println("on start ");
}
public void onFinish(ISuite c) {
	System.out.println("on finish");
}
}
