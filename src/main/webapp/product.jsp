<%@ page import="java.util.List"                                                    %>
<%@ page import="model.Product"                                                     %>
<%@ page contentType="text/html; character=utf-8" language="java"                   %>

<html>
<body>
<h2>Apple</h2>

<ul>

<%          for (Product value : (List<Product>)  ((Product)request.getAttribute("product")).getChildren()) {        %>
<li>        <%              value.getTitle();                                                                         %> </li>
<%          }                                                                                                        %>

</ul>

</body>
</html>