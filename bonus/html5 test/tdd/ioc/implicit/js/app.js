var myModule = angular.module('myModule', []);

myModule.factory('alert', function ($window) {
    return function (text) {
        $window.alert(text);
    }
}).factory('greeter', function (alert) {
    return {
        greet: function (text) {
            alert('Hello ' + text + '!');
        }
    };
});