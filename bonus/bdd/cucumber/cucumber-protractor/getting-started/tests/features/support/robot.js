var protractor =  require('/usr/local/lib/node_modules/protractor')
  , webdriver = require('/usr/local/lib/node_modules/selenium-webdriver');

var robot = function(browser) {
    var self = this;
    
    var driver = new webdriver.Builder()
	.usingServer('http://localhost:4444/wd/hub')
	.withCapabilities(webdriver.Capabilities[browser]())
	.build();

    driver.manage().timeouts().setScriptTimeout(100000);
    self.browser = protractor.wrapDriver(driver);
    self.element = protractor.element;
    self.protractor = protractor;
    self.by = protractor.By;

    self.quit = function(callback) {
	driver.quit().then(function() {
	    callback();
	});
    };

    return self;
};

module.exports = robot;
