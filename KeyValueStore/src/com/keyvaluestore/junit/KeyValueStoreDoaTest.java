package com.keyvaluestore.junit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.keyvaluestore.bean.KeyValueStoreBean;
import com.keyvaluestore.doa.KeyValueStoreDaoImpl;

/**
 * 
 * @author Abi
 *
 * JUnit Test cases covering all DAO implementation of Key-Value store are implemented.
 * 
 */
public class KeyValueStoreDoaTest {

	KeyValueStoreDaoImpl keyValueStoreDoa = new KeyValueStoreDaoImpl();
	KeyValueStoreBean keyValueBean;
	
	@Test
	public void testGetAllKeyValuePairDao() throws Exception {

		keyValueStoreDoa = new KeyValueStoreDaoImpl();
		
		Map<String, String> keyValueTest = new HashMap<>();
		keyValueTest.put("Key1", "Value1");
		keyValueTest.put("Key2", "Value2");
		
		keyValueStoreDoa.populateKeyValueStoreDao("Key1", "Value1");
		keyValueStoreDoa.populateKeyValueStoreDao("Key2", "Value2");
		
		assertEquals(keyValueTest,keyValueStoreDoa.getAllKeyValuePairDao());
		 
	}

	@Test
	public void testPopulateKeyValueStoreDao() throws Exception {
		
		keyValueStoreDoa.populateKeyValueStoreDao("Key1", "Value1");
		assertEquals(2,keyValueStoreDoa.getAllKeyValuePairDao().size());
		keyValueStoreDoa.populateKeyValueStoreDao("Key3", "Value3");
		assertEquals(3,keyValueStoreDoa.getAllKeyValuePairDao().size());
		 
	}

	@Test
	public void testDeleteKVPairUsingKeyDao() throws Exception {
		
		keyValueStoreDoa.deleteKVPairUsingKeyDao("Key3");
		assertEquals(2,keyValueStoreDoa.getAllKeyValuePairDao().size());
		
	}

	@Test
	public void testDeleteKVPairUsingValueDao() throws Exception {
		
		keyValueStoreDoa.deleteKVPairUsingKeyDao("Value1");
		assertEquals(0,keyValueStoreDoa.getAllKeyValuePairDao().size());
		
	}

	@Test
	public void testGetValueUsingKey() throws Exception {
		
		keyValueStoreDoa.populateKeyValueStoreDao("Key1", "Value1");
		String key = "Key1";
		assertEquals("Value1",keyValueStoreDoa.getValueUsingKey(key));
		
	}

	@Test
	public void testGetKeyUsingValue() throws Exception {
		
		String value = "Value1";
		assertEquals("Key1",keyValueStoreDoa.getKeyUsingValue(value));
		
	}

}
