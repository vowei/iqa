var test = function() {
        var self = this;
        var product = require("./product-code.js");

	this.When(/^I type "([^"]*)"$/, function (input, callback) {
          self.input = input
	  callback();
	});

	this.Then(/^should match$/, function (callback) {
          if ( product(self.input) ) { 
               console.log("SUCCESS");
          } else {
               callback.fail(self.input + " is not a floating number");
               // console.log("FAIL");
          }
 	  callback();
	});
}

// This is the javascript step definition library for cucumber features.
module.exports = test;
