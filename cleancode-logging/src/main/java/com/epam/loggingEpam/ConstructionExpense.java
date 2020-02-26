package com.epam.loggingEpam;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionExpense {
	    private static final Logger logger=LogManager.getLogger(ConstructionExpense.class);
		public static void constructionCost() {
			Scanner sc = new Scanner(System.in);
			logger.debug("Construction cost estimation:");
			logger.debug("Available Materials:");
			logger.debug("1---Standard materials");
			logger.debug("2---Above standard materials");
			logger.debug("3---High standard materials");
			logger.debug("4---High standard materials and fully automated home");
			logger.debug("Choose between 1 and 4: ");
			try {
				int choice = sc.nextInt();
				double area, cost;
				switch(choice) {
					case 1:
						logger.debug("Enter area of house in sq.mts: ");
						area = sc.nextDouble();
						cost = (1200 * area);
						logger.debug("Cost = " +cost+" Rupees");
						break;
					case 2:
						logger.debug("Enter the area of house in sq.mts: ");
						area = sc.nextDouble();
						cost = (1500 * area);
						logger.debug("total cost to build house = " +cost+" Rupees");
						break;
					case 3:
						logger.debug("Enter the area of house in sq.mts: ");
						area = sc.nextDouble();
						cost = (1800 * area);
						logger.debug("total cost to build house = " +cost+ " Rupees");
						break;
					case 4:
						logger.debug("Enter the area of house in sq.mts: ");
						area = sc.nextDouble();
						cost = (2500 * area);
						logger.debug("total cost to build house = " +cost+ " Rupees");
						break;
					default:
						logger.debug("Please enter a valid input!!");
					}
			} catch (Exception e) {
				logger.debug("Please give a valid input!");
				
			}
			finally
			{
				sc.close();
			}
			
			
		}

	}

