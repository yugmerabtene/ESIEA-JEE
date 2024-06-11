<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un utilisateur</title>
</head>
<body>
<h1>Ajouter un utilisateur</h1>
<form action="addUser" method="post">
    <label for="name">Nom :</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="email">Email :</label>
    <input type="email" id="email" name="email" required>
    <br>
    <label for="password">Mot de passe :</label>
    <input type="password" id="password" name="password" required>
    <br>
    <input type="submit" value="Ajouter">
</form>
<%
    String message = (String) request.getAttribute("message");
    if (message != null) {
%>
<p><%= message %></p>
<%
    }
%>
</body>
</html>