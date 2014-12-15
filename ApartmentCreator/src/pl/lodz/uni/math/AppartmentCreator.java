package pl.lodz.uni.math;

import java.util.HashMap;
import java.util.Map;

public class AppartmentCreator extends Appartment {

	public AppartmentCreator(int pietra, int windy, int mieszkania, String nazwa) {
		super(pietra, windy, mieszkania, nazwa);
		Appartment ap = new Appartment(pietra, windy, mieszkania, nazwa);

	}

	Map<String, Integer> MapaPieter = new HashMap<String, Integer>();
	Map<String, Integer> MapaWind = new HashMap<String, Integer>();
	Map<String, Integer> MapaMieszkan = new HashMap<String, Integer>();

	public void addApartment(int pietra, int windy, int mieszkania, String nazwa) {

		MapaPieter.put(nazwa, pietra);
		MapaWind.put(nazwa, windy);
		MapaMieszkan.put(nazwa, mieszkania);

	}

	public void showAppartments(String nazwa) {

		System.out.println("Apartament: " + nazwa);
		System.out.println("pietra: " + MapaPieter.get(nazwa));
		System.out.println("windy: " + MapaWind.get(nazwa));
		System.out.println("mieszkania: " + MapaWind.get(nazwa));
		System.out.println("nazwa: " + nazwa);
		System.out.println(" ");
	}

	public void zamienPietra(AppartmentCreator ac, AppartmentCreator ac2) {
		int pietroApartamentu1;
		int pietroApartamentu2;

		String nazwaApartamentu1 = ac.getNazwa();

		String nazwaApartamentu2 = ac2.getNazwa();

		pietroApartamentu1 = ac.MapaPieter.get(nazwaApartamentu1);
		pietroApartamentu2 = ac2.MapaPieter.get(nazwaApartamentu2);

		ac.MapaPieter.remove(nazwaApartamentu1);
		ac2.MapaPieter.remove(nazwaApartamentu2);

		ac.MapaPieter.put(nazwaApartamentu1, pietroApartamentu2);
		ac2.MapaPieter.put(nazwaApartamentu2, pietroApartamentu1);

	}

	public void zamienWindami(AppartmentCreator ac, AppartmentCreator ac2) {
		int windaApartamentu1;
		int windaApartamentu2;

		String nazwaApartamentu1 = ac.getNazwa();

		String nazwaApartamentu2 = ac2.getNazwa();

		windaApartamentu1 = ac.MapaWind.get(nazwaApartamentu1);
		windaApartamentu2 = ac2.MapaWind.get(nazwaApartamentu2);

		ac.MapaWind.remove(nazwaApartamentu1);
		ac2.MapaWind.remove(nazwaApartamentu2);

		ac.MapaWind.put(nazwaApartamentu1, windaApartamentu2);
		ac2.MapaWind.put(nazwaApartamentu2, windaApartamentu1);

	}

	public void zamienMieszkaniami(AppartmentCreator ac, AppartmentCreator ac2) {

		int mieszkaniaApartamentu1;
		int mieszkaniaApartamentu2;

		String nazwaApartamentu1 = ac.getNazwa();

		String nazwaApartamentu2 = ac2.getNazwa();

		mieszkaniaApartamentu1 = ac.MapaMieszkan.get(nazwaApartamentu1);
		mieszkaniaApartamentu2 = ac2.MapaMieszkan.get(nazwaApartamentu2);

		ac.MapaMieszkan.remove(nazwaApartamentu1);
		ac2.MapaMieszkan.remove(nazwaApartamentu2);

		ac.MapaMieszkan.put(nazwaApartamentu1, mieszkaniaApartamentu2);
		ac2.MapaMieszkan.put(nazwaApartamentu2, mieszkaniaApartamentu1);
	}

}
