var util = require('util');

var tagHooksTest = function() {
    this.Before("@bvt", function(scenario, next) {
	console.log("before running @bvt scenario: " + scenario.getName());
	next();
    });

    this.After("@bvt,@压力测试", function(scenario, next) {
	console.log("After running @bvt and @压力测试 scenario: " + scenario.getName());
	next();
    });

    this.When(/^run scenario "([^"]+)"$/, function(name, callback) {
	console.log("run scenario: " + name);
	callback();
    });

    this.Given(/^this step is (\w+)$/, function (result, next) {
	if ( result == "passed" ) {
	    console.log("running a passed step");
	    next();
	} else {
	    next.fail(new Error("this step is failed"));
	}
    });
}

module.exports = tagHooksTest;
