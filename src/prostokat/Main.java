package prostokat;

public class Main {

	public static void main(String[] args) {
		prostokat p1  = new prostokat(7,7,4,6); // 3 argument - polozenie x, 4 argument - polozenie y
		System.out.println("Utworzony prostokat"); 
		System.out.println(p1.polozenie()); // podanie wps�rz�dnych wierzcho�k�w oraz d�ugo�ci x i y
		p1 = p1.przesun(8,8); // przesylane argumnety to nowa pozycja srodkowa
		System.out.println("Przesuniety prostokat prostokat"); 
		System.out.println(p1.polozenie());
		p1 = p1.obroc(3); // obraca prostokat o 90 stopni o podana ilosc razy
		System.out.println("Obr�cony prostokat"); 
		System.out.println(p1.polozenie());
		p1 = p1.rozciaganie(4,4); // rozciaga prostokat o podane argumenty w wysokosci i szerokosci
		System.out.println("Rozci�gni�ty prostokat prostokat"); 
		System.out.println(p1.polozenie());
		

	}

}
