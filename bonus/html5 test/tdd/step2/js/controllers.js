'use strict';

/* Controllers */

var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('PhoneListCtrl', function($scope, $http) {
    $http.get('phones/phones.txt').success(function (data) {
        $scope.phones = data;
    });

    $scope.orderProp = 'age';
});