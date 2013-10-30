package com.dbfconsult.slf4josgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingBundle implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(LoggingBundle.class);

	public void start(BundleContext context) throws Exception {
		logger.info("start method: INFO message");
		logger.error("start method: ERROR message");
	}

	public void stop(BundleContext context) throws Exception {
		logger.info("stop method: INFO message");
		logger.error("stop method: ERROR message");
	}

}
