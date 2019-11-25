package edu.metrostate.ics425.p5.sc831.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.metrostate.ics425.p5.sc831.model.ColorBean;
import edu.metrostate.ics425.p5.sc831.model.Game;

/**
 * Servlet implementation class AddGuess
 */

public class AddGuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGuessServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get params from jsp
		String elementA = request.getParameter("elementA"); 
		String elementB = request.getParameter("elementB");
		String elementC = request.getParameter("elementC");
		String elementD = request.getParameter("elementD");
		int numOfGuesses = Integer.parseInt(request.getParameter("numOfGuesses"));
		
		log("I got parameters with values: " +elementA +elementB +elementC +elementD);
		
		//make the row of color guesses
		ColorBean cb = new ColorBean(); // create bean of values
		cb.setElementA(elementA);
		cb.setElementB(elementB);
		cb.setElementC(elementC);
		cb.setElementD(elementD);
		
		//add the color guesses to the Gameboard
		try {
			Game.getInstance().addColorBean(cb); // adds CB to the (Gameboard List?) - is this right? (Debug)
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "Cannot add color guesses.");
			} 
		
		// checks the guesses after cb is added to colorGuessList
		try {
			int numOfGuessesLeft = Game.getInstance().checkTurnsLeft(numOfGuesses);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", "Cannot check for number of guesses.");
			} 
		
		RequestDispatcher requestDis = request.getRequestDispatcher("/displayGB"); 
		requestDis.forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
