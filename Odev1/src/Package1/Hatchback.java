package Package1;

public class Hatchback extends Arac{
	
	int gunlukUcret = 200;
	
	@Override
	public int GunlukAracKirala() {
		// TODO Auto-generated method stub
		int komisyon = 300;
		int ucret = super.GunlukAracKirala();
		ucret += komisyon;
		return ucret;
	}
	
}
