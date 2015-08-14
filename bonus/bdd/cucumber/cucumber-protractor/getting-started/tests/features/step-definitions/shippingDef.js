var hooks = require('../support/hooks');

var shippingTest = function()  {
    hooks(this);

    this.Given(/^user has less than (\d+) saved addresses$/, function (count, callback) {
	console.log("Should prepare more than 1 and less than " + count + 
		    " addresses for test user in automated test");

	callback();
    });
    
    this.When(/^user chooses "([^"]*)" radio box$/, function (arg1, callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.When(/^user inputs following values on new address form$/, function (callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.When(/^user clicks "([^"]*)" button$/, function (arg1, callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.Then(/^new address is created$/, function (callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.Given(/^user has more than (\d+) saved addresses$/, function (arg1, callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });

    this.When(/^user chooses the first saved address$/, function (callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.When(/^user clicks "([^"]*)" buutton$/, function (arg1, callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });

    this.Then(/^a confirm dialog is poped$/, function (callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });

    this.When(/^user clicks "([^"]*)" on confirm dialog$/, function (arg1, callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.Then(/^the picked address is deleted$/, function (callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.Then(/^the picked address should not deleted$/, function (callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
    
    this.Then(/^browser goes to "([^"]*)" page$/, function (arg1, callback) {
	// Write code here that turns the phrase above into concrete actions
	callback();
    });
};

module.exports = shippingTest;
