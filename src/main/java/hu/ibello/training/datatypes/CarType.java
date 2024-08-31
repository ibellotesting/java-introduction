package hu.ibello.training.datatypes;

public enum CarType {

	// A lehetséges értékek:
	
	SEDAN("Családok számára komfortos"),
	SUV("Családi terepjáró"),
	SPORTS("Nagy sebesség és teljesítmény");
	
	// Mezők:
	
	private final String description;

	// A konstruktor, ami nyugodtan lehet privát, hiszen más nem fogja meghívni:
	
	private CarType(String description) {
		this.description = description;
	}
	
	// Metódusok:
	
	public String getDescription() {
		return description;
	}
}
