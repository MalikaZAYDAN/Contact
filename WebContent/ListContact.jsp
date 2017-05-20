<!-- Jsp file for displaying list of projects already exist -->

<%@page language="java"
	import="modell.Contact,java.util.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<html>

<head>
<title>Gestion des contact</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body class="container jumbotron">
	<h1 class="text-center"><img class="img/img-circle" src="admin.png" height="100" width="100">La liste de Mes
		Contacts</h1>
	<br>
	<br>
	<br>
	<div class="col-lg-offset-3 col-sm-6">
		<table class="table table-striped">
			<thead>
				<tr bgcolor="STEELBLUE">

					<th class="text-center" style="color: white">Nom et Prenom</th>
					<th class="text-center" style="color: white">N° Tel</th>
					<th class="text-center" style="color: white">Type Tel</th>
					


				</tr>
			</thead>
			<%
			DAO.ContactDAO l1 = new DAO.ContactDAO();

				List data1 = l1.List_of_Contact();

				Iterator it1 = data1.listIterator();
				

				while (it1.hasNext()) {
					Contact l2 = (Contact) it1.next();

			%>
			<tr class="text-center">
				<td><a"><%=l2.getNom()+"  "+l2.getPrenom()%></a></td>
				<td><a"><%=l2.getNum_tel()%></a></td>
				<td><a"><%=l2.getType_tel()%></a></td>
				
			</tr>
			<%}%>		</table>
			<a class="pull-right  glyphicon glyphicon-plus" href="AddContact.jsp">Ajouter</a>
			

	</div>

</body>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
