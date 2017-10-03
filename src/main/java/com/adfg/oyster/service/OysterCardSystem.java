package com.adfg.oyster.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import com.adfg.oyster.entities.Card;
import com.adfg.oyster.entities.Trip;

/**
 * Oyster card system
 * Provides a way to initialize the system with text files.
 * A new card can be purchased, topped-up and checked for its balance through this interface
 * It also has a method to calculate the fares as per all the taken trips and deducting the applicable amount from the supplied card's balance 
 *
 */
public interface OysterCardSystem {
	
	/**
	 * Purchase new card from Oyster System. User association with card has not been implemented for limited functionality
	 * @param initialAmount
	 * @return
	 */
	Card purchaseNewCard(BigDecimal initialAmount);
	
	/**
	 * Convenience method for extracting stations, zones and fares details from text files. 
	 * In a real world solution, each of these data points would be picked up from a backend system
	 * @param stationsAndZonesFilePath
	 * @param zonesAndFaresFilePath
	 * @throws IOException
	 */
	void initializeSystem(String stationsAndZonesFilePath, String zonesAndFaresFilePath) throws IOException;
	
	/**
	 * Convenience method for extracting List of Trips from a text file, calculate the fares as per all the taken trips and deduct applicable fare 
	 * from the supplied card's balance
	 * To limit the problem, Assumption here is that all these trips are taken one by one and in a permissible time
	 * @param card
	 * @param travelDataFilePath
	 * @throws Exception
	 */
	void takeTrips(Card card, String travelDataFilePath) throws Exception;

	/**
	 * Calculates the fares as per all the taken trips and deducts it from the supplied card's balance
	 * To limit the problem, Assumption here is that all these trips are taken one by one and in a permissible time
	 * @param card
	 * @param trips
	 */
	void takeTrips(Card card, List<Trip> trips);

	/**
	 * Top-up a particular card's balance within the system
	 * @param card
	 * @param topUp
	 */
	void topUp(Card card, BigDecimal topUp);

}