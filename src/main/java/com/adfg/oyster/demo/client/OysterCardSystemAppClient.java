package com.adfg.oyster.demo.client;

import java.math.BigDecimal;

import com.adfg.oyster.entities.Card;
import com.adfg.oyster.service.OysterCardSystem;
import com.adfg.oyster.service.impl.OysterCardSystemImpl;

/**
 * This is a client side code for OysterCardSystem
 * 
 */
public class OysterCardSystemAppClient {

	private static final String ZONES_AND_FARES_TXT = "zonesAndFares.txt";
	private static final String STATIONS_AND_ZONES_TXT = "stationsAndZones.txt";
	private static final String TRAVEL_DATA_TXT = "travelData.txt";
	private OysterCardSystemAppClient(){}
	
	public static void main(String args[]) throws Exception {
		
		OysterCardSystem oysterCardSystemManager = new OysterCardSystemImpl();
		oysterCardSystemManager.initializeSystem(STATIONS_AND_ZONES_TXT, ZONES_AND_FARES_TXT);

		System.out.println("*********************************************************************************************************************");
		Card card = oysterCardSystemManager.purchaseNewCard(BigDecimal.valueOf(0.0));
		// Above might have happened long ago as well. This is just done to show system working from scratch.
		
		System.out.println("*********************************************************************************************************************");
		BigDecimal topUp = new BigDecimal(30);
		oysterCardSystemManager.topUp(card, topUp);
		System.out.println("*********************************************************************************************************************");
		
		oysterCardSystemManager.takeTrips(card, TRAVEL_DATA_TXT);
		
		System.out.println("*********************************************************************************************************************");
		System.out.println("All trips completed. "+card);
	}

}