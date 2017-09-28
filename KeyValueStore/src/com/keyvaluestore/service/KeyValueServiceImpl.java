package com.keyvaluestore.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.keyvaluestore.doa.KeyValueStoreDao;
import com.keyvaluestore.doa.KeyValueStoreDaoImpl;

/**
 * 
 * @author Abi
 * 
 * Class implementing KeyValueService interface. 
 * CURD process of Creating, Updating, Retrieving and Deleting of the 
 * data in Key-Value store using RESTful web service are implemented.
 * 
 */
public class KeyValueServiceImpl implements KeyValueService{

	static KeyValueStoreDao storeDao;

	// Method retrieving all Key-Value Pairs
	@Override
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> getAllKeyValuePair() throws Exception {

		storeDao = new KeyValueStoreDaoImpl();

		Map<String, String> keyValuePairs = new HashMap<String, String>();

		try {
			keyValuePairs = storeDao.getAllKeyValuePairDao();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return keyValuePairs;
	}


	// Method to add a new Key-Value pair to the HashMap
	@Override
	@POST
	@Path("/set")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String populateKeyValueStore(@FormParam("key") String key, @FormParam("value") String value,
			@Context HttpServletResponse servletResponse) throws Exception {

		storeDao = new KeyValueStoreDaoImpl();
		try {
			storeDao.populateKeyValueStoreDao(key, value);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "OK";

	}

	// Method to delete Key-Value Pair using given Key
	@Override
	@DELETE
	@Path("/delete/{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteKVPairUsingKey(@PathParam("key") String key) throws Exception {
		
		storeDao = new KeyValueStoreDaoImpl();
		storeDao.deleteKVPairUsingKeyDao(key);

	}


	// Method to retrieve the Value of given Key
	@Override
	@GET
	@Path("/getvalueof/{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getValueUsingKey(String key) throws Exception {

		storeDao = new KeyValueStoreDaoImpl();
		return storeDao.getValueUsingKey(key);
	}

	// Method to retrieve Key of the given value
	@Override
	@GET
	@Path("/getkeyof/{value}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getKeyUsingValue(String value) throws Exception {

		storeDao = new KeyValueStoreDaoImpl();
		return storeDao.getKeyUsingValue(value);
	}

}
