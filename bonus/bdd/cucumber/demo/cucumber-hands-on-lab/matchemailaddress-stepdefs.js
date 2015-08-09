var test = function() {
        var self = this;

	this.When(/^I type "([^"]*)"$/, function (input, callback) {
          self.input = input
	  callback();
	});

	this.Then(/^should match$/, function (callback) {
          var reg = /\w+@\w+(\.\w{2,3}){1,2}/;
          if ( reg.test(self.input) ) { 
               console.log("SUCCESS");
          } else {
               callback.fail(self.input + " is not an valid email address");
          }
 	  callback();
	});
}

// This is the javascript step definition library for cucumber features.
module.exports = test;
