package pl.lodz.uni.math;

public class main {

	public static void main(String[] args) {

		AppartmentCreator ac = new AppartmentCreator(2, 1, 11, "One");

		AppartmentCreator ac2 = new AppartmentCreator(5, 3, 9, "Two");

		ac.addApartment(2, 1, 11, "One");

		ac.showAppartments("One");

		ac2.addApartment(5, 3, 9, "Two");

		ac2.showAppartments("Two");

		ac.zamienPietra(ac, ac2);
		ac.zamienWindami(ac, ac2);

		ac.zamienMieszkaniami(ac, ac2);

		ac.showAppartments("One");

		ac2.showAppartments("Two");

	}

}
