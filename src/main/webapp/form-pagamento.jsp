
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagamento Esame</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            width: 400px;
            padding: 40px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
        }
        form {
            margin-top: 20px;
        }
        label {
            display: block;
            font-size: 16px;
            color: #555;
            margin-bottom: 5px;
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
            padding: 12px;
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
        <h1>Pagamento Esame</h1>
        <form action="/CorsiOnline/pagamento" method="post">
            <label for="idUtente">Id Utente</label>
            <input type="text" id="idUtente" name="idUtente" required>
            
            <label for="idEsame">Id Esame</label>
            <input type="text" id="idEsame" name="idEsame" required>
            
            <label for="idPrenotazione">Id Prenotazione</label>
            <input type="text" id="idPrenotazione" name="idPrenotazione" required>
            
            <label for="nrCarta">Numero Carta</label>
            <input type="text" id="nrCarta" name="nr_carta" required>
            
            <label for="importo">Importo</label>
            <input type="text" id="importo" name="importo" required>
            
            <input type="submit" value="Paga">
        </form>
    </div>
</body>
</html>