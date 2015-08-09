 var Toast= function() {
};
 
Toast.prototype .LENGTH_SHORT = 0;
Toast.prototype .LENGTH_LONG = 1;
 
Toast.prototype .show = function (msg, duration ,successCallback, failureCallback){
     return cordova.exec(
           successCallback,   
           failureCallback,    
            'ToastPlugin',
            null,             
           [msg, duration]       
     );
};
 
//Short Toast
Toast.prototype .shortshow = function (msg,successCallback, failureCallback){    
     this.show(msg, this.LENGTH_SHORT ,successCallback, failureCallback);
};
 
//Long Toast
Toast.prototype .longshow = function (msg,successCallback, failureCallback){    
     this.show(msg, this.LENGTH_LONG ,successCallback, failureCallback);
};
 
cordova.addConstructor(function() {
    if (!window.plugins) {
           window.plugins = {};
     }
     window.plugins.toast = new Toast();
});