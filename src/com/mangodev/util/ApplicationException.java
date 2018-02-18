package com.mangodev.util;

import java.io.FileWriter;
import java.util.logging.Logger;

import com.mangodev.Author;
import com.mangodev.Copyright;
import com.mangodev.Main;
import com.mangodev.crash.CrashReport;
/*
 * @Author Bodie Brewer WITH Mango Development
 * @Copyright 2018 Mango Development, LLC All Rights Reserved
 * This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates
 */
@Copyright(details = "This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates", license = "N/A", year = 2018)
@Author(author = "Bodie Brewer")

public class ApplicationException extends Exception{
	private static final long serialVersionUID = -8799570134192073600L;
	public ApplicationException(CrashReport report) {
		Logger logger = Main.writer.getLogger();
		logger.severe(report.getCompleteReport());
	}
}
