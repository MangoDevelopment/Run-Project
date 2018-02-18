package com.mangodev;

import java.io.FileWriter;
import java.io.IOException;

import com.mangodev.MainClass.AccessLevel;
import com.mangodev.crash.CrashReport;
import com.mangodev.util.ApplicationException;
import com.mangodev.util.Writer;
/*
 * @Author Bodie Brewer WITH Mango Development
 * @Copyright 2018 Mango Development, LLC All Rights Reserved
 * This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates
 */
@Copyright(details = "This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates", license = "N/A", year = 2018)
@Author(author = "Bodie Brewer")
@MainClass(author = "MANGO DEVELOPMENT", version = "1.0 Alpha", reviewers = { "null" }, accessLevel = AccessLevel.PUBLIC)
public class Main {
	public static Writer writer = Writer.SetupLog();
	public static void main(String[] args) {
		try {
			PreInit.run();
			Init.run();
			PostInit.run();
		} catch(Exception e) {
			CrashReport report = CrashReport.makeCrashReport(e, "MAIN COULD NOT RUN");
			// Will run both the Try and the Catch block because it catches the exception that was thrown by the try
			try {
				throw new ApplicationException(report);
			} catch (ApplicationException e1) {
				e1.printStackTrace();
			}
		}
	}
}
	
