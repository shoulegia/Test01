<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/14 0014
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String s = "王佳灵";
  Map<String, String> map = new HashMap<>();
  map.put("user",s);
  map.put("title","test");
%>
<html>
  <head>
    <title>${pageScope.title}</title>
  </head>
  <body>
  欢迎，${pageScope.user}
  </body>

</html>
<script>
  var date = new Date();
  alert(date)
</script>
