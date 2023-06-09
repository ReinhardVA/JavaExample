package Package1;

public class Sahsi {
	public void aracKirala(Hatchback hatchback , int kiralananGun) {
		int ucret;
		if(kiralananGun<30) {
			hatchback.setKiralananGun(kiralananGun);
			hatchback.setGunlukUcret(hatchback.gunlukUcret);
			ucret = hatchback.GunlukAracKirala();
			System.out.println("Sedan aracı " + kiralananGun + " günlüğüne kiraladınız: " + ucret + " TL" );
		}
		else {
			hatchback.setKiralananGun(kiralananGun);
			hatchback.setGunlukUcret((hatchback.gunlukUcret)*30);
			ucret = hatchback.GunlukAracKirala();
			System.out.println("Sedan aracı " + kiralananGun + " günlüğüne kiraladınız: " + ucret + " TL" );
		}
	}
}
