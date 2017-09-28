package com.keyvaluestore.doa;

import java.util.Map;

/**
 * @author Abi
 * 
 * Interface proving unimplemented methods to perform CURD operations on existing Key-Values store.
 * 
 */
public interface KeyValueStoreDao {

	public abstract Map<String, String> getAllKeyValuePairDao() throws Exception;
	public abstract void populateKeyValueStoreDao(String key, String value) throws Exception; 
	public abstract void deleteKVPairUsingKeyDao(String key) throws Exception;
	public abstract String getValueUsingKey(String key) throws Exception;
	public abstract String getKeyUsingValue(String value) throws Exception;
	
}
