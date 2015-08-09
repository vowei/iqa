describe('PhoneDetailCtrl', function(){
    var scope, $httpBackend, ctrl;

    beforeEach(module('phonecat'));

    beforeEach(inject(function(_$httpBackend_, $rootScope, $routeParams, $controller) {
	$httpBackend = _$httpBackend_;
	$httpBackend.expectGET('phones/xyz.txt').respond({name:'phone xyz'});

	$routeParams.phoneId = 'xyz';
	scope = $rootScope.$new();
	ctrl = $controller(PhoneDetailCtrl, {$scope: scope});
    }));


    it('should fetch phone detail', function() {
	expect(scope.phone).toBeUndefined();
	$httpBackend.flush();

	expect(scope.phone).toEqual({name:'phone xyz'});
    });
});