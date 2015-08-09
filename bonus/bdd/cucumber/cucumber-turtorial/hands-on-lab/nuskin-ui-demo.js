var protractor = require('/usr/local/lib/node_modules/protractor')
  , webdriver = require('/usr/local/lib/node_modules/selenium-webdriver');

        var driver = new webdriver.Builder()
            .usingServer('http://localhost:4444/wd/hub')
            .withCapabilities(webdriver.Capabilities['firefox']())
            .build();

        driver.manage().timeouts().setScriptTimeout(100000);

var by = webdriver.By;

driver.get('https://we360stage.cn.nuskin.com').then(function() {
   var plg = driver.findElement(by.id('btn-pick-login'));
   plg.click();

   driver.findElement(by.id('name')).sendKeys('1234567');
   driver.findElement(by.id('pwd')).sendKeys('a11111');
   driver.findElement(by.id('btn-login')).click();
});

driver.get('https://....').then(function() {
   return driver.findElement(by.id('btn-pick-login'));
}).then(function(plg) {
   return plg.click();
}).then(function() {
   return driver.findElement(by.id('name'));
}).then(function(username) {
   return username.sendKeys('1234567');
});
