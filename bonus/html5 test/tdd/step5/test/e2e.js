describe('PhoneCat controllers', function () {   
    describe('Phone detail view', function() {
	beforeEach(function() {
	    browser.get(
		'http://localhost/tdd/step5/#/phones/nexus-s');
	});

	it('should display the first phone image as the main phone image', function() {
	    expect(element(by.css('img.phone')).getAttribute('src'))
		.toBe('http://localhost/tdd/step5/img/phones/nexus-s.0.jpg');
	});

	it('should swap main image if a thumbnail image is clicked on', function() {
	    element(by.css('.phone-thumbs li:nth-child(3) img'))
		.click();
	    expect(element(by.css('img.phone')).getAttribute('src'))
		.toBe('http://localhost/tdd/step5/img/phones/nexus-s.2.jpg');

	    element(by.css('.phone-thumbs li:nth-child(1) img'))
		.click();
	    expect(element(by.css('img.phone')).getAttribute('src'))
		.toBe('http://localhost/tdd/step5/img/phones/nexus-s.0.jpg');
	});
    });
});