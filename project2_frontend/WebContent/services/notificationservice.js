/**
 * NotificationService
 */
app.factory('NotificationService',function($http){
var notificationService={}
var BASE_URL="http://localhost:8086/project2middleware"
	
	
notificationService.getAllNotificationsNotViewed=function(){
	return $http.get(BASE_URL + "/notificationsnotviewed")
}
	
	
	
return notificationService;	
})
