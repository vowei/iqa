var protractor = require('/usr/local/lib/node_modules/protractor')
  , webdriver = require('/usr/local/lib/node_modules/selenium-webdriver');
var path = require('path');
var fs = require('fs');

        var driver = new webdriver.Builder()
            .usingServer('http://localhost:4444/wd/hub')
            .withCapabilities(webdriver.Capabilities['firefox']())
            .build();

        driver.manage().timeouts().setScriptTimeout(100000);

var by = webdriver.By;

driver.get('http://192.168.33.10').then(function() {
   var plg = driver.findElement(by.id('btn-pick-login'));
   plg.click();

   driver.findElement(by.id('name')).sendKeys('1234567');
   driver.findElement(by.id('pwd')).sendKeys('a11111');
   return driver.findElement(by.id('btn-login')).click();
}).then(function() {
   /*
   driver.wait(function() {
      return driver.findElement(by.id('btn-go')).isDisplayed();
   }, 5000);
   */

   setTimeout(function() {
        driver.findElement(by.id('btn-go')).click();
   }, 5000);

   /*
   driver.executeScript("return __coverage__;").then(function(val) {
       fs.writeFileSync("coverage.json", JSON.stringify(val));
   });
  */
});
