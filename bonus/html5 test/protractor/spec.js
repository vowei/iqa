// spec.js
describe('angularjs homepage', function() {
    var firstNumber = element(by.model('first'));
    var secondNumber = element(by.model('second'));
    var goButton = element(by.id('gobutton'));
    var latestResult = element(by.binding('latest'));

    beforeEach(function() {
	// browser.get('http://juliemr.github.io/protractor-demo/');
        browser.get('http://localhost/demo/protractor-demo.html');
    });

    it('should have a title', function() {
	expect(browser.getTitle()).toEqual('Super Calculator');
    });

    it('should add one and two', function() {
	firstNumber.sendKeys(1);
	secondNumber.sendKeys(2);

	goButton.click();

	expect(latestResult.getText()).toEqual('3');
    });
});

describe('Protractor Demo App', function() {
  var firstNumber = element(by.model('first'));
  var secondNumber = element(by.model('second'));
  var goButton = element(by.id('gobutton'));
  var latestResult = element(by.binding('latest'));
  var history = element.all(by.repeater('result in memory'));

  function add(a, b) {
    firstNumber.sendKeys(a);
    secondNumber.sendKeys(b);
    goButton.click();
  }

  beforeEach(function() {
    browser.get('http://localhost/demo/protractor-demo.html');
  });

  it('should have a history', function() {
    add(1, 2);
    add(3, 4);

    expect(history.count()).toEqual(2);

    add(5, 6);

    expect(history.count()).toEqual(0); // This is wrong!
  });
});
