var robot = require("./robot"),
    util = require('util');

var hooks = function(test) {
    var username = "1234567";
    var password = "a11111";
    var url = "http://192.168.33.10";
    var r = robot('firefox');

    test.registerHandler("BeforeFeature", function(event, callback) {
	r.browser.ignoreSynchronization = false;

	/*
	r.browser.get(url).then(function(result){
	    setTimeout(callback, 1000);
	});
	*/

	r.browser.get(url).then(function(result) {
	    setTimeout(function() {
		var goButton = r.browser.findElement({id: 'btn-login'});  
		r.browser.findElement({id: 'btn-pick-login'}).click();
		// r.browser.findElement(r.by.id('btn-pick-login')).click();
		r.browser.findElement(r.by.model('credentials.username')).sendKeys('1234567');
		r.browser.findElement(r.by.model('credentials.password')).sendKeys('a11111');
		goButton.click();

		callback();
	    }, 2000);
	});
    });

    test.registerHandler("AfterFeature", function(event, callback) {
	r.quit(callback);
    });
};

module.exports = hooks;
