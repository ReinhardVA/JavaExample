package Package1;

public abstract class Arac {
		
	private int kiralananGun;
	protected int gunlukUcret;
	private int bagajKapasitesi;
	private String renk;
	
	public int getBagajKapasitesi() {
		return bagajKapasitesi;
	}

	public void setBagajKapasitesi(int bagajKapasitesi) {
		this.bagajKapasitesi = bagajKapasitesi;
	}

	public String getRenk() {
		return renk;	
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int GunlukAracKirala() {
		int ucret = kiralananGun * gunlukUcret;
		return ucret;
	}
	
	public int AylikAracKirala() {
		int ucret = 30 * gunlukUcret;
		return ucret;
	}

	public int getKiralananGun() {
		return kiralananGun;
	}

	public void setKiralananGun(int kiralananGun) {
		this.kiralananGun = kiralananGun;
	}

	public int getGunlukUcret() {
		return gunlukUcret;
	}

	public void setGunlukUcret(int gunlukUcret) {
		this.gunlukUcret = gunlukUcret;
	}
	
	
}
