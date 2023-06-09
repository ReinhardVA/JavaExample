package Package1;

public class SUV extends Arac{
	
	int gunlukUcret = 400;
	
	@Override
	public int GunlukAracKirala() {
		int ucret = super.GunlukAracKirala();
		int komisyon = 500;
		ucret += komisyon;
		return ucret;
	}

	@Override
	public int AylikAracKirala() {
		int ucret = super.AylikAracKirala();
		int komisyon = 400;
		ucret += komisyon;
		return ucret;
	}

	
	
}
