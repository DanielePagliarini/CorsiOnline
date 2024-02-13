package org.generation.italy.corsionline.control;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.generation.italy.corsionline.model.CorsiOnlineModelException;
import org.generation.italy.corsionline.model.TestJdbcCorsiOnline;
import org.generation.italy.corsionline.model.entity.PrenotazioneEsame;
import org.generation.italy.corsionline.control.UserMessages;

@WebServlet(urlPatterns = { "/prenotazione", "/form-prenotazione" })
public class UtenteServletJ2EE extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        executeAction(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        executeAction(request, response);
    }

    protected void executeAction(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String actionName = request.getServletPath();
        switch (actionName.toLowerCase().trim()) {
            case "/prenotazione":
                actionPrenotazione(request, response);
                break;
            case "/form-prenotazione":
                actionFormPrenotazione(request, response);
                break;
            default:
                break;
        }
    }

    private void actionFormPrenotazione(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("form-prenotazione.jsp");
        dispatcher.forward(request, response);
    }

    private void actionPrenotazione(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String messageToShow = UserMessages.msgPrenotazioneEsameOk;

        // Ottieni i parametri direttamente, senza effettuare controlli aggiuntivi
        int idEsame = Integer.parseInt(request.getParameter("idEsame"));
        int idUtente = Integer.parseInt(request.getParameter("idUtente"));

        try {
            // Ottieni la data e l'ora correnti
            LocalDateTime dataPrenotazione = LocalDateTime.now();

            PrenotazioneEsame prenotazioneEsame = new PrenotazioneEsame(idEsame, idUtente, dataPrenotazione);

            TestJdbcCorsiOnline testJdbcCorsiOnline = new TestJdbcCorsiOnline();
            testJdbcCorsiOnline.getPrenotazioneEsameDao().addPrenotazioneEsame(prenotazioneEsame);

            messageToShow = UserMessages.msgPrenotazioneEsameOk;
        } catch (NumberFormatException e) {
            // Gestione dell'eccezione nel caso in cui la stringa non possa essere convertita in un numero
            messageToShow = "Errore: uno o più parametri non sono validi";
        } catch (CorsiOnlineModelException e) {
            messageToShow = UserMessages.msgErrorePrenotazioneEsame;
        }

        request.setAttribute("message-to-show", messageToShow);
        RequestDispatcher dispatcher = request.getRequestDispatcher("message.jsp");
        dispatcher.forward(request, response);
    }
}