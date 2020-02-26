package com.epam.loggingEpam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static final Logger logger=LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		logger.debug("Now Fetching Interest Detais For You");
		InterestCalculation.InterestCalculation();
		logger.debug("Now Showing Construction Prices For You");
		ConstructionExpense.constructionCost();
		logger.debug("Thank you For Using Application");
	}

}
