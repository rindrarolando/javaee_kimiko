<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="entities.Book" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Books</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        table {
            width: 70%;
            margin: 50px auto;
            border-collapse: collapse;
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
        
        a {
            background-color: #4CAF50; /* couleur de fond */
            color: white; /* couleur de texte */
            padding: 10px 20px; /* espacement intérieur */
            text-align: center; /* alignement du texte */
            text-decoration: none; /* suppression du soulignement */
            display: inline-block; /* rendre le lien bloc pour permettre le padding */
            font-size: 16px; /* taille du texte */
            margin: 4px 2px; /* espacement extérieur */
            cursor: pointer; /* changer le curseur */
            border-radius: 12px; /* arrondir les coins */
        }

        a:hover {
            background-color: #45a049; /* couleur de fond au survol */
        }
    </style>
</head>
<body>
<h2 style="text-align:center;">List of Books</h2>
	<div>
		<a href="Form">Go back to the adding form</a>
	</div>
	<table>
	    <tr>
	        <th>ID</th>
	        <th>Title</th>
	        <th>Description</th>
	        <th>Availability</th>
	    </tr>
	    <% 
	        List<Book> books = (List<Book>) request.getAttribute("books");
	        if(books != null) {
	            for(Book book : books) {
	    %>
		           <tr>
		               <td><%= book.getId() %></td>
		               <td><%= book.getTitle() %></td>
		               <td><%= book.getDescription() %></td>
		               <td><%= book.getAvailability() %></td>
		           </tr>
	    <% 
	            }
	        } 
	    %>
	</table>
</body>
</html>