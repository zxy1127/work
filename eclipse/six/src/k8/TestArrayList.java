package k8;

import java.util . ArrayList; 

public class TestArrayList {
	public static void main(String[] args) {
		// Create a list to store cities
		ArrayList<String> cityList = new ArrayList();
		
		// Add some cities in the 1ist
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the 1ist? " +
		cityList. contains ("Miami"));
		System.out.println("The 1ocation of Denver in 'the list? "
		+ cityList.indexOf("Denver"));
		System.out.println("Is the 1ist empty? " +
		cityList.isEmpty()); 
		
		// Insert a new city at index 2
		cityList.add(2, "Xian");
		
		// Remove a city from the list
		cityList.remove ("Miami") ;
		
		// Remove a city at index 1
		cityList. remove(1);
		
		// Display the contents in the list
		System.out.println(cityList.toString());
		
		// Display the contents in the list in reverse order
		for (int i = cityList.size() - 1; i >= 0; i--)
		System. out . print (cityList.get(i) + " ");
		System. out. println();
		
		// Create a list to store two circles 
		ArrayList<Circle> list = new ArrayList<>();
		
		// Add two circles
		list. add(new Circle(2)) ;
		list. add(new Circle(3)) ;
		
		// Display the area of the first circle in the list
		System. out . println("The area of the circle? " +
		list. get (0) . getArea());
	}
}