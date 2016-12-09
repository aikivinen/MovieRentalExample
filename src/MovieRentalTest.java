public class MovieRentalTest {
	
	public static void main(String[] args){
		Movie m0 = new Movie("Star Wars", 0);
		Movie m1 = new Movie("Doctor Strange", 1);
		Movie m2 = new Movie("Lion King", 2);
		
		Customer c = new Customer("Jack Jackson");
		c.addRental(new Rental(m0, 3));
		c.addRental(new Rental(m1, 1));
		c.addRental(new Rental(m2, 5));
		
		System.out.println(c.statement());
	}
	
}
