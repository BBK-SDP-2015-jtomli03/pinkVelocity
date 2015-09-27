<%@ page import="com.sky.bean.Product" %>
<%@ page import="com.sky.bean.ProductCatalogue" %>
<%@ page import="java.util.List" %>
<html>
<body>

<%! public List<Product> products = ProductCatalogue.getCatalogue().getProducts(); %>

<ul>
	<% for(Product product: products){
		out.println("<li>" + product.getName() + "</li>");
	} %>
</ul>

</body>
</html>


