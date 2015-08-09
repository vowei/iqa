cordova.define("cordova/plugins/PGBdLocation", 
  function(require, exports, module) {
    var exec = require("cordova/exec");
    var PGBdLocation = function() {};
     
	  PGBdLocation.prototype.getlocation = function(successCallback, errorCallback) {
        if (errorCallback == null) { errorCallback = function() {}}    
        if (typeof errorCallback != "function")  {
            console.log("PGBdLocation failure: failure parameter not a function");
            return
        }
        if (typeof successCallback != "function") {
            console.log("PGBdLocation failure: success callback parameter must be a function");
            return
        }
        
        exec(successCallback, errorCallback, 'PGBdLocation', 'getlocation', []);
    };
	
	  PGBdLocation.prototype.stoploc = function(successCallback, errorCallback) {
        if (errorCallback == null) { errorCallback = function() {}}    
        if (typeof errorCallback != "function")  {
            console.log("PGBdLocation failure: failure parameter not a function");
            return
        }
        if (typeof successCallback != "function") {
            console.log("PGBdLocation failure: success callback parameter must be a function");
            return
        }
        exec(successCallback, errorCallback, 'PGBdLocation', 'stoploc', []);
    };
		
    var PGBdLocation = new PGBdLocation();
    module.exports = PGBdLocation;

});

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.PGBdLocation) {
    window.plugins.PGBdLocation = cordova.require("cordova/plugins/PGBdLocation");
}
