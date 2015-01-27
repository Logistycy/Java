package pl.lodz.uni.math;

public class Main {

	public static void main(String[] args) {

		ApartamentKreator ac = new ApartamentKreator("One");

		ApartamentKreator ac2 = new ApartamentKreator("Two");

		ac.addApartment(2, 1, 11);

		ac.showAppartments("One");

		ac2.addApartment(5, 3, 9);

		ac2.showAppartments("Two");

		ac.zamienPietra(ac, ac2);
		ac.zamienWindami(ac, ac2);

		ac.zamienMieszkaniami(ac, ac2);

		ac.showAppartments("One");

		ac2.showAppartments("Two");

	}

}
