<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <table border=1>
        <tr>
            <th>No</th>
            <th>Title</th>
            <th>Writer</th>
            <th>Date</th>
        </tr>
          <c:forEach var="l" items="${list}">
              <tr>
                  <td>${l.bno}</td>
                  <td>${l.title}</td>
                  <td>${l.writer}</td>
                  <td><fmt:formatDate value="${l.regdate }" pattern="yyyy-MM-dd"/></td>
              </tr>
          </c:forEach>
          
    </table>
</div>


</body>
</html>