<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Superhero Sightings</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">       
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Houdell Hollers</h1>
            <hr/>
            <div class="navbar">
                <!-- All site navigation tabs are in this div -->
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/viewPictures">Pictures</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/viewVideos">Videos</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/viewShows">Upcoming Shows</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/viewContact">Contact Us</a></li>
                </ul>    
            </div>
            <h3 class="text-center">We're the Houdell Hollers, a jam/blues band based in Louisville Kentucky.</h3>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>