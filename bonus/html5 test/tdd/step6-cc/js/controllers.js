'use strict';

/* Controllers */

var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('PhoneListCtrl', function($scope, $http) {
    $http.get('phones/phones.txt').success(function (data) {
	if ( data ) {
            $scope.phones = data;
	} else { 
	    $scope.phones = [];
	}
    });

    $scope.orderProp = 'age';
});