describe('PhoneCat controllers', function () {
  describe('Phone list view', function() {
    beforeEach(function() {
        browser.get('http://localhost/tdd-hands-on-lab/step3-completed/exercise2.html');
    });

    it('should display the current filter value in the title bar', function () {
        query.clear();
        expect(browser.getTitle()).toMatch(/Google Phone Gallery:\s*$/);

        query.sendKeys('nexus');
        expect(browser.getTitle()).toMatch(/Google Phone Gallery: nexus$/);
    });
  });
});