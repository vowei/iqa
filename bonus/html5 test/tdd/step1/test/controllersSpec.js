describe('PhoneCat controllers', function () {
	/*
  describe('Phone list view', function() {

    beforeEach(function() {
      browser().navigateTo('../../app/index.html');
    });

    it('should filter the phone list as user types into the search box', function() {
      expect(repeater('.phones li').count()).toBe(3);

      input('query').enter('nexus');
      expect(repeater('.phones li').count()).toBe(1);

      input('query').enter('motorola');
      expect(repeater('.phones li').count()).toBe(2);
    });
  });
	*/

  describe('PhoneListCtrl', function(){
    var scope, ctrl;

    beforeEach(function() {
      scope = {},
      ctrl = new PhoneListCtrl(scope);
    });

    it('should create "phones" model with 3 phones', function() {
      expect(scope.phones.length).toBe(3);
    });

    it('should set the default value of orderProp model', function() {
      expect(scope.orderProp).toBe('age');
    });
  });
});