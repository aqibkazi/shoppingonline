<%--All the tag libraries will be included here  --%>
<%@taglib uri="http://www.springframework.org/tags"  prefix= "spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<spring:url value="/resources/images" var="images" />
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />
<c:set var="contextPath"  value="${pageContext.request.contextPath }"/>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
  <!-- 	 <link rel="icon" href="../../favicon.ico">
   -->
   
    <title>Ecommerce - ${title}</title>
    
    <link href="${css}/bootstrap-united.css" rel="stylesheet" />
    <%-- <link href="${css}/bootstrap-theme.css" rel="stylesheet" /> --%>
    <link href="${css}/app.css" rel="stylesheet" />
       

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- header containing nav bar -->
  	<%@include file="./shared/header.jsp" %>


  <%-- Load the file based on what user is clicking --%>
  <%-- Load index --%>
  <c:if test="${ifUserClickedHome == true}">
  <%@include file="index.jsp" %>
  </c:if>	

 <%-- Load about --%>
  <c:if test="${ifUserClickedAbout == true}">
  <%@include file="about.jsp" %>
  </c:if>
  
  <%-- Load contact --%>
   <c:if test="${ifUserClickedContact == true}">
  <%@include file="contact.jsp" %>
  </c:if>
  
   
  <%-- Load login --%>
   <c:if test="${ifUserClickedLogin == true}">
  <%@include file="login.jsp" %>
  </c:if>
  
  <%-- Load register --%>
   <c:if test="${ifUserClickedRegister == true}">
  <%@include file="register.jsp" %>
  </c:if>
  
    <%-- Load product list --%>
   <c:if test="${ifUserClickedProductList == true}">
  <%@include file="productlist.jsp" %>
  </c:if>
  
    <%-- Load cart --%>
   <c:if test="${ifUserClickedCart == true}">
  <%@include file="cart.jsp" %>
  </c:if>
  
  	<!-- To Load Admin Page -->
	<c:if test="${ifUserClickedAdmin == true}">	
	<%@include file="./admin/adminpanels.jsp"%>
	</c:if>
	
	<!-- To Load User Page -->
	<c:if test="${ifUserClickedUser == true}">	
	<%@include file="./user/userpanels.jsp"%>
	</c:if>
	
  <!-- Footer here -->	
   <%@include file="./shared/footer.jsp" %>
    
    <%-- Load JQuery before bootstrap --%>
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.js"></script>	 
</div>
  </body>
</html>
