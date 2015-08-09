var util = require('util');

var mCommerceTest = function() {
    /*
    this.registerHandler("BeforeFeature", function(event, callback) {
	// console.log(util.inspect(event));
	console.log("digraph " + event.getName() + " {\n");
	callback();
    });
    */

    var stepStack = [];

    this.Before(function(scenario, callback) {
	stepStack.push(scenario.getName());
	callback();
    });

    this.After(function(callback) {
	stepStack.pop();
	callback();
    });

    /*
    this.registerHandler("BeforeStep", function(step, callback) {
	callback();
    });
    */

    this.registerHandler("AfterStep", function(step, callback) {
	stepStack.pop();
	callback();
    });

    this.Given(/^user has less than (\d+) saved address$/, function (
	arg1, callback) {
	var given = "user has less than x saved address";

	console.log('"' + stepStack[stepStack.length - 1] + '" -> "' + given + '"";\n');
	console.log('"' + given + '"" -> ');

	stepStack.push(given);
	callback();
    });

    this.When(/^user chooses "([^"]*)" button$/, function (arg1, callback) {
	var when = "user chooses " + arg1 + " button";
	stepStack.push(when);
	console.log('"' + when + '"";\n');
	console.log('"' + when + '"" -> ');
	callback();
    });

    this.Then(/^validate required fields in shipping address$/, function (callback) {
	var then = "validate required fields in shipping address";
	stepStack.push(then);
	console.log('"' + then + '\n');
	console.log('"' + then + '" -> ');
	callback();
    });

    this.Then(/^validate field format in shipping address$/, function (callback) {
	var then = "validate field format in shipping address";
	stepStack.push(then);
	console.log('"' + then + '";\n');
	console.log('"' + then + '" -> ');
	
	callback();
    });

    this.When(/^user input shipping address with following value$/, function (table, callback) {
	var when = "user input shipping address with following value";
	stepStack.push(when);
	console.log('"' + when + '";\n');
	console.log('"' + when + '" -> ');
	
	callback();
    });

    this.When(/^user clicks "([^"]*)" button$/, function (arg1, callback) {
	var when = "user clicks " + arg1 + " button";
	stepStack.push(when);
	console.log('"' + when + '";\n');
	console.log('"' + when + '" -> ');
	
	callback();
    });

    this.Then(/^system does following required field validation$/, function (table, callback) {
	var then = "system does following required field validation";
	stepStack.push(then);
	console.log('"' + then + '";\n');
	console.log('"' + then + '" -> ');
	
	callback();
    });

    this.Given(/^user has more than (\d+) saved address$/, function (arg1, callback) {
	var given = "user has more than " + arg1 + " saved address";

	console.log('"' + stepStack[stepStack.length - 1] + '" -> "' + given + '"";\n');
	console.log('"' + given + '"" -> ');

	stepStack.push(given);
	
	callback();
    });

    this.When(/^user chooses first address$/, function (callback) {
	var when = "user chooses first address";
	stepStack.push(when);
	console.log('"' + when + '";\n');
	console.log('"' + when + '" -> ');
	
	callback();
    });

    this.When(/^clicks "([^"]*)" button$/, function (arg1, callback) {
	var when = "clicks " + arg1 + " button";
	stepStack.push(when);
	console.log('"' + when + '";\n');
	console.log('"' + when + '" -> ');
	
	callback();
    });

    this.Then(/^a confirm dialog is popped$/, function (callback) {
	var then = "a confirm dialog is popped";
	console.log('"' + then + '";\n');
	
	callback();
    });

    this.Then(/^the dialog is disappeared$/, function (callback) {
	var then = "the dialog is disappeared";
	console.log('"' + then + '";\n');

	callback();
    });

    this.Then(/^the address is deleted$/, function (callback) {
	var then = "the address is deleted";
	console.log('"' + then + '";\n');	
	callback();
    });
};

module.exports = mCommerceTest;
