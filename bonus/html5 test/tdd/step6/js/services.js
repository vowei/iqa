angular.module('phonecatServices', ['ngResource']).
    factory('Phone', function($resource){
	return $resource('phones/:phoneId.txt', {}, {
            query: {method:'GET', params:{phoneId:'phones'}, isArray:true}
	});
});