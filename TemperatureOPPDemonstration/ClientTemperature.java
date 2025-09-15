import java.util.Scanner;

/*
Brief Description: This is the client file that is created to run the class Temperature. This file test the creation of Temperature objects. Each creation of an object will the the constructors, mutators, accessor and methods. In this file methods have been created at the bottom to print results in order to save better facilitate clean code.
 */

public class ClientTemperature {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		// Initialize variables
		double degree;
		char scale;

		// 1.Create a Temperature object by calling default constructor
		// Initiate first object
		Temperature temp1 = new Temperature();

		// 1.5 Printout Object variables
		System.out.println("The first Temperature has been created using the default constructor which sets");
		System.out.printf("the degree to a deafault value of %.2f and the scale to a default value of C.\n",
				temp1.getDegree());

		// Step 2 and step 3 are combined into printTemperature Method
		printTemperature(temp1);

		// 4. Ask user to enter the scale and degree of the temperature
		System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature.");
		System.out.print("First set the degree: ");
		// Validate Double input
		while (!(input.hasNextDouble())) {
			System.out.println("Must be a number.");
			input.next(); // Clear the invalid input
			input.nextLine();// Clear the buffer
		}
		degree = input.nextDouble();

		// Validate Character input
		System.out.print("Now set the scale: ");
		do {
			scale = input.next().charAt(0);
			if (!(scale == 'F' || scale == 'C')) {
				System.out.println("Scale must be F or C");
			}
			input.nextLine();// Clear the buffer
		} while (!(scale == 'F' || scale == 'C'));

		// 5. Call set method(s) to set the temperature’s degree and scale
		temp1.setDegree(degree, scale);
		// Step 6 and 7 are combined into print2Temperature
		print2Temperature(temp1);

		System.out.println("-------------------------------------------------------------\n");

		// 7. Repeat step 1 to 7 for all other three constructors to create three more
		// temperatures

		// Temperature 2
		// --------------------------------------------------------------------------
		Temperature temp2 = new Temperature(32);
		System.out.printf("The %s Temperature has been created using the constructor with a double agrument.\n",
				temp2.getNumber());
		System.out.println("Which set degree to this arugment and the scale to a default value of C.");
		System.out.printf("In my code,I passed %.2f to the double argument. So\n", temp2.getDegree());
		printTemperature(temp2);

		// Ask user to enter the scale and degree of the temperature
		System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature.");
		System.out.print("First set the degree: ");
		// Validate Double input
		while (!(input.hasNextDouble())) {
			System.out.println("Must be a number.");
			input.next(); // Clear the invalid input
			input.nextLine();// Clear the buffer
		}
		degree = input.nextDouble();

		// Validate Character input
		System.out.print("Now set the scale: ");
		do {
			scale = input.next().charAt(0);
			if (!(scale == 'F' || scale == 'C')) {
				System.out.println("Scale must be F or C");
			}
			input.nextLine();// Clear the buffer
		} while (!(scale == 'F' || scale == 'C'));

		// Call set method(s) to set the temperature’s degree and scale
		temp2.setDegree(degree, scale);

		// Step 6 and 7 are combined into print2Temperature
		printTemperature(temp2);

		System.out.println("-------------------------------------------------------------\n");

		// Temperature3
		// -------------------------------------------------------------------
		Temperature temp3 = new Temperature('F');
		System.out.printf("The %s Temperature has been created using constucter which sets\n", temp3.getNumber());
		System.out.println("the degree to a default value of 0.0 and the scale to char argument.");
		System.out.printf("In my code,I passed %.2s to argument. So\n", temp3.getScale());
		print2Temperature(temp3);

		// Ask user to enter the scale and degree of the temperature
		System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature.");
		System.out.print("First set the degree: ");
		// Validate Double input
		while (!(input.hasNextDouble())) {
			System.out.println("Must be a number.");
			input.next(); // Clear the invalid input
			input.nextLine();// Clear the buffer
		}
		degree = input.nextDouble();

		// Validate Character input
		System.out.print("Now set the scale: ");
		do {
			scale = input.next().charAt(0);
			if (!(scale == 'F' || scale == 'C')) {
				System.out.println("Scale must be F or C");
			}
			input.nextLine();// Clear the buffer
		} while (!(scale == 'F' || scale == 'C'));

		// Call set method(s) to set the temperature’s degree and scale
		temp3.setDegree(degree, scale);

		// Step 6 and 7 are combined into print2Temperature
		print2Temperature(temp3);

		System.out.println("-------------------------------------------------------------\n");

		// Temperature4
		// -------------------------------------------------------------------
		Temperature temp4 = new Temperature(98.6, 'F');
		System.out.printf("The %s Temperature has been created using constucter which sets\n", temp4.getNumber());
		System.out.println("the degree to a double agrument and the scale to char argument.");
		System.out.printf("In my code,I passed %.2f and %s to the agruments. So\n", temp4.getDegree(),
				temp4.getScale());
		printTemperature(temp4);

		// Ask user to enter the scale and degree of the temperature
		System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature.");
		System.out.print("First set the degree: ");
		// Validate Double input
		while (!(input.hasNextDouble())) {
			System.out.println("Must be a number.");
			input.next(); // Clear the invalid input
			input.nextLine();// Clear the buffer
		}
		degree = input.nextDouble();

		// Validate Character input
		System.out.print("Now set the scale: ");
		do {
			scale = input.next().charAt(0);
			if (!(scale == 'F' || scale == 'C')) {
				System.out.println("Scale must be F or C");
			}
			input.nextLine();// Clear the buffer
		} while (!(scale == 'F' || scale == 'C'));

		// Call set method(s) to set the temperature’s degree and scale
		temp4.setDegree(degree, scale);

		// Step 6 and 7 are combined into print2Temperature
		print2Temperature(temp4);

		System.out.println("-------------------------------------------------------------\n");

		// Declare Temperature Array
		Temperature tempArray[] = { temp1, temp2, temp3, temp4 };
		// Print Array
		System.out.print("In order of creation the Temperatures in Celcius are: ");
		for (Temperature temp : tempArray) {
			System.out.printf("%.2f, ", temp.getDegreeInCelsius());
		}
		System.out.println();
		System.out.print("In order of creation the Temperatures in Fahrenheit are: ");
		for (Temperature temp : tempArray) {
			System.out.printf("%.2f, ", temp.getDegreeInFahrenheit());
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------\n");

		// Checking Equalities
		// ---------------------------------------------------------------
		// Combine step 9, 10, 11 into printEqualities
		printEqualities(temp1, temp2);
		System.out.println();
		printEqualities(temp1, temp3);
		System.out.println();
		printEqualities(temp1, temp4);
		System.out.println();
		printEqualities(temp2, temp3);
		System.out.println();
		printEqualities(temp2, temp4);
		System.out.println();
		printEqualities(temp3, temp4);

	}

	// First print method steps 1 and 2
	public static void printTemperature(Temperature obj) {
		// 2. Print out the temperature’s degree in Celsius
		System.out.printf("The %s Temperature is: %.2f C.\n", obj.getNumber(), obj.getDegreeInCelsius());

		// 3. Print out the temperature’s degree in Fahrenheit
		System.out.printf("The %s Temperature is: %.2f F.\n", obj.getNumber(), obj.getDegreeInFahrenheit());

	}

	// Second print method step 4
	public static void print2Temperature(Temperature obj) {
		if (obj.getScale() == 'C') {
			// 2. Print out the temperature’s degree in Celsius
			System.out.printf("Now the %s Tempeautre is %.2f C.\nwhich is %.2f F.\n", obj.getNumber(),
					obj.getDegreeInCelsius(), obj.getDegreeInFahrenheit());
		} else {
			System.out.printf("Now the %s Tempeautre is %.2f F.\nwhich is %.2f C.\n", obj.getNumber(),
					obj.getDegreeInFahrenheit(), obj.getDegreeInCelsius());

		}
	}

	public static void printEqualities(Temperature obj1, Temperature obj2) {
		// 9. Test if temperature1 equals temperature2 and print out appropriate message

		if (obj1.equals(obj2)) {
			System.out.printf("The %s temperature is equal to the %s.\n", obj1.getNumber(), obj2.getNumber());
		} else {
			System.out.printf("The %s temperature is not equal to the %s.\n", obj1.getNumber(), obj2.getNumber());
		}

		// 0. Test if temperature1 is less than temperature2 and print out appropriate
		// message
		if (obj1.isLessThan(obj2)) {
			System.out.printf("The %s temperature is less than the %s.\n", obj1.getNumber(), obj2.getNumber());
		} else {
			System.out.printf("The %s temperature is not less than the %s.\n", obj1.getNumber(), obj2.getNumber());
		}
		// 11. Test if temperature1 is greater than temperature2 and print out
		// appropriate message
		if (obj1.isGreaterThan(obj2)) {
			System.out.printf("The %s Temperature is greater than the %s.\n", obj1.getNumber(), obj2.getNumber());
		} else {
			System.out.printf("The %s Temperature is not greater than the %s.\n", obj1.getNumber(), obj2.getNumber());
		}
	}

}
