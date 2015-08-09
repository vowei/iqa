var util = require('util');

var stepArgumentTest = function() {
    this.Given(/^a blog post named "(\w+)" with Markdown body$/, function (title, text, next) {
	console.log("title: \n" + title + "\ntext: \n" + text);
        next();
    });

    this.Given(/^a scenario with:$/, function (text, next) {
	console.log("text: \n" + text);
        next();
    });

    this.Given(/^the following users exist:$/, function (argument, next) {
	var table = argument.rows();
	// console.log("table: \n" + util.inspect(table));
	console.log("table[0][0]: " + table[0][0] + ", table[0][1]: " + table[0][1] + ", table[0][2]: " + table[0][2]);
        next();
    });
}

module.exports = stepArgumentTest;
