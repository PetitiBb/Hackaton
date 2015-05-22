'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.service', 'AngularSpringApp.directives', 'ngRoute', 'ui.bootstrap', 'ngTable', 'ui.ace', 'angularFileUpload', 'nvd3ChartDirectives']);

function MyCtrl($scope) {
    $scope.codes = [
        { id: 1, name: '100 Continue' },
        { id: 2, name: '101 Switching Protocols' },
        { id: 3, name: '102 Processing' },
        {id: 3, name: '200 OK'},
        {id: 3, name: '201 Created'},
        {id: 3, name: '404 Not Found'}]
    $scope.verbs = [
        {name:'GET'},
        {name:'POST'},
        {name:'PUT'},
        {name:'DELETE'} ]
    $scope.contents = [
        {name:'application/json'},
        {name:'application/XML'},
        {name:'text/json'},
        {name:'text/XML'}]};

        // Declare app level module which depends on filters, and service
App.config(['$routeProvider', function ($routeProvider) {

    $routeProvider.when('/todo', {
        templateUrl: 'todo/layout'
    });
    $routeProvider.when('/address', {
        templateUrl: 'address/layout',
        controller: RestController
    });
    $routeProvider.when('/editor', {
        templateUrl: 'editor/layout',
        controller: SoapController
    });


    $routeProvider.otherwise({redirectTo: '/todo'});
}]);
