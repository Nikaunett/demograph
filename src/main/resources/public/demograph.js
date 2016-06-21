/**
 * Created by oshev on 21.06.2016.
 */
function Graph($scope, $http) {
    $http.get('greeting',{data: {name: name}}).succes(function (data) {
        $scope.greeting = data;
    });

    $scope.update = function () {
        $http.get('greeting',{params:{name: $scope.name}}).success(function (data) {
            $scope.greeting = data;

        })

    }

}
