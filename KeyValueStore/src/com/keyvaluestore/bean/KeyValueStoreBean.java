package com.keyvaluestore.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Abi
 *
 *Data Bean Class encapsulating the rightful entities required for Key-Value Pair
 *Key-Value pair is achieved using collection class Map using HashMap data structure
 *
 */
public class KeyValueStoreBean {

	private String key;
	private String value;
	private Map<String, String> keyValuePair ;
	
	public KeyValueStoreBean(String key, String value) {
		this.key = key;
		this.value = value;
		keyValuePair = new HashMap<>();
		keyValuePair.put(key, value);
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public Map<String, String> getKeyValuePair() {
		return keyValuePair;
	}

	public void setKeyValuePair(Map<String, String> keyValuePair) {
		this.keyValuePair = keyValuePair;
	
	}

}
