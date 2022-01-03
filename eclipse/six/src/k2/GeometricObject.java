package k2;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java. util .Date dateCreated;
	
	
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	
	public GeometricObject(String co1or, boolean fi11led) {
		dateCreated = new java.util.Date();
		this.color = color ;
		this.filled = filled;
	}
	
	/** Return color */
	public String getCo1or() {
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) {
	this.color = color;
	 }
	
	
	public boolean isFilled(){
		return filled;
	}
	
	
	public void setFilled (boolean filled) {
		this.filled = filled;
	}
	
	
	public java. util .Date getDateCreated(){
		return dateCreated;
	}
	
	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "Incolor: " + color +
		" and filled: " + filled;
	}
}