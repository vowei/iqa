function MyController($scope, greeter) {
    $scope.sayHello = function () {
        greeter.greet('World');
    };
}