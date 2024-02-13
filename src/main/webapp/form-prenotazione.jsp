<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prenotazione Esame</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        form {
            margin-top: 20px;
        }
        label {
            font-size: 18px;
            color: #333;
        }
        input[type="text"] {
            width: calc(100% - 20px);
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007bff;
            color: #fff;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Prenotazione Esame</h1>
        <form action="/CorsiOnline/prenotazione" method="post">
            <label for="id_utente">Id Utente</label><br>
            <input type="text" id="idUtente" name="idUtente" required><br>
            
            <label for="id_esame">Id Esame</label><br>
            <input type="text" id="idEsame" name="idEsame" required><br>
            
            <!-- Input nascosto per la data di prenotazione -->
            <input type="hidden" id="dataPrenotazione" name="dataPrenotazione">
            
            <input type="submit" value="Prenota">
        </form>
    </div>
</body>
</html>
