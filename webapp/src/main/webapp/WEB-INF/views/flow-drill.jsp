<div align="center" style="width:'100%'; ">
	<div id="tabPanel" class="easyui-tabs" style="width:700px;height:250px" data-options="tabWidth:280, tabHeight: 35">

		<div title="<img align='center' src='resources/images/standard-view.png'/>&nbsp;&nbsp;Standard View" style="padding:5px"> 
			<iframe id="if0" height="99%" width="99%"></iframe>
		</div>
		<div title="<img align='center' src='resources/images/full-view.png'/>&nbsp;&nbsp;Full View" style="padding:5px"> 
			<iframe id="if1" height="99%" width="99%"></iframe>		
		</div>
		
		<div title="<img align='center' src='resources/images/extended-view.png'/>&nbsp;&nbsp;Advanced" style="padding:5px">
			<iframe id="if2" height="99%" width="99%"></iframe>
		</div> 
	</div>
</div>
  
<script type="text/javascript">
	var urls = [
    		"/#/dashboard/Flow-Drill-Standard?_g=(refreshInterval:(display:'Off',pause:!f,section:0,value:0),time:(from:now-30d,mode:quick,to:now))",
    		"/#/dashboard/Flow-Drill-Full?_g=(refreshInterval:(display:'Off',pause:!f,section:0,value:0),time:(from:now-30d,mode:quick,to:now))",
    		"/#/dashboard/Flow-Drill-Extended?_g=(refreshInterval:(display:'Off',pause:!f,section:0,value:0),time:(from:now-30d,mode:quick,to:now))"
	]; 
	 
	$(function() {
		TabManager.config({
			tabId : '#tabPanel',
			tabUrls : urls
		});
	});
</script>