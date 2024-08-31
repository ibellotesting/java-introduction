package hu.ibello.training.datatypes;

// Ha az osztálynak nem adunk ősosztályt, akkor az automatikusan a java.lang.Object-ből fog származni.

public class Car {

	// Mezők: Az objektum állapotát tároló változók,
	// amelyek minden példány számára külön értékekkel rendelkeznek.
	
	private String brand;
	private int year;
	private double price;
	
	// Konstruktor: Az objektum példányosításakor hívott speciális metódus,
	// amely az objektum inicializálására szolgál. (Több is lehet egy osztálynak.)
	
	public Car(String brand, int year, double price) {
		// A super() metódus a szülő osztály konstruktorát hívja,
		// paraméter nélküli explicit hívása nem szükséges, mert automatikusan megtörténik.
		super();
		// A this kulcsszóval lehet hivatkozni az osztálypéldány elemeire.
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	// Metódusok: Az osztály által végrehajtható műveletek és funkciók,
	// amelyek az objektum viselkedését határozzák meg.

	// Mezőkkel kapcsolatos metódusok, ún. getter-ek és setter-ek
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Metódus az autó adatainak megjelenítéséhez
	
	public void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
	}
}
