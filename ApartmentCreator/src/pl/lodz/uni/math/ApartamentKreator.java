package pl.lodz.uni.math;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ApartamentKreator extends Apartament {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((miesz == null) ? 0 : miesz.hashCode());
		result = prime * result + ((piet == null) ? 0 : piet.hashCode());
		result = prime * result + ((wind == null) ? 0 : wind.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApartamentKreator other = (ApartamentKreator) obj;
		if (miesz == null) {
			if (other.miesz != null)
				return false;
		} else if (!miesz.equals(other.miesz))
			return false;
		if (piet == null) {
			if (other.piet != null)
				return false;
		} else if (!piet.equals(other.piet))
			return false;
		if (wind == null) {
			if (other.wind != null)
				return false;
		} else if (!wind.equals(other.wind))
			return false;
		return true;
	}

	private static final Logger logger = LogManager
			.getLogger(ApartamentKreator.class);
	Pietro piet = new Pietro();
	Winda wind = new Winda();
	Mieszkanie miesz = new Mieszkanie();

	public ApartamentKreator(String nazwa) {

		setNazwa(nazwa);

	}

	public void addApartment(int pietra, int windy, int mieszkania) {

		piet.setIloscPieter(pietra);
		wind.setIloscWind(windy);
		miesz.setIloscMieszkan(mieszkania);

	}

	public void showAppartments(String nazwa) {

		logger.debug("Apartament: " + nazwa);
		logger.debug("pietra: " + piet.getIloscPieter());
		logger.debug("windy: " + wind.getIloscWind());
		logger.debug("mieszkania: " + miesz.getIloscMieszkan());
		logger.debug("nazwa: " + nazwa);
		logger.debug(" ");
	}

	public void zamienPietra(ApartamentKreator ac, ApartamentKreator ac2) {
		int pietroApartamentu1;
		int pietroApartamentu2;

		pietroApartamentu1 = ac.piet.getIloscPieter();
		pietroApartamentu2 = ac2.piet.getIloscPieter();

		ac.piet.setIloscPieter(pietroApartamentu2);
		ac2.piet.setIloscPieter(pietroApartamentu1);

	}

	public void zamienWindami(ApartamentKreator ac, ApartamentKreator ac2) {
		int windaApartamentu1;
		int windaApartamentu2;

		windaApartamentu1 = ac.wind.getIloscWind();
		windaApartamentu2 = ac2.wind.getIloscWind();

		ac.wind.setIloscWind(windaApartamentu2);
		ac2.wind.setIloscWind(windaApartamentu1);

	}

	public void zamienMieszkaniami(ApartamentKreator ac, ApartamentKreator ac2) {

		int mieszkaniaApartamentu1;
		int mieszkaniaApartamentu2;

		mieszkaniaApartamentu1 = ac.miesz.getIloscMieszkan();
		mieszkaniaApartamentu2 = ac2.miesz.getIloscMieszkan();

		ac.miesz.setIloscMieszkan(mieszkaniaApartamentu2);
		ac2.miesz.setIloscMieszkan(mieszkaniaApartamentu1);

	}

}
