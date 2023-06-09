package Package1;

public class Sedan extends Arac{

	int gunlukUcret = 350;
	@Override
	public int GunlukAracKirala() {
		int ucret = super.GunlukAracKirala();
		int komisyon = 400;
		ucret += komisyon;
		return ucret;
	}

	@Override
	public int AylikAracKirala() {
		int ucret = super.AylikAracKirala();
		int komisyon = 300;
		ucret += komisyon;
		return ucret;
	}
	
	
}
