package com.pluribus.rocketflow.elasticsearch;

import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.ConnectionEventBundle;

// To be deleted.
public abstract class ElasticSearchStore extends EventObserver<ConnectionEventBundle> {
/*	
	private static Logger logger = Logger.getLogger(ElasticSearchStore.class);

	public final static int DEFAULT_MAX_BULK_SIZE = 2000;
	public final static String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	public final static String DOCUMENT_TYPE = "connection";

	// ES client
	private InetAddress elasticSearchServer;
	private int elasticSearchPort;
	
	private TransportClient esClient;
	private SimpleDateFormat sdf;

	@PostConstruct
	private void connect() throws UnknownHostException, IOException {
		// Set the timezone to UTC
		sdf = new SimpleDateFormat(TIMESTAMP_FORMAT);
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

	    elasticSearchServer = InetAddress.getByName("127.0.0.1");
		elasticSearchPort = 9300;
		
		Settings settings = ImmutableSettings.settingsBuilder()
                .put("cluster.name", "netviser")
                .put("client.transport.sniff", true)
                .build();
		
		esClient = new TransportClient(settings);
		esClient.addTransportAddress(new InetSocketTransportAddress(elasticSearchServer, elasticSearchPort));
	}

	@Override
	public void onEvent(ConnectionEventBundle event) throws Exception {
		String indexName = "fabric-" + event.getFabricName();
		// check if the index already exists
		IndicesExistsResponse res = esClient.admin().indices().prepareExists(indexName).execute().actionGet();
		if (!res.isExists()) {
			CreateIndexRequestBuilder createIndexRequestBuilder = esClient.admin().indices().prepareCreate(indexName);
			try {
				
				XContentBuilder mappingBuilder = jsonBuilder().prettyPrint()
		                .startObject()
		                    .startObject("connection")
		                        .startObject("properties")
		                            .startObject("bytesTotal").field("type", "integer").field("index", "not_analyzed").endObject()
		                        .endObject()
		                    .endObject()
		                .endObject();
				
				logger.info("ES mapping= " + mappingBuilder.prettyPrint().string());
				createIndexRequestBuilder.addMapping(DOCUMENT_TYPE, mappingBuilder);
	
				// MAPPING DONE
				CreateIndexResponse cir = createIndexRequestBuilder.execute().actionGet();
				cir.isAcknowledged();
			} catch (Throwable ex) {
				ex.printStackTrace();
			}

		}
		
		Node node = event.getContext().getNode(event.getSwitchId());
		
		List<Conn> conns = event.getConns();
		
		if (conns.size() > 0) {
			BulkRequestBuilder bulk = esClient.prepareBulk();
			for (Conn conn : conns) {
				processLogEvent(esClient, bulk, node.getName(), conn, indexName);
			}
			bulk.execute().actionGet();
		}
	}


	public void deleteIndex(String index) {
		DeleteIndexResponse delete = esClient.admin().indices().delete(new DeleteIndexRequest(index)).actionGet();
		if (!delete.isAcknowledged()) {
			logger.error("Index wasn't deleted");
		}
	}

	protected String formatTimestamp(long time) {
		return sdf.format(new Date(time));
	}

	private ObjectMapper mapper = new ObjectMapper(); // create once, reuse

	protected void processLogEvent(TransportClient esClient, BulkRequestBuilder bulk, String switchName, Conn conn, String indexName) throws IOException {

		Map<String, String> json = new HashMap<String, String>(20);
		json.put("fabric", "na");
		json.put("switch", switchName);
		json.put("vnet", conn.getVnet());
		json.put("vlan", Integer.toString(conn.getVlan()));
		json.put("bytesTotal", Long.toString(conn.getBytesTotal()));
		json.put("state", conn.getState().name());
		json.put("srcIp", conn.getClientIpStr());
		json.put("srcPort", conn.getClientPortString());
		json.put("dstIp", conn.getServerIpStr());
		json.put("dstPort", conn.getServerPortString());
		json.put("proto", conn.getProtoString());
		json.put("startTime", formatTimestamp(conn.getStartedTime().getTime()));

		// extra keys
		json.put("flowlocator", ConnUtil.generateFlowLocator("na", conn));

		try {
			String str = mapper.writeValueAsString(json);
			bulk.add(esClient.prepareIndex(indexName, DOCUMENT_TYPE).setSource(str));
		} catch (Throwable t) {
			t.printStackTrace();
		}

	}
*/
}
