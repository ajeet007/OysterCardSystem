package com.adfg.oyster.entities;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
/**
 * Represents Fare. It also has mapping of all those zones where it may be applicable
 * 
 */
public class Fare {
	
	private Set<Zone> zones = new HashSet<>();
	private BigDecimal amount;
	private boolean isGenericFare;
	
	public Fare(Set<Zone> zones, BigDecimal amount, boolean isGenericFare) {
		super();
		this.zones = zones;
		this.amount = amount;
		this.isGenericFare = isGenericFare;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Set<Zone> getZones() {
		return zones;
	}

	public boolean isGenericFare() {
		return isGenericFare;
	}
	
}