package pl.lodz.uni.math;

import java.util.HashMap;
import java.util.Map;

public class Appartment {

	static int pietra, windy;
	static int mieszkania;
	String nazwa;

	public Appartment(int pietra, int windy, int mieszkania, String nazwa) {

		Appartment.pietra = pietra;
		Appartment.windy = windy;
		Appartment.mieszkania = mieszkania;
		this.nazwa = nazwa;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}
