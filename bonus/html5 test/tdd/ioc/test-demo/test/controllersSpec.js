describe('myApp', function () {
    // load application module (`myModule`) then load a special
    // test module which overrides `$window` with a mock version,
    // so that calling `window.alert()` will not block the test
    // runner with a real alert box.
    beforeEach(module('myModule', function ($provide) {
        $provide.value('$window', {
            alert: jasmine.createSpy('alert')
        });
    }));

    // inject() will create the injector and inject the `greeter` and
    // `$window` into the tests.
    it('should alert on $window', inject(function (greeter, $window) {
        greeter.greet('World');
        expect($window.alert).toHaveBeenCalledWith('Hello World!');
    }));

    // this is another way of overriding configuration in the
    // tests using inline `module` and `inject` methods.
    it('should alert using the alert service', function () {
        var alertSpy = jasmine.createSpy('alert');
        module(function ($provide) {
            $provide.value('alert', alertSpy);
        });
        inject(function (greeter) {
            greeter.greet('World');
            expect(alertSpy).toHaveBeenCalledWith('Hello World!');
        });
    });
});