<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>石墨 SDK Demo</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <meta name='viewport' content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0'>
    <link rel="stylesheet" href="/css/app.css" type="text/css"/>
    <script type="text/javascript" src="https://assets-cdn.shimo.im/assets/scripts/sdk-latest.alpha.js"></script>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <script>
     window.user = {
       id: ${user.id},
       name: '${user.name}',
       avatar: '${user.avatar}'
     };
    </script>
    <script type="text/javascript" src="/js/app.js"></script>
    <script type="text/javascript" src="/js/index.js"></script>
  </head>
  <body>
    <div id="header">
      <div class="user">
        <span class="name">${user.name}</span>
        <span class="avatar">
          <img src="/images/avatars/${user.avatar}" width="25" alt="${user.name}" title="${user.name}"/>
        </span>
      </div>
    </div>
    <div id="action-bar">
      <button id="create-doc">创建文档</button>
      <button id="create-sheet">创建表格</button>
    </div>
    <div id="files">
      <c:forEach items="${files}" var="file">
        <div class="file">
          <a href="/file.jsp?guid=${file.guid}">${file.name}</a>
          <span class="author">by ${file.user}</span>
        </div>
      </c:forEach>
    </div>
  </body>
</html>
