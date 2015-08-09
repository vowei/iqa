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

    this.Given(/^排序文本框里的值是 (\w+)$/, function (orderBy, next) {
	next();
    });

    this.Given(/^我在搜索文本框里输入 (\w+)$/, function (key, next) {
	self.browser.findElement(self.by.model('query'))
	    .sendKeys(key).then(function(result) {
		next();
	});

	next();
    });

    this.Given(/^第一个产品是 Nexus S$/, function (next) {
	next();
    });
}

module.exports = productListTest;
