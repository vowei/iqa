var MyController = function(s, g) {
    s.sayHello = function () {
        g.greet('World');
    };
}

MyController['$inject'] = ['$scope', 'greeter'];