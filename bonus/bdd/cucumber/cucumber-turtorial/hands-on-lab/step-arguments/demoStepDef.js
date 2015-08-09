var util = require("util");

var demoTest = function() {
   this.When(/^current page is$/, 
	function (url, next) {
	console.log("browsing page: " + url);
	next();
   });

   this.Then(/^type access credentials$/, 
	function (table, next) {
	console.log("table: \n" + 
            util.inspect(table));
	
       var rows = table.rows();
       console.log("type username: " +
                   rows[0][0] + ", " +
                   "passwrod: " +
                   rows[0][1]);
       next();
   });

};

module.exports = demoTest;
