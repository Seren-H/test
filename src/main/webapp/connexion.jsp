<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Test Connexion</title>
</head>
<body>
    <h2>Test de Connexion à la Base de Données</h2>

    <!-- Affichage du message passé par le contrôleur -->
    <p><strong><%= request.getAttribute("message") %></strong></p>
</body>
</html>
