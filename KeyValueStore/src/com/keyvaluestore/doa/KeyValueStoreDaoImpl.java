package com.keyvaluestore.doa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.keyvaluestore.bean.KeyValueStoreBean;

/**
 * 
 * @author Abi
 * 
 * Class implementing KeyValueStoreDao interface. 
 * CURD process of Creating, Updating, Retrieving and 
 * Deleting of the data in Key-Value store are implemented.
 * 
 */
public class KeyValueStoreDaoImpl implements KeyValueStoreDao{

	static KeyValueStoreBean keyValueBean;
	static Map<String, String> keyValueDoa = new HashMap<>();

	// Method retrieving all Key-Value Pairs
	@Override
	public Map<String, String> getAllKeyValuePairDao() throws Exception {

		return keyValueDoa;
	}

	// Method to add a new Key-Value pair to the HashMap
	@Override
	public void populateKeyValueStoreDao(String key, String value) throws Exception {
		
		if(keyValueDoa.size() == 0){
			keyValueBean = new KeyValueStoreBean(key, value);
			keyValueDoa = keyValueBean.getKeyValuePair();
		}
		else{
			keyValueDoa.put(key, value);
		}
	}

	// Method to delete Key-Value Pair using given Key
	@Override
	public void deleteKVPairUsingKeyDao(String key) throws Exception {

		if(keyValueDoa.containsKey(key)){
			keyValueDoa.remove(key);
		}
	}


	// Method to retrieve the Value of given Key
	@Override
	public String getValueUsingKey(String key) throws Exception {

		String value = "NO KEY FOUND";
		if(keyValueDoa.containsKey(key)){
			value = new String(keyValueDoa.get(key));
		}
		return value;
	}

	// Method to retrieve the Key of given Value
	@Override
	public String getKeyUsingValue(String value) throws Exception {
		// TODO Auto-generated method stub

		String key = "NO KEY FOUND";
		for (Iterator<Map.Entry<String, String>> iterator = keyValueDoa.entrySet().iterator();iterator.hasNext();) 
		{
			Map.Entry<String,String> entry = iterator.next();
			if(entry.getValue() == value)
			{
				key = new String(entry.getKey());
			}
		}
		return key;
	}

}
