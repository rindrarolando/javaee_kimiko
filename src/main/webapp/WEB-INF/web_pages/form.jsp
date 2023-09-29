<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add book</title>
<style>
	body {
	    font-family: 'Arial', sans-serif;
	    background-color: #f4f4f4;
	    margin: 0;
	    padding: 0;
	}
	
	.form-container {
	    width: 50%;
	    margin: auto;
	    background: #fff;
	    padding: 30px;
	    box-shadow: 0px 0px 10px 0px #000;
	}
	
	label, 
	input, 
	textarea, 
	select, 
	button {
	    display: block;
	    width: 100%;
	    margin-bottom: 20px;
	    font-size: 16px;
	}
	
	input,
	textarea,
	select {
	    padding: 10px;
	    border: 1px solid #ddd;
	    border-radius: 5px;
	}
	
	textarea {
	    resize: vertical;
	}
	
	button {
	    cursor: pointer;
	    background: #28a745;
	    color: #fff;
	    padding: 10px;
	    border: none;
	    border-radius: 5px;
	    transition: background 0.3s ease;
	}
	
	button:hover {
	    background: #218838;
	}
	
	.header {
	    text-align: center;
	}
	
	.link {
	    margin-left: 10px;
	}
	
	.form-title {
	    margin: 0;
	}
		
</style>
</head>
<body>
	<div class="form-container">
	
		<div class="header">
			<h2 class="form-title">Hi! new book?</h2>
			<span class="link"><small><a href="Display">no,see all books</a></small></span>
		</div>
		
        <form action="Addbook" method="post" id="addBookForm">
            <label for="title">Title:</label>
            <input type="text" id="titre" name="title" required>
            
            <label for="description">Description:</label>
            <textarea id="description" name="description" rows="4" required></textarea>
            
            <label for="availability">Availabble?</label>
            <select id="availability" name="availability">
                <option value="true">Yes</option>
                <option value="false">No</option>
            </select>
            
            <button type="submit">add</button>
            
        </form>
    </div>
</body>
</html>