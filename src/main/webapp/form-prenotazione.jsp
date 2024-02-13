<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<head>
		<title>Corsi Online</title>
	</head>

	<body>
        <center>
            <h1>Prenotazione Esame Utente</h1>
        </center>
		
		<form action="/CorsiOnline/form-prenotazione" method="post">
		
			<p>Per favore, indicare i dati corretti per la prenotazione!!!.</p>
			
			<label for="id Utente">Id Utente</label>
			<br>
			<input type="text" id="id Utente" name="id Utente" >
	
			<br>	
			
			<label for="id Esame">Id Esame</label><br>
			<input type="text" id="id Esame" name="id Esame"  />
			
			<br>	
			
			<label for="data prenotazione">data prenotazione</label><br>
			<input type="datetime-local" id="data prenotazione" name="data prenotazione"  />
	
			<br>

		
			<input type="submit" value="Versamento">
			
		</form>
  
	</body>
</html>