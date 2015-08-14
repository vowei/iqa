var protractor = require('/usr/local/lib/node_modules/protractor')
  , webdriver = require('/usr/local/lib/node_modules/selenium-webdriver');

	var driver = new webdriver.Builder()
	    .usingServer('http://localhost:4444/wd/hub')
	    .withCapabilities(webdriver.Capabilities['firefox']())
	    .build();

	driver.manage().timeouts().setScriptTimeout(100000);

	var browser = protractor.wrapDriver(driver);

var by = webdriver.By;

driver.get('http://www.baidu.com').then(function(){
    return driver.findElement(by.id('kw'))
}).then(function(kw) {
    return kw.sendKeys('webdriver');
}).then(function() {
    return driver.findElement(by.id('su'));
}).then(function(su) {
    return su.click();
});
