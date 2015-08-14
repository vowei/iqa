'use strict';

/* Controllers */

var phonecatControllers = angular.module('phonecatControllers', []);

function PhoneListCtrl($scope, Phone) {
    $scope.phones = Phone.query();
    $scope.orderProp = 'age';
}

function PhoneDetailCtrl($scope, $routeParams, Phone) {
    $scope.phone = Phone.get({phoneId: $routeParams.phoneId}, function(phone) {
	$scope.mainImageUrl = phone.images[0];
    });

    $scope.setImage = function(imageUrl) {
	$scope.mainImageUrl = imageUrl;
    }
}
phonecatControllers.controller('PhoneListCtrl', 
			       ['$scope', 'Phone', PhoneListCtrl]);

phonecatControllers.controller('PhoneDetailCtrl', 
			       ['$scope', '$routeParams', 'Phone', PhoneDetailCtrl]);