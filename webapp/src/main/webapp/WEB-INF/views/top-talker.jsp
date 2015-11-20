<div align="center" style="width:'100%'; ">
	<div id="tabPanel" class="easyui-tabs" style="width:700px;height:250px" data-options="tabWidth:280, tabHeight: 35">

		<div title="<img align='center' src='resources/images/connection.png'/>&nbsp;&nbsp;Top Conversations by Connections" style="padding:5px"> 
			<iframe id="if0" height="99%" width="99%"></iframe>
		</div>
		<div title="<img align='center' src='resources/images/data.png'/>&nbsp;&nbsp;Top Conversations by Bytes" style="padding:5px"> 
			<iframe id="if1" height="99%" width="99%"></iframe>		
		</div>
		
		<div title="<img align='center' src='resources/images/throughput.png'/>&nbsp;&nbsp;Top Conversation by Throughput" style="padding:5px">
			<iframe id="if2" height="99%" width="99%"></iframe>
		</div>
	</div>
</div>

<script type="text/javascript">
	var urls = [
			"/#/dashboard/Top-Talkers-Top-Clients-by-Connections?embed&_g=(refreshInterval:(display:'60%20seconds',pause:!f,section:1,value:60000),time:(from:now-24h,mode:quick,to:now))",
			"/#/dashboard/Top-Talkers-Top-Clients-by-Bytes?embed&_g=(refreshInterval:(display:'60%20seconds',pause:!f,section:1,value:60000),time:(from:now-24h,mode:quick,to:now))",
			"/#/dashboard/Top-Talkers-Top-Clients-by-Throughput?embed&_g=(refreshInterval:(display:'60%20seconds',pause:!f,section:1,value:60000),time:(from:now-24h,mode:quick,to:now))" 
	];

	/** 
		Resize tab when window resizes
	 */
	$(function() {
		TabManager.config({
			tabId : '#tabPanel',
			tabUrls : urls
		});
	});
</script>
