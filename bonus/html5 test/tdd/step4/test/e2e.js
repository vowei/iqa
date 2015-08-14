describe('PhoneCat controllers', function () {
    describe('Phone list view', function() {
	it('should redirect index.html to index.html#/phones', function() {
	    browser.get('http://localhost/tdd/step4/');
	    expect(browser.getLocationAbsUrl()).
		toBe('http://localhost/tdd/step4/#/phones');
	});
    });
    
    describe('Phone detail view', function() {
	beforeEach(function() {
	    browser.get('http://localhost/tdd/step4/#/phones/nexus-s');
	});


	it('should display placeholder page with phoneId', function() {
	    expect(element(by.binding('phoneId')).getText()).toBe('nexus-s');
	});
    });
});