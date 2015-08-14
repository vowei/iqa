describe('PhoneCat controllers', function () {   
    describe('Phone detail view', function() {
	beforeEach(function() {
	    browser.get(
		'http://localhost/tdd-hands-on-lab/step4-completed/');
	});

	it('should display the first phone image as the main phone image', function() {
	    expect(element(by.css('ul.phones:first-child img')).getAttribute('src'))
		.toBe('http://localhost/tdd-hands-on-lab/step4-completed/img/phones/motorola-xoom-with-wi-fi.0.jpg');
	});
    });
});