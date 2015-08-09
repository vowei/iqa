var tagsTest = function() {
    this.When(/^run features "([^"]+)"$/, function(name, callback) {
	console.log("run features: " + name);
	callback();
    });

    this.When(/^run scenario "([^"]+)"$/, function(name, callback) {
	console.log("run scenario: " + name);
	callback();
    });
}

module.exports = tagsTest;
