package com.adfg.oyster.entities;
/**
 * Represents TransporationMode
 * 
 */
public enum TransporationMode {
	
	BUS, TUBE;
	
	public static TransporationMode getValueOf(String mode){
		for(TransporationMode val: TransporationMode.values())
		if(mode!=null && val.name().equalsIgnoreCase(mode)){
			return val;
		}
		return null;
	}
	
}