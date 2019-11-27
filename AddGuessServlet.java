package edu.metrostate.ics425.p5.sc831.servlet;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
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

		// 1. Get information
				Game game = (Game) request.getSession().getAttribute("game");
				if (game == null) {
					request.getSession().invalidate();
				} else {
					//get params from jsp
				String elementA = request.getParameter("elementA"); 
				String elementB = request.getParameter("elementB");
				String elementC = request.getParameter("elementC");
				String elementD = request.getParameter("elementD");
				int numOfGuesses = Integer.parseInt(request.getParameter("numOfGuesses"));
				
				log("I got parameters with values: " +elementA +elementB +elementC +elementD);
				
				//make the row of color guesses
				ColorBean cb = new ColorBean(); // create bean by setting param values to
				cb.setElementA(elementA);
				cb.setElementB(elementB);
				cb.setElementC(elementC);
				cb.setElementD(elementD);
				
				// need to check the num of guesses left after cb is added to colorGuessList
				
				request.getRequestDispatcher("/displayGB").forward(request, response);
				}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
