package com.Com.OrangeHRM.Utilities;

import java.util.logging.Logger;



public class Log {
	public static Logger Log = Logger.getLogger(Log.class.getName());

	public static void startTestCase(String sTestCaseName){		  
		 Log.info("====================================="+sTestCaseName+" TEST START=========================================");
		 }
	
	public static void endTestCase(String sTestCaseName){
		Log.info("====================================="+sTestCaseName+" TEST END=========================================");
		 }
	
	// Need to create below methods, so that they can be called  

	 public static void info(String message) {

			Log.info(message);

			}

	 public static void warn(String message) {

	    Log.warning(message);

		}

	 

}


