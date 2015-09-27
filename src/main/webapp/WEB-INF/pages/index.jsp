<%@ page import="com.sky.bean.ProductCatalogue" %>
<%@ page import="com.sky.bean.Product" %>
<html>
<body>

<%! public ProductCatalogue catalogue = ProductCatalogue.getCatalogue(); %>

<ul>
	<% for(Product product: catalogue.getProducts()){
		out.println("<li>" + product.getName() + "</li>");
	} %>
</ul>

</body>
</html>


