'use strict';

angular.module('myApp').controller('ActorsController', ['$scope', 'ActorsService', 'PopulationService', function($scope, ActorsService, PopulationService) {
    var self = this;
    self.user={id:null,status:"false",fname:'',sname:'',phone:''};
    self.users=[];
    self.statuses=[];
    self.selectedOption = false;

    self.submit = submit;
    self.edit = edit;
    self.remove = remove;
    self.reset = reset;


    listAllHairActors();
    listAllHairActorStatus();

    function listAllHairActors (){
    	ActorsService.listAllHairActors()
            .then(
            function(d) {
                self.users = d;
            },
            function(errResponse){
                console.error('Error while fetching actors');
            }
        );
    }
    
    function listAllHairActorStatus() {
    	PopulationService.listAllHairActorStatus()
        .then(
        function(d) {
            self.statuses = d;
        },
        function(errResponse){
            console.error('Error while fetching Actor Status');
        }
    );
    }

    function createActor(user, status){
    	user.status = status;
    	/*ActorsService.createActor(user)
            .then(listAllHairActors,
            function(errResponse){
                console.error('Error while creating actor');
            }
        );*/
    }
    
    function updateActor(user, id, status){
    	user.status = status;
    	/*ActorsService.updateActor(user, id)
            .then(listAllHairActors,
            function(errResponse){
                console.error('Error while updating actor');
            }
        );*/
    }
    
    function deleteActor(id){
    	 console.error('deleteActor : ' + id)
        ActorsService.deleteActor(id)
            .then(listAllHairActors,
            function(errResponse){
                console.error('Error while deleting actor');
            }
        );
    }
    
    function submit() {
        if(self.user.id===null){
            console.log('Saving New actor', self.user);
            createActor(self.user, self.selectedOption);
        }else{
            updateActor(self.user, self.user.id, self.selectedOption);
            console.log('actor updated with id ', self.user.id);
        }
        reset();
    }
    
    function edit(u){
       
        self.user = angular.copy(u);
        self.selectedOption = angular.copy(u.active);
        document.getElementById('statuses').value=u.active;
        console.log('id to be edited', u);
        console.log('id to be active', u.active);
        console.log('id to be selected', self.selectedOption);
    }
    
    function remove(id){
        console.log('id to be deleted', id);
        if(self.user.id === id) {//clean form if the user to be deleted is shown there.
            reset();
        }
        deleteActor(id);
    }


    function reset(){
        self.user={id:null,status:null,fname:'',sname:'',phone:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);
