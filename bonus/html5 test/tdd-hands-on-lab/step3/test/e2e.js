describe('PhoneCat controllers', function () {
  describe('Phone list view', function() {

    beforeEach(function() {
	browser.get('http://localhost/tdd/step3/');
    });

      it('should render phone specific links', function() {
	  element(by.model('query')).sendKeys('nexus');
	  element(by.css('.phones li a')).click();
	  expect(browser.getLocationAbsUrl()).
	      toBe('http://localhost/tdd/step3/#/phones/nexus-s');
      });
  });
});