package com.wonderingwall.log;

import java.io.File;
import java.io.FileNotFoundException;

import android.os.Environment;

/**
 * Log4j配置文件<br>
 * <em>To used how print logs:</em>
 * <pre>
 * import org.apache.log4j.Logger;
 * public class ExampleLog4J {
 *     private final Logger log = Logger.getLogger(ExampleLog4J.class);
 *     public void myMethod() {
 *         log.info("This message should be seen in log file and logcat");
 *     }
 * }
 * </pre>
 * @author DavidZou  2014-1-4上午11:31:45
 * @email spt_genius@hotmail.com
 */
public class Log4jConfiguare {
	/**
	 * Default path used log.
	 */
	private static final String FILE_NAME = "wonderingwall/log/default.log";
	
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @throws FileNotFoundException 
	 */ 
	public static void configure() throws FileNotFoundException {
		final de.mindpipe.android.logging.log4j.LogConfigurator logConfigurator = new de.mindpipe.android.logging.log4j.LogConfigurator();
		logConfigurator.setFileName(Environment.getExternalStorageDirectory() + File.separator + FILE_NAME);
		logConfigurator.setRootLevel(org.apache.log4j.Level.DEBUG);
		// Set log level of a specific logger
		logConfigurator.setLevel("org.apache", org.apache.log4j.Level.ERROR);
		logConfigurator.configure();
	}
	
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param path		How to saved where you can. example: "log\log.txt"
	 * @throws FileNotFoundException 
	 */ 
	public static void configure(String path) throws FileNotFoundException {
		final de.mindpipe.android.logging.log4j.LogConfigurator logConfigurator = new de.mindpipe.android.logging.log4j.LogConfigurator();
		logConfigurator.setFileName(Environment.getExternalStorageDirectory() + File.separator + path);
		logConfigurator.setRootLevel(org.apache.log4j.Level.DEBUG);
		// Set log level of a specific logger
		logConfigurator.setLevel("org.apache", org.apache.log4j.Level.ERROR);
		logConfigurator.configure();
	}
}
