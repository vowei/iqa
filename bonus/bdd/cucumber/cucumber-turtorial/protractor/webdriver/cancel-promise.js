var webdriver = require('/usr/local/lib/node_modules/selenium-webdriver');

function logForever() {
 var key = setInterval(function() {
   console.log('hello');
 }, 100);

 return webdriver.promise.defer(function() {
   console.log('goodbye');
   clearInterval(key);
 }).promise;
}

var promise = logForever();

setTimeout(function() {
 promise.cancel();

 // Swallow the resulting cancellation error.
 promise.then(null, function() {});
}, 300);
