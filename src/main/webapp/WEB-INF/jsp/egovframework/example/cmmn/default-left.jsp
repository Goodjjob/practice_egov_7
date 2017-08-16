<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script type="text/javascript">

var left = 
{
	pageSubmitFn : function(pageName) {
		
		$("#frm").attr("action", pageName + ".do");

		$("#frm").submit();
	}
}

$(document).ready(function(){	

	var pageName = "<c:out value="${param.pageName}"/>";
	
	$("[prop=menu]").removeClass("active");
	
	$("#"+pageName).addClass("active");
});
</script>

<form id="frm" name="frm">
	<input type="hidden" id="pageName"  name="pageName" />
	<input type="hidden" id="age"  		name="age" 		value="11"/>
	<input type="hidden" id="age2"  	name="age2" 	value="12"/>
	<input type="hidden" id="country"  	name="country" 	value="한국"/>
</form>

<div class="sidebar" data-color="orange" data-image="images/bootstrap/full-screen-image-3.jpg">
	<div class="logo">
        <a href="http://www.creative-tim.com" class="logo-text">
            HANQ TEAM
        </a>
    </div>
	<div class="logo logo-mini">
		<a href="http://www.creative-tim.com" class="logo-text">
			Ct
		</a>
	</div>
    <div class="sidebar-wrapper">
        <div class="user">
            <div class="photo">
                <img src="images/bootstrap/default-avatar.PNG" />
            </div>
            <div class="info">
                <a data-toggle="collapse" href="#collapseExample" class="collapsed">
                    HANQ
                    <b class="caret"></b>
                </a>
                <div class="collapse" id="collapseExample">
                    <ul class="nav">
                        <li><a href="#">My Profile</a></li>
                        <li><a href="#">Edit Profile</a></li>
                        <li><a href="#">Settings</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <ul class="nav">
            <li prop="menu" class="active" id="main">
                <a href="#" onclick="javascript:left.pageSubmitFn('main')">
                    <i class="pe-7s-graph"></i>
                    <p>HOME</p>
                </a>
            </li>
            <li>
                <a data-toggle="collapse" href="#componentsExamples"  aria-expanded="true">
                    <i class="pe-7s-plugin"></i>
                    <p>Week6 Try1
                       	<b class="caret"></b>
                    </p>
                </a>
                <div class="collapse in" id="componentsExamples">
                    <ul class="nav">
                        <li prop="menu" class="active" id="string1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('string1')">string1</a>
                        </li>
                        <li prop="menu" class="active" id="egoMap1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('egoMap1')">egoMap1</a>
                        </li>
                        <li prop="menu" class="active" id="map1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('map1')">map1</a>
                        </li>
                        <li prop="menu" class="active" id="vo1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('vo1')">vo1</a>
                        </li>
                        <li prop="menu" class="active" id="requestParam1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('requestParam1')">requestParam1</a>
                        </li>
                         <li prop="menu" class="active" id="modelAttribute1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('modelAttribute1')">modelAttribute1</a>
                        </li>
                         <li prop="menu" class="active" id="haveNotAnnotationModelAttribute1">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('haveNotAnnotationModelAttribute1')">haveNotAnnotationModelAttribute1</a>
                        </li>
                    </ul>
                </div>
            </li>
             <li>
                <a data-toggle="collapse" href="#componentsExamples2"  aria-expanded="true">
                    <i class="pe-7s-plugin"></i>
                    <p>Week6 Try1
                       	<b class="caret"></b>
                    </p>
                </a>
                <div class="collapse in" id="componentsExamples2">
                    <ul class="nav">
                        <li prop="menu" class="active" id="string2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('string2')">string2</a>
                        </li>
                        <li prop="menu" class="active" id="egoMap2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('egoMap2')">egoMap2</a>
                        </li>
                        <li prop="menu" class="active" id="map2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('map2')">map2</a>
                        </li>
                        <li prop="menu" class="active" id="vo2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('vo2')">vo2</a>
                        </li>
                        <li prop="menu" class="active" id="requestParam2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('requestParam2')">requestParam2</a>
                        </li>
                         <li prop="menu" class="active" id="modelAttribute2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('modelAttribute2')">modelAttribute2</a>
                        </li>
                         <li prop="menu" class="active" id="haveNotAnnotationModelAttribute2">
                        	<a href="#" onclick="javascript:left.pageSubmitFn('haveNotAnnotationModelAttribute2')">haveNotAnnotationModelAttribute2</a>
                        </li>
                    </ul>
                </div>
            </li>    
        </ul>
	</div>
</div>