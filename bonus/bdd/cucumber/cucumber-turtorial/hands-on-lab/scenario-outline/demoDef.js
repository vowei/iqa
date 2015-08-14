var test = function() {
   this.Given(/^browse (.*)$/, 
	      function (url, callback) {
   console.log("url: " + url);
   callback();
});

this.When(/^type (.*) and (.*)$/, 
	function (username, password, callback) {
  console.log("username: " + username + ", pwd: " + password);
  callback();
});

};

module.exports = test;
