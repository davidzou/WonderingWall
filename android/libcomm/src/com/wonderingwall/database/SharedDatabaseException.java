package com.wonderingwall.database;


/** 
 * ClassName: SharedDatabaseException <br/> 
 * Function: SharedDatabaseException. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: Sep 15, 2014 11:57:26 PM <br/> 
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version  
 */  
public class SharedDatabaseException extends RuntimeException {
	/***/
	private static final long serialVersionUID = 7972126303816120616L;

	public SharedDatabaseException() {
	}

	public SharedDatabaseException(String detailMessage) {
		super(detailMessage);
	}

	public SharedDatabaseException(Throwable throwable) {
		super(throwable);
	}

	public SharedDatabaseException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}

}
