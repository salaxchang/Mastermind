package edu.metrostate.ics425.p5.sc831.model;

import java.util.ArrayList;
import java.util.List;


public class Game {

	public static Game instance = null;
	List<ColorBean> colorGuessList = new ArrayList<ColorBean>();
	private Game gameBoard;
	
	//gameBoardList is object of Gameboard
	// List of colorBeans
	
	public static Game getInstance() throws Exception {
		if (instance == null) {
			instance = new Game();
		}
		return instance;
	}
	
	public List<String> getColorGuessList() { // Gets the list of color guesses (Strings)
		
		List<String> makeColorGuess = new ArrayList<String>();
		// may not need this because List is already created inside servlet
		return makeColorGuess;
	}
	
//------------------------------------------------
	 public Game getAllGuesses(){ 
		 	return gameBoard; // return the color guesses from colorGuessList (FIX - not correct)
			
	}
	 
	public void addColorBean(ColorBean cb){ // adds the colorGuess object to the gameBoard List
		colorGuessList.add(cb); // now, need to add color bean to the gameboard..
		
	}
	
	public int checkTurnsLeft(int numOfGuesses) { //gets the size index of the gameBoardList check for numOfTurns
		// need to return the guesses left
		int i = colorGuessList.size();
	
		if(i <= numOfGuesses ) {
			return numOfGuesses - i ;
		}
		return 0;	
	}
	
		// return pegs - get the list of elements and check the placement and colors, return peg colors
}
