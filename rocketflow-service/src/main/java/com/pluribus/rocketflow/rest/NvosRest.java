package com.pluribus.rocketflow.rest;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class NvosRest {
	public static Logger logger = Logger.getLogger(NvosRest.class);
	public String authorization = "Basic bmV0d29yay1hZG1pbjp0ZXN0MTIz";
	public String restHost = "aquila02";
	public int restPort = 80;

	public NvosRest() {
		// Use all default values;
	}

	public NvosRest(String restHostname, int restPort, String authorization) {
		this.restHost = restHostname;
		this.restPort = restPort;
		this.authorization = authorization;
	}

	/**
	 * Gets the switch nodes in the fabric.
	 * @return
	 */
	public List<NvosFabricNode> getFabricNodes() {
	   	logger.debug("getFabricNodes");
	   	String url = "http://" + restHost + ":" + restPort + "/vRest/fabric-nodes";
	   	return _callRemote(url, new ParameterizedTypeReference<NvosResponse<NvosFabricNode>>() {});
	}

	public List<NvosConnection> getConnections(long switchId, NvosConnection filter) {
	   	logger.debug("getConnections");
		String filterString = "";
		filterString = NvosRestUtil.getRestFilterString(filter);
	   	String url = "http://" + restHost + ":" + restPort + "/vRest/connections?limit-output=2000&api.switch=" + switchId + filterString;
	   	return _callRemote(url, new ParameterizedTypeReference<NvosResponse<NvosConnection>>() {});
	}

	private <T> List<T>_callRemote(String url, ParameterizedTypeReference<NvosResponse<T>> ptr) {
	    RestTemplate restTemplate = new RestTemplate();

	    HttpHeaders headers = new HttpHeaders();
	    headers.set("authorization", this.authorization);
	    HttpEntity<Object> entity = new HttpEntity<Object>(headers);

	    ResponseEntity<NvosResponse<T>> re =
	    		restTemplate.exchange(url,
	        		HttpMethod.GET,
	        		entity,
	        		ptr);

	    return Arrays.asList(re.getBody().getData());
	}

}
