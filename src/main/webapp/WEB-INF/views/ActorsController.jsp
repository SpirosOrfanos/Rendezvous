<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="myApp">
<head>
<title>AngularJS $http Example</title>
<style>
.username.ng-valid {
	background-color: lightgreen;
}

.username.ng-dirty.ng-invalid-required {
	background-color: red;
}

.username.ng-dirty.ng-invalid-minlength {
	background-color: yellow;
}

.email.ng-valid {
	background-color: lightgreen;
}

.email.ng-dirty.ng-invalid-required {
	background-color: red;
}

.email.ng-dirty.ng-invalid-email {
	background-color: yellow;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="<c:url value='/static/js/app.js' />"></script>
<script src="<c:url value='/static/js/service/actorsService.js' />"></script>
<script src="<c:url value='/static/js/service/populationService.js' />"></script>
<script src="<c:url value='/static/js/controller/actorsController.js' />"></script>
</head>
<body class="ng-cloak">
	<div class="generic-container" ng-controller="ActorsController as ctrl">

	<div class="panel panel-default">
              <div class="panel-heading"><span class="lead">User Registration Form </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.user.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">First name</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.fname" name="fname" class="username form-control input-sm" placeholder="Enter your First name" required ng-minlength="3"/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                      <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                      <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
					<div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Last name</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.sname" name="sname" class="username form-control input-sm" placeholder="Enter your Last name" required ng-minlength="3"/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                      <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                      <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Status</label>
                              <div class="col-md-7">  								 
								 <select name="statuses" id="statuses">
								 <!-- select name="statuses" id="statuses"  ng-selected="{{ctrl.user.active == ctrl.selectedOption}}"-->
							      <option ng-repeat="option in ctrl.statuses" ng-value="{{option.status}}">{{option.value}}</option>							       
							    </select>
							     <input type="hidden"  ng-model="ctrl.selectedOption" />
                              </div>                             
                          </div>
                      </div>
                      
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Phone</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.user.phone" name="phone" class="username form-control input-sm" placeholder="Enter your phone" required ng-minlength="3"/>
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                      <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                      <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>
					  
					  <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.remove(ctrl.user.id)" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">Remove</button>
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
						
                  </form>
              </div>
          </div>


	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<span class="lead">HAIR ACTORS</span>
		</div>
		<div class="tablecontainer">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>ID.</th>
						
						<th>fname</th>
						<th>sname</th>
						<th>phone</th>
						<!-- th width="20%"></th-->
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="u in ctrl.users" class="{{u.active == true ? 'isActive' : 'notActive'}}" ng-click='ctrl.edit(u);'>
						<td><span ng-bind="u.id"></span></td>						
						<td><span ng-bind="u.fname"></span></td>
						<td><span ng-bind="u.sname"></span></td>
						<td><span ng-bind="u.phone"></span></td>
						
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	</div>


</body>
</html>