package baemin.exception;

import org.apache.log4j.Logger;

public class Log4j {

	private Logger logger = Logger.getLogger(getClass());

	public Logger getInstance() {
		return logger;
	}

}
