var util = require('util');

var hooksTest = function() {
    this.Before(function(callback) {
	console.log("Before running the scenario");
	callback();
    });

    this.After(function(callback) {
	console.log("After running the scenario");
	callback();
    });

    this.registerHandler("AfterFeature", function(event, callback) {
	console.log("After feature is running");
	callback();
    });

    this.registerHandler("BeforeFeature", function(event, callback) {
	console.log("Before feature is running, with event: \n" + util.inspect(event) + 
		    "\ncallback: \n" + util.inspect(callback));
	callback();
    });

    this.registerHandler("BeforeStep", function(event, callback) {
	console.log("running " + event.getName());
	callback();
    });

    /*
    this.Around(function(scenario) {
	console.log("[Around] before running scenario: \n" + util.inspect(scenario) + "\n");
	
	scenario(function(callback) {
	    console.log("[Around] after running scenario");
	    callback();
	});
    });
    */

    this.Given(/^this step is (\w+)$/, function (result, next) {
	if ( result == "passed" ) {
	    console.log("running a passed step");
	    next();
	} else {
	    next.fail(new Error("this step is failed"));
	}
    });
}

module.exports = hooksTest;
