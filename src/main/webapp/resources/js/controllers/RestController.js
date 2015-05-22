

var RestController = function($scope, $http){

    $scope.addInfo = function(rest) {
        $http.post('rest/add', rest).success(function(response){
            $scope.rest.code='';
            $scope.rest.verb='';
            $scope.rest.content = '';
            $scope.rest.body = '';
        }).error(function(response){
            console.log(response);
        })
    }
}