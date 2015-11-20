var resizer = new NetviserResizer();

function NetviserResizer() {
	var callbacks = [];
	
	this.addResizer = function(fn) {
		callbacks.push(fn);
	};
	
	this.resize = function() {
		for (i in callbacks) {
			callbacks[i]();
		}
	};
}

$(function(){
	
    $(window).resize(function(){
    	resizer.resize();
    });
});



