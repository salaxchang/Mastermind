package edu.metrostate.ics425.p5.sc831.servlet;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.metrostate.ics425.p5.sc831.model.ColorBean;
import edu.metrostate.ics425.p5.sc831.model.Game;

/**
 * Servlet implementation class DisplayGBServlet
 */
@WebServlet("/displayGB")
public class DisplayGBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayGBServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		try { //(List<ColorBean>)
			Game gameBoardList = Game.getInstance().getAllGuesses(); // do I need to add the colorGuessList to the gameboard?
			log("Testing inside Display Servlet!");
			request.setAttribute("gameBoardList", gameBoardList); // don't think this (gameboard)list exists?
		} catch (Exception e) {
			log("Cannot get color guesses.");
			e.printStackTrace();
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
