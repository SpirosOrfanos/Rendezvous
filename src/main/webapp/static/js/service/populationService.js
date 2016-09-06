'use strict';

angular.module('myApp').factory('PopulationService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/Rendezvous/';

    var factory = {
    	listAllHairActorStatus: listAllHairActorStatus
    };

    return factory;

    function listAllHairActorStatus() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI+'hairactorstatuses/')
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    

}]);
