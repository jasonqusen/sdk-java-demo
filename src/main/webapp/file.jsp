<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <title>石墨 SDK Demo</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <meta name='viewport' content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0'>
    <link rel="stylesheet" href="/css/app.css" type="text/css"/>
    <script type="text/javascript" src="https://assets-cdn.shimo.im/assets/scripts/sdk-latest.alpha.js"></script>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
     window.guid = '${param.guid}';
     window.user = {
       id: ${user.id},
       name: '${user.name}',
       avatar: '/images/avatars/${user.avatar}'
     };
    </script>
    <script type="text/javascript" src="/js/app.js"></script>
    <script type="text/javascript" src="/js/file.js"></script>
  </head>
  <body>
    <div id="header">
      <a class="back" href="/index.jsp"><<</a>
      <span class="title"></span>
      <span class="status"></span>
      <div class="user">
        <span class="name">${user.name}</span>
        <span class="avatar">
          <img src="/images/avatars/${user.avatar}" width="25" alt="${user.name}" title="${user.name}"/>
        </span>
      </div>
    </div>
    <div id="editor-container"></div>
  </body>
</html>
