/*
Brief Description: This Java class file contains the properties of the class Temperature. In this class contains 4 constructors, 4 accessors and 3 mutators. This object also contains methods that convert celsius to fahrenheit and methods to check equality.
 */
public class Temperature {
	// Member variable of class
	// Instance variable
	private double degree;
	private char scale;
	private int number = 0;
	private static int numberObjects = 0;

	// 4 Overload Constructors
	// Initialize Default Constructor No Arguments
	public Temperature() {
		degree = 0.0;
		scale = 'C';
		number = numberObjects;
		numberObjects++;
	}

	// Initialize Constructor with Arguments
	public Temperature(double degree) {
		this.degree = degree;
		this.scale = 'C';
		number = numberObjects;
		numberObjects++;
	}

	// Initialize Constructor with Arguments
	public Temperature(char scale) {
		this.scale = scale;
		this.degree = 0.0;
		number = numberObjects;
		numberObjects++;
	}

	// Initialize Constructor with Arguments
	public Temperature(double degree, char scale) {

		this.degree = degree;
		this.scale = scale;
		number = numberObjects;
		numberObjects++;
	}

	// Extra Methods created to make project more advanced
	public double getDegree() {
		return degree;
	}

	public char getScale() {
		return scale;
	}

	public String getNumber() {
		String[] numberStrings = { "first", "second", "third", "fourth" };
		String numberString = numberStrings[number];
		return numberString;
	}

	// getMethod, getDegreeInCelsius will return the temperature’s degree in its
	// equivalent Celsius degree.
	public double getDegreeInCelsius() {
		// If the temperature’s scale is ‘C’, then the return value is temperature’s
		// degree.
		// If the temperature’s scale is ‘F’, the return value is calculated by the
		// following formula: C = (F-32)*5/9.
		return (scale == 'C') ? degree : ((degree - 32) * 5) / 9.0;
	}

	// getMethod, getDegreeInFahrenheit will return the temperature’s degree in its
	// equivalent Fahrenheit degree.
	public double getDegreeInFahrenheit() {
		// If the temperature’s scale is ‘F’, then the return value is temperature’s
		// degree.
		// If the temperature’s scale is ‘C’, the return value is calculated by the
		// following formula: F = 1.8C+32.
		return (scale == 'F') ? degree : (1.8 * degree) + 32;

	}

	// setMethod
	public void setDegree(double degree) {
		this.degree = degree;
	}

	// setMethod
	public void setDegree(char scale) {
		this.scale = scale;
	}

	// setMethod
	public void setDegree(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}

	// Method
	// equalsmethod returns true if this temperature is equal to parameter
	// Temperature; false otherwise.
	public boolean equals(Temperature obj) {
		// Compare under same scale.
		if (this.scale == obj.scale) {
			// Compare two temperatures.
			return this.degree == obj.degree;
		}
		// Compare whether getDegreeInCelsius return same value for both temperatures
		return this.getDegreeInCelsius() == obj.getDegreeInCelsius();
	}

	// Method
	// isLessThan method returns true if this temperature is less than parameter
	// Temperature false otherwise.
	public boolean isLessThan(Temperature obj) {
		// Compare under same scale.
		if (this.scale == obj.scale) {
			// Compare two temperatures.
			return this.degree < obj.degree;
		}
		// Compare in getDegreeInCelsius
		return this.getDegreeInCelsius() < obj.getDegreeInCelsius();
	}

	// Method
	// isGreaterThan method returns true if this temperature is greater than
	// parameter Temperature; false otherwise. Again, you need to compare two
	// temperatures under same scale
	public boolean isGreaterThan(Temperature obj) {
		// Compare under same scale.
		if (this.scale == obj.scale) {
			// Compare two temperatures
			return this.degree > obj.degree;
		}
		// Compare in getDegreeInCelsius
		return this.getDegreeInCelsius() > obj.getDegreeInCelsius();
	}

}
