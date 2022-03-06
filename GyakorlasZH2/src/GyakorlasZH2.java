import java.util.Scanner;

public class GyakorlasZH2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ugat(5); //<---TAGFUGGVENY ES ARGOMENTUM
		//hello(); 
		//teglalapTerulet(); //Itt is meg kell lennie!!!
		//szamol();
		//parosSzam(2);
		/*int a = beolvas();
		int b = beolvas();
		kiir(kerulet(a,b), terulet(a,b));*/
		
		/*int x = szam();
		int y = szam();
		eredmeny(szorzas(x,y));*/
		
		double x = forint();
		double y = euro();
		double ax = arfolyamvetel(y);
		double ay = arfolyamkozep(y);
		double az = arfolyamelad(y);
		arfolyamkiir(arfolyamvetel(y), arfolyamkozep(y), arfolyamelad(y), arfolyamkiszamol(x,az));
		euroapro(arfolyamkiszamol(x,az));			
		
//===================================================================================================================
		
		/*// hogyan kell Scannerbol beolvasni char
		Scanner be = new Scanner(System.in);
		System.out.println("Kerek egy karaktert:");
		// ha hosszabb bemenetet kapsz, akkor is csak az 1. karaktert menti el
		char x = be.next().charAt(0);
		System.out.println("A beolvasott karakter: " + x);*/
		
//===================================================================================================================	
		
		/*String mondat = "Piros alma van ma a fa alatt";//Karaktert negszamlal
		int db = 0;*/
		
		// 1. charAt()
		/*for(int i=0;i<mondat.length();i++) {
			if(mondat.toLowerCase().charAt(i) == 'a' ) {
				db++;
			}
		}
		
		System.out.println("A \"a\" betuk szama: " + db);*/
		
		// 2. karakter tombos
		/*char[] kt = mondat.toCharArray();
		for(int i=0;i<kt.length;i++) {
			// Character.toLowerCase(KARAKTER_HELYE)
			if(Character.toLowerCase(kt[i]) == 'a' ) {
				db++;
			}
		}
		System.out.println("A \"a\" betuk szama: " + db);*/
		
//===================================================================================================================
		
		// egy szovegben alakitsuk az osszes maganhangot '0' beture
		/*String mh = "aeiou";
		String arviz = "Piros alma van ma a fa alatt";
		char[] arvizCh = arviz.toCharArray();
		
		for(int i=0;i<mh.length();i++) {
			for(int j=0;j<arvizCh.length;j++) {
				if(mh.charAt(i) == Character.toLowerCase(arvizCh[j])) {
					arvizCh[j] = '0';
				}
			}
		}
		System.out.println(new String(arvizCh));*/

//===================================================================================================================		

		// irjunk programot, ami general 5db maganhangzot veletlenszereen
		/*String mh = "abcdefghijklmnopqrstuvwxyz0123456789";
		int general;
		String mhk = "";
		
		for(int i=0;i<6;i++) {
			general = (int) (Math.random() * mh.length());
			mhk += mh.charAt(general);
		}*/

//===================================================================================================================		
		
		/*// Kerd a teljes nevet es irjuk ki a kert nevnek az utolso karakteret.
		// Pl.: F�l Elem�r -> LR
		//indexOf(), substring()
		
		String nev = "Kis Oliver".toUpperCase();
		int szokoz = nev.indexOf(' ');
		
		System.out.println(nev.substring(szokoz-1,szokoz) 
				+ nev.substring(nev.length()-1,nev.length()-0));*/	
		
		// Kerd a teljes nevet es irjuk ki a kert nevnek az utolso karakteret. //Monogram
		// Pl.: F�l Elem�r -> LR
		//indexOf(), substring()
		
		/*String nev = "Kis Oliver".toUpperCase();
		int szokoz = nev.indexOf(' ');
		char x = nev.charAt(0);
		
		System.out.println(x + nev.substring(szokoz,szokoz+2));*/
		
//===================================================================================================================
		
		// alaktisunk at egy e-mail cimet user@domain.hu -> user[kukac]domain[pont]hu
		
		/*String email = "labamkozottvanegy@gmail.com";
		int kukac = email.indexOf('@');
		int pont = email.lastIndexOf('.');
		
		System.out.println(email.substring(0,kukac) + " [kukac] " 
				+ email.substring(kukac+1,pont) + " [pont] " 
				+ email.substring(pont+1));*/
		
		// karaktertombos
		/*String email = "labamkozottvanegy@gmail.com";
		char[] mail = email.toCharArray();
		
		for(int i=0;i<mail.length;i++) {
			switch(mail[i]) {
				case '@' : System.out.print(" [kukac] "); break;
				case '.' : System.out.print(" [pont] "); break;
				default : System.out.print(mail[i]);
			}
		}*/
		
	}
//===================================================================================================================
	
	public static double forint() {//Kerem
		Scanner be = new Scanner(System.in);
		System.out.println("HUF->EUR valuta-deviza valto");
		System.out.println("Kerem az atvaltando (HUF) forintosszeget: ");
		return be.nextDouble();
	}
	public static double euro() {//Kerem
		Scanner be = new Scanner(System.in);
		System.out.println("Kerem a jelenlegi (EUR)EURO/(HUF)FORINT kozeparfolyamot: ");
		return be.nextDouble();
	}
	public static double arfolyamvetel(double y) {//Kiszamolom
		return y*0.972;
	}
	public static double arfolyamkozep(double y) {//Kiszamolom
		return y;
	}
	public static double arfolyamelad(double y) {//Kiszamolom
		return y*1.028;
	}
	public static double arfolyamkiszamol(double x,double az) {//Kiszamolom
		return Math.round(x/az*100.0)/100.0;
	}
	public static void arfolyamkiir(double arfolyamvetel,double arfolyamkozep, double arfolyamelad, double arfolyamkiszamol) {//Kiir
		System.out.println("Jelenlegi EUR valuta veteli arfolyam: " + Math.round(arfolyamvetel*100.0)/100.0);
		System.out.println("Jelenlegi EUR valuta kozep arfolyam: " + Math.round(arfolyamkozep*100.0)/100.0);
		System.out.println("Jelenlegi EUR valuta eladasi arfolyam: " + Math.round(arfolyamelad*100.0)/100.0);
		System.out.println();	
		System.out.println("Megadott forintosszeg erteke euroban (forint/eladasi arfolyam): " + arfolyamkiszamol);
		System.out.println();
	}
	
	public static void euroapro(double arfolyamkiszamol) {//Kiszamolom
		double otszaz = Math.floor(arfolyamkiszamol/500);
		arfolyamkiszamol = arfolyamkiszamol - 500*otszaz;
		if (otszaz>0) {System.out.println(otszaz + "db |-500-| EUR bankjegy");}
		double kettoszaz = Math.floor(arfolyamkiszamol/200);
		arfolyamkiszamol = arfolyamkiszamol - 200*kettoszaz;
		if (kettoszaz>0) {System.out.println(kettoszaz + "db |-200-| EUR bankjegy");}
		double szaz = Math.floor(arfolyamkiszamol/100);
		arfolyamkiszamol = arfolyamkiszamol - 100*szaz;
		if (szaz>0) {System.out.println(szaz + "db |-100-| EUR bankjegy");}
		double otven = Math.floor(arfolyamkiszamol/50);
		arfolyamkiszamol = arfolyamkiszamol - 50*otven;
		if (otven>0) {System.out.println(otven + "db |-50-| EUR bankjegy");}
		double husz = Math.floor(arfolyamkiszamol/20);
		arfolyamkiszamol = arfolyamkiszamol - 20*husz;
		if (husz>0) {System.out.println(husz + "db |-20-| EUR bankjegy");}
		double tiz = Math.floor(arfolyamkiszamol/10);
		arfolyamkiszamol = arfolyamkiszamol - 10*tiz;
		if (tiz>0) {System.out.println(tiz + "db |-10-| EUR bankjegy");}
		double ot = Math.floor(arfolyamkiszamol/5);
		arfolyamkiszamol = arfolyamkiszamol - 5*ot;
		if (ot>0) {System.out.println(ot + "db |-5-| EUR bankjegy");}

		double ketto = Math.floor(arfolyamkiszamol/2);
		arfolyamkiszamol = arfolyamkiszamol - 2*ketto;
		if (ketto>0) {System.out.println(ketto + "db (2 EUR) erme");}
		double egy = Math.floor(arfolyamkiszamol/1);
		arfolyamkiszamol = arfolyamkiszamol - 1*egy;
		if (egy>0) {System.out.println(egy + "db (1 EUR) erme");}

		double otvenc = Math.floor(arfolyamkiszamol/0.50);
		arfolyamkiszamol = arfolyamkiszamol - 0.50*otvenc;
		if (otvenc>0) {System.out.println(otvenc + "db (50 EUR CENT) erme");}
		double huszc = Math.floor(arfolyamkiszamol/0.20);
		arfolyamkiszamol = arfolyamkiszamol - 0.20*huszc;
		if (huszc>0) {System.out.println(huszc + "db (20 EUR CENT) erme");}
		double tizc = Math.floor(arfolyamkiszamol/0.10);
		arfolyamkiszamol = arfolyamkiszamol - 0.10*tizc;
		if (tizc>0) {System.out.println(tizc + "db (10 EUR CENT) erme");}
		double otc = Math.floor(arfolyamkiszamol/0.05);
		arfolyamkiszamol = arfolyamkiszamol - 0.05*otc;
		if (otc>0) {System.out.println(otc + "db (5 EUR CENT) erme");}
		double kettoc = Math.floor(arfolyamkiszamol/0.02);
		arfolyamkiszamol = arfolyamkiszamol - 0.02*kettoc;
		if (kettoc>0) {System.out.println(kettoc + "db (2 EUR CENT) erme");}
		double egyc = Math.floor(arfolyamkiszamol/0.01);
		arfolyamkiszamol = arfolyamkiszamol - 0.01*egyc;
		if (egyc>0) {System.out.println(egyc + "db (1 EUR CENT) erme");}
	}

//===================================================================================================================	
	
	/*public static void hello() {
	System.out.println("Hello");
	}*/
	
//===================================================================================================================	
	
	/*public static void ugat(int ugatasSzama) { //<---PARAMETER
		while(ugatasSzama > 0) {
			System.out.print("Ruff!");
			ugatasSzama = ugatasSzama - 1;
		}
	}*/

//===================================================================================================================		
	
	/*public static void teglalapTerulet() { //void = NINCS RETURN
		System.out.println("Kerem a teglalap oldalainak adatait!"); //A tobbi ugyanaz mint eddig!!!
		Scanner szam = new Scanner(System.in); //Scanner beelesitve
		int a;
		do {
			System.out.print("A oldal: ");
			a = szam.nextInt(); //A szam amit meg kell adni
		} while(szam.equals("")); //Var, hogy beird a szamot
		int b;
		do {
			System.out.print("B oldal: ");
			b = szam.nextInt(); //B szam amit meg kell adni
		} while(szam.equals("")); //Var, hogy beird a szamot
		int T = a * b;
		int K = 2 * (a + b);
		szam.close(); //Scanner kikapcs
		System.out.println("A teglalap kerulete: " + K + ". A teglalap terulete: " + T + ".");
	}*/
	
//===================================================================================================================	
	
	/*public static void szamol() {
		Scanner szam = new Scanner(System.in);
		double szazalek;
		do {
			System.out.print("Kerem a kedvezmenyt egesz szamban: ");
			szazalek = szam.nextInt(); //A szam amit meg kell adni
		} while(szam.equals("")); //Var, hogy beird a szamot
		double osszeg;
		do {
			System.out.print("Kerem az osszeget: ");
			osszeg = szam.nextInt(); //B szam amit meg kell adni
		} while(szam.equals("")); //Var, hogy beird a szamot
		kedvezmeny(szazalek, osszeg);
		szam.close(); //Scanner kikapcs
	}
	public static void kedvezmeny(double szazalek, double osszeg) {
		double eredmeny = (szazalek/100) * osszeg;
		System.out.println("A kedvezmenyes ar " + Math.round(eredmeny) + "Ft.");
	}*/
	
//===================================================================================================================	
	
	/*public static boolean parosSzam(int szam) { //if, LEHET TOBB RETURN IS
	if(szam % 2 == 0) return true;
	else return false;
	// ilyen esetben lehet tobb RETURN, mert csak az egyik fut le
	// egyszerre MAX. 1DB RETURN-t hasznalhatsz
	}*/
	
//===================================================================================================================	

	// 1. beolvas
	/*public static int beolvas() { //Inkabb ez
		Scanner be = new Scanner(System.in);
		System.out.println("Kerem a teglalap oldalat: ");
		return be.nextInt();
		// SCANNER-t NE ZARD LE, mert nem fog tobbszori hivaskor mukodni (OOP)
	}
	
	// 2. kerulet -> a beolvasott szamok alapjan hatarozzuk meg a keruletet
	public static int kerulet(int a, int b) {
		return 2 * (a + b);
	}
	
	// 3. terulet
	public static int terulet(int a, int b) {
		return a * b;
	}
	
	// 4. kiir
	public static void kiir(int kerulet, int terulet) {
		System.out.println("A teglalap kerelete: " + kerulet + ", terelete: " + terulet);
	}*/
	
//===================================================================================================================	
	
	/*public static int szam() {//kerem
		Scanner be = new Scanner(System.in);
		System.out.println("Kerem a szamot: ");
		return be.nextInt();
		
	}
	public static int szorzas(int x, int y) {//kiszamolom
		Scanner be = new Scanner(System.in);
		return x * y;
		
	}
	public static void eredmeny(int szorzas) {//kiirom
		System.out.println("A szorzas eredmenye: " + szorzas);		
	}*/
	
//===================================================================================================================

	
}
