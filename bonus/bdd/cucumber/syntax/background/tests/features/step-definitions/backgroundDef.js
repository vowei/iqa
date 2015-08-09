var util = require('util');

var backgroundTest = function() {
    var world = {};

    this.Given(/^there is a user "(\w+)" with password "(\w+)"$/, function (username, password, next) {
	console.log("preparing user \"" + username + "\" in the database");
	world.username = username;
	world.password = password;
        next();
    });

    this.Given(/^user log on$/, function (next) {
	console.log("user log on with user name: \"" + world.username + "\"");
        next();
    });
}

module.exports = backgroundTest;
