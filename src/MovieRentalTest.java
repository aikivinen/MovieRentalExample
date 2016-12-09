public class MovieRentalTest {
	
	public static void main(String[] args){
		Movie m0 = new Movie("Star Wars", Movie.PriceCode.REGULAR);
		Movie m1 = new Movie("Doctor Strange", Movie.PriceCode.NEW_RELEASE);
		Movie m2 = new Movie("Lion King", Movie.PriceCode.CHILDRENS);
		
		Customer c = new Customer("Jack Jackson");
		c.addRental(new Rental(m0, 3));
		c.addRental(new Rental(m1, 1));
		c.addRental(new Rental(m2, 5));
		
		System.out.println(c.statement());
	}
	
}
