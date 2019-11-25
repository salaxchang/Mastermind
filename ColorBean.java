package edu.metrostate.ics425.p5.sc831.model;

import java.io.Serializable;

public class ColorBean implements Serializable {

	private String elementA = "" ;
	private String elementB = "" ;
	private String elementC = "" ;
	private String elementD = "" ;
	
	public ColorBean() {
		
	}
	
	public String getElementA() {
		return elementA;
	}

	public void setElementA(String elementA) {
		this.elementA = elementA;
	}

	public String getElementB() {
		return elementB;
	}

	public void setElementB(String elementB) {
		this.elementB = elementB;
	}

	public String getElementC() {
		return elementC;
	}

	public void setElementC(String elementC) {
		this.elementC = elementC;
	}

	public String getElementD() {
		return elementD;
	}

	public void setElementD(String elementD) {
		this.elementD = elementD;
	}

	
}
