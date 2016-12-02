var extratoApp = angular.module('extratoApp', ['ui.router', 'ngResource']);

extratoApp.config(function($stateProvider, $urlRouterProvider, $locationProvider, $httpProvider) {

	$urlRouterProvider.otherwise('/');

	var homeState = {
		name: 'extrato',
		url: '/extrato',
		templateUrl: 'extrato.html',
		controller: 'ExtratoCTRL',
		controllerAs: 'extratoController'
	}
	
	$stateProvider.state(homeState);

});