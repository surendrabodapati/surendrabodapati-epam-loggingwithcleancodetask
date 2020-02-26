package com.epam.loggingEpam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

	import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

	public class InterestCalculation {
		
		private static final Logger logger=LogManager.getLogger(InterestCalculation.class);

		public static void InterestCalculation() {
			Scanner sc = new Scanner(System.in);
			    logger.debug("Enter principle amount in Rupees: ");
			try {
				double principal = sc.nextDouble();
				logger.debug("Enter time in years :");
				double timePeriod = sc.nextDouble();
				logger.debug("Enter rate :");
				double rate = sc.nextDouble();
				logger.debug("simple interest = " +((principal * timePeriod * rate) / 100));
				logger.debug("compound interest = " +((principal * Math.pow(1 + (rate / 100), timePeriod)) - principal));
				
			} catch (Exception e) {
				logger.debug("Please enter a valid input!");
				
			}
		}
			
	}


