package com.keyvaluestore.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Abi
 *
 * Interface providing unimplemented methods perform various CURD process using RESTful web services.
 */
public interface KeyValueService {

	public abstract Map<String, String> getAllKeyValuePair() throws Exception;
	public abstract String populateKeyValueStore(String key, String value, HttpServletResponse servletResponse) throws Exception; 
	public abstract void deleteKVPairUsingKey(String key) throws Exception;
	public abstract String getValueUsingKey(String key) throws Exception;
	public abstract String getKeyUsingValue(String value) throws Exception;
}
