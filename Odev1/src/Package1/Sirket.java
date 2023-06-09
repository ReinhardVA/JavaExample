package Package1;

public class Sirket {
	public void aracKirala(Sedan sedan , int kiralananGun) {
		int ucret;
		if(kiralananGun<30) {
			sedan.setKiralananGun(kiralananGun);
			sedan.setGunlukUcret(sedan.gunlukUcret);
			ucret = sedan.GunlukAracKirala();
			System.out.println("Sedan aracı " + kiralananGun + " günlüğüne kiraladınız: " + ucret + " TL" );
		}
		else {
			sedan.setKiralananGun(kiralananGun);
			sedan.setGunlukUcret((sedan.gunlukUcret)*30);
			ucret = sedan.GunlukAracKirala();
			System.out.println("Sedan aracı " + kiralananGun + " günlüğüne kiraladınız: " + ucret + " TL" );
		}
	}
	
	public void aracKirala(SUV SUV , int kiralananGun) {
		int ucret;
		if(kiralananGun<30) {
			SUV.setKiralananGun(kiralananGun);
			SUV.setGunlukUcret(SUV.gunlukUcret);
			ucret = SUV.GunlukAracKirala();
			System.out.println("Sedan aracı " + kiralananGun + " günlüğüne kiraladınız: " + ucret + " TL" );
		}
		else {
			SUV.setKiralananGun(kiralananGun);
			SUV.setGunlukUcret((SUV.gunlukUcret)*30);
			ucret = SUV.GunlukAracKirala();
			System.out.println("Sedan aracı " + kiralananGun + " günlüğüne kiraladınız: " + ucret + " TL" );
		}
	}
	
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
