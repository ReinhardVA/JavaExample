package Package1;

public class Client {

	public static void main(String[] args) {
		
		Sirket dr = new Sirket();
		Sahsi sahsi = new Sahsi();
		
		Sedan sedan = new Sedan();
		SUV suv = new SUV();
		Hatchback HB = new Hatchback();
		
		dr.aracKirala(sedan, 30);
		dr.aracKirala(suv, 30);
		dr.aracKirala(HB, 30);
		
		sahsi.aracKirala(HB, 30);
		
	}

}
