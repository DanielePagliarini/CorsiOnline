package org.generation.italy.corsionline.control;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.generation.italy.corsionline.model.entity.*;
import org.generation.italy.corsionline.model.CorsiOnlineModelException;
import org.generation.italy.corsionline.model.JdbcConnection;
import org.generation.italy.corsionline.model.TestJdbcCorsiOnline;

@WebServlet(urlPatterns = { "", }) // java annotation
																									// WebServlet:
																									// indicazione per
																									// il container
																									// (GlassFish) con
																									// le action della
																									// URI inviata dal
																									// client che la
																									// servlet intende
																									// gestire
public class UtenteServletJ2EE extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init() { // metodo che viene richiamato dal container al momento della installazione
							// della webapp in esso con mappatura della servlet (l'altro è 'destroy' (al
							// momento della rimozione della servlet dal container), non gestito in questa
							// servlet).

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) // metodo chiamato dal container
																					// (GlassFish), a seguito di
																					// ricezione da parte sua del
																					// messaggio HTTP-Request, con
																					// metodo POST inviato dal client
																					// (browser)
			throws ServletException, IOException {
		executeAction(request, response); // re-inoltra al metodo doGet la gestione della action | request e response
											// sono istanze di tipo HttpServletRequest ed HttpServletResponse, create
											// dal container per fornire a e ricevere dalla servlet i dettagli circa i
											// messaggi di HTTP-Request ed HTTP-Response ricevuti da ed inviati al
											// client.
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) // metodo chiamato dal container
																					// (GlassFish), a seguito di
																					// ricezione da parte sua del
																					// messaggio HTTP-Request, con
																					// metodo GET inviato dal client
																					// (browser)
			throws ServletException, IOException {
		executeAction(request, response); // re-inoltra al metodo doGet la gestione della action | request e response
											// sono istanze di tipo HttpServletRequest ed HttpServletResponse, create
											// dal container per fornire a e ricevere dalla servlet i dettagli circa i
											// messaggi di HTTP-Request ed HTTP-Response ricevuti da ed inviati al
											// client.

	}

	protected void executeAction(HttpServletRequest request, HttpServletResponse response) // metodo chiamato dal
																							// container (GlassFish), a
																							// seguito di ricezione da
																							// parte sua del messaggio
																							// HTTP-Request, con metodo
																							// GET inviato dal client
																							// (browser)
			throws ServletException, IOException {

		String actionName = request.getServletPath(); // parte action della URI: gestione della azione applicativa, la
														// parte della URL dopo il nome della webapp...
		switch (actionName.toLowerCase().trim()) {

		// http://localhost:8081/banca/operatore-banca/apri-conto-cliente?iban=ESaa0123456789012345678901234567&codice-fiscale=MRRGVN0123456789&valuta=EUR
//		case "/versamento":
//			actionVersamento(request, response);
//			break;
//
//		case "/form-versamento":
//			actionFormVersamento(request, response);
//			break;
//
//		case "/prelievo":
//			actionPrelievo(request, response);
//			break;
//
//		case "/form-prelievo":
//			actionFormPrelievo(request, response);
//			break;
		case "/prenotazione":
			actionPrenotazione(request, response);

		default:
			;
		}

	}
//

	private static void actionPrenotazione(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// throws BancaControlException, BancaModelException {

		String messageToShow = UserMessages.msgPrenotazioneEsameOk; // default: messaggio per, successo esito apertura
																	// conto

		String idUtenteString = request.getParameter("id Utente") != null ? request.getParameter("id Utente") : "";
		String idEsameString = request.getParameter("id Esame") != null ? request.getParameter("id Esame") : "";
		String dataPrenotazioneString = request.getParameter("data prenotazione") != null ? request.getParameter("data prenotazione") : "";
	    LocalDateTime LocalDateTimeValue = LocalDateTime.parse(dataPrenotazioneString);

//	private static void actionVersamento(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// throws BancaControlException, BancaModelException {
//
//		String messageToShow = UserMessages.msgEsitoVersamentoOk; // default: messaggio per, successo esito apertura
//																	// conto
//
//		String ibanString = request.getParameter("iban") != null ? request.getParameter("iban") : "";
//		String importoString = request.getParameter("importo") != null ? request.getParameter("importoString") : "";
//
//		// controlli sintattici e semantici su parametri da web
//		if ((!UtilitiesControlliSintatticiSemantici.checkFormatIban(ibanString))
//
//				||
//
//				(!UtilitiesControlliSintatticiSemantici.checkFormatImporto(importoString))
//
//		) {
//
//			messageToShow = UserMessages.msgErroreParametriAperturaConto;
//			// throw new BancaControlException("OperatoreBancaSErvlet ->
//			// actionApriContoCliente -> Errore nel formato dei dati input!!!");
//
//		} else {
//
//			try {
//
//				Float importo = Float.parseFloat(importoString);
//
//				// accede alla fonte dati, istanziando TEstJdbcBanca
//				// che ha come attributi i riferimenti ai metodi delle classi DAO.
//				Movimento movimento = new Movimento(ibanString, importo, "V");
//
//				TestJdbcScidafa testJdbcBanca = new TestJdbcScidafa();
//				testJdbcBanca.getMovimentoDao().addMovimento(movimento);
//
//				messageToShow = UserMessages.msgEsitoVersamentoOk;
//
//			} catch (BancaModelException e) {
//				messageToShow = UserMessages.msgErroreOperazioneVersamento;
//			}
//		}
//
//		// **************************************************************
//		// mostra interfaccia html/jsp di messaggistica per esito operazione
//		// **************************************************************
//
//		request.setAttribute("message-to-show", messageToShow);
//		// imposta il parametro nominativoUtenteLoggato
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("message.jsp");
//		// ottiene il riferimento alla apgina JSP
//		dispatcher.forward(request, response);

//	}
//
//	private static void actionFormPrelievo(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("form-prelievo.jsp");
//		// ottiene il riferimento alla apgina JSP
//		dispatcher.forward(request, response);
//
//	}

//	private static void actionPrelievo(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// throws BancaControlException, BancaModelException {
//
//		String messageToShow = UserMessages.msgEsitoPrelievoOk; // default: messaggio per, successo esito apertura conto
//
//		String ibanString = request.getParameter("iban") != null ? request.getParameter("iban") : "";
//		String importoString = request.getParameter("importo") != null ? request.getParameter("importoString") : "";
//
////		controlli sintattici e semantici su parametri da web
//		if (!UtilitiesControlliSintatticiSemantici.checkFormatImporto(importoString)) {
//
//			messageToShow = UserMessages.msgErroreParametriPrelievo;
//			// throw new BancaControlException("OperatoreBancaSErvlet ->
//			// actionApriContoCliente -> Errore nel formato dei dati input!!!");
//
//		} else {
//
//			try {
//
//				Float importo = Float.parseFloat(importoString);
//
//				// accede alla fonte dati, istanziando TEstJdbcBanca
//				// che ha come attributi i riferimenti ai metodi delle classi DAO.
//				Movimento movimento = new Movimento(ibanString, importo, "P");
//
//				TestJdbcScidafa testJdbcBanca = new TestJdbcScidafa();
//				testJdbcBanca.getMovimentoDao().addMovimento(movimento);
//
//				messageToShow = UserMessages.msgEsitoPrelievoOk;
//
//			} catch (BancaModelException e) {
//				messageToShow = UserMessages.msgErroreOperazionePrelievo;
//			}
//		}
//
//		// **************************************************************
//		// mostra interfaccia html/jsp di messaggistica per esito operazione
//		// **************************************************************
//
//		request.setAttribute("message-to-show", messageToShow);
//		// imposta il parametro nominativoUtenteLoggato
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("message.jsp");
//		// ottiene il riferimento alla apgina JSP
//		dispatcher.forward(request, response);
//
//	}

}
}
