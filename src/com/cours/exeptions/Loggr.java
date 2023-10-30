package com.cours.exeptions;

import java.util.logging.ConsoleHandler;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loggr {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(Loggr.class.getName());

		// logger.config("configuration information");
		// logger.severe("serious failure");
		// logger.log(Level.INFO, "This is INFO log level message");
		// logger.warning("This is WARNING log level message");
		// logger.info("This is info log level messages");
		logger.log(Level.CONFIG, "configuration information");
		logger.log(Level.FINER, "general developer information (tracing messages)");

		// filters
		Filter filter = logger.getFilter();
		logger.setFilter(filter);

		Handler handler = new ConsoleHandler();
		logger.addHandler(handler);

		/*
		 * Avantages de la journalisation Voici quelques-uns des avantages de la
		 * connexion en Java.
		 * 
		 * aide à surveiller le déroulement du programme aide à capturer les erreurs qui
		 * peuvent survenir fournit une assistance pour le diagnostic des problèmes et
		 * le débogage
		 */

	}

}
