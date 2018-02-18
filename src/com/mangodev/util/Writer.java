package com.mangodev.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import com.mangodev.Author;
import com.mangodev.Copyright;
/*
 * @Author Bodie Brewer WITH Mango Development
 * @Copyright 2018 Mango Development, LLC All Rights Reserved
 * This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates
 */
@Copyright(details = "This application may be used by anyone but source code may not be modified and distributed by anyone except Mango Development, LLC or any affiliates", license = "N/A", year = 2018)
@Author(author = "Bodie Brewer")

public class Writer {
	static Logger logger = Logger.getLogger("MyLog");  

	public static Writer SetupLog() {
		Writer writer = new Writer();
		FileHandler fh;  
		try {  
			String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        		// This block configure the logger with handler and formatter  
        		fh = new FileHandler("Systemlog.log");  
        		logger.addHandler(fh);
        		SimpleFormatter formatter = new SimpleFormatter();  
        		fh.setFormatter(formatter);  
        		// the following statement is used to log any messages  
        		logger.info("LOGGING TEST");  
    		} catch (SecurityException e1) { logger.log(Level.SEVERE, "Cannot create logger");
    		} catch (IOException e2) { logger.log(Level.SEVERE, "Cannot create logger"); }  
		return writer;
	}
	public static Logger getLogger() { return logger; }
}
