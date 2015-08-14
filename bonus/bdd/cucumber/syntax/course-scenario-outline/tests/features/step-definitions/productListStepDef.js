var protractor = require('/usr/local/lib/node_modules/protractor')
  , webdriver = require('/usr/local/lib/node_modules/selenium-webdriver');

var productListTest = function() {
    var self = this;

    this.Before(function(next) {
	var driver = new webdriver.Builder()
	    .usingServer('http://localhost:4444/wd/hub')
	    .withCapabilities(webdriver.Capabilities['firefox']())
	    .build();

	driver.manage().timeouts().setScriptTimeout(100000);
	self.browser = protractor.wrapDriver(driver);
	self.protractor = protractor;
	self.by = protractor.By;

	self.browser.get('http://localhost/step6').then(function(result){
	    setTimeout(next, 1000);
	});
    });

    this.Given(/^sort by drop\-down value is (\w+)$/, function (orderBy, next) {
        next();
    });

    this.When(/^I type (\w+) in search text box$/, function (key, next) {
	self.browser.findElement(self.by.model('query'))
	    .sendKeys(key).then(function(result) {
		next();
	});
    });

    this.Then(/^the first product is (\w+)$/, function (result, next) {
        next();
    });
}

module.exports = productListTest;
