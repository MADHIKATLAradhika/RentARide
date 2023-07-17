package carRider;

import java.util.Scanner;
import java.util.*;

public class DriverSelection {
	public static void main(String[] args) {
		String destination=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer Ride Distance: ");
		double customer_Distance = sc.nextDouble();
		System.out.println("Car Requested are : Sedan HatchBack 5Seater");
		System.out.print("Car Requested: ");
		String carRequested = sc.next();
		List<Driver> drivers = new ArrayList<>();
		List<Seaters> drivers1 = new ArrayList<>();
		System.out.println("List of Drivers with Details:");
		switch (carRequested) {
		case "Sedan":
			drivers.add(new Driver("A", "Sedan", 4, 500));
			drivers.add(new Driver("B", "HatchBack", 4.3, 1));
			drivers.add(new Driver("C", "5 Seater", 4.8, 200));
			drivers.add(new Driver("D", "Sedan", 4.1, 700));
			drivers.add(new Driver("E", "HatchBack", 4.7, 430));
			for (Driver d : drivers)
				System.out.println(
						
						d.getName() + " " + d.getCarModel() + " " + d.getRating() + " " + d.getDistanceFromCustomer());
			break;

		case "HatchBack":
			drivers.add(new Driver("A", "HatchBack", 3, 500));
			drivers.add(new Driver("B", "HatchBack", 4.3, 1));
			drivers.add(new Driver("C", "5 Seater", 4.8, 200));
			drivers.add(new Driver("D", "Sedan", 4.1, 700));
			drivers.add(new Driver("E", "HatchBack", 4.7, 430));
			for (Driver d : drivers)
				System.out.println(
						d.getName() + " " + d.getCarModel() + " " + d.getRating() + " " + d.getDistanceFromCustomer());
			break;

		case "5Seater":
			

			drivers1.add(new Seaters("A", "5 Seater", 4.0, 500, List.of("Gurgaon", "Noida", "Delhi")));
			drivers1.add(new Seaters("B", "HatchBack", 4.3, 1000, List.of("Noida")));
			drivers1.add(new Seaters("C", "5 Seater", 4.8, 200, List.of("Noida")));
			drivers1.add(new Seaters("D", "Sedan", 4.1, 700, List.of("Noida")));
			drivers1.add(new Seaters("E", "5 Seater", 4.7, 430, List.of("Delhi")));
			for (Seaters d : drivers1)
				System.out.println(d.getName() + " " + d.getCarModel() + " " + d.getRating() + " "
						+ d.getDistanceFromCustomer() + " " + d.getPreferredDestinations());
			System.out.println("Destination: ");
			destination = sc.next();
			break;
		default:
			System.out.println("Sorry! you could n't select the perfect car listed");
			return;
		}

		List<Driver> filteredDrivers = new ArrayList<>();
		List<Seaters> filteredDrivers1 = new ArrayList<>();

		if (carRequested.equals("Sedan") || carRequested.equals("hatchBack")) {
			for (Driver driver : drivers) {
				if (driver.getRating() >= 4.0 && driver.getCarModel().equals(carRequested))
					filteredDrivers.add(driver);
			}
			Driver closestDriver = null;
			double minDistance = Double.MAX_VALUE;
			for (Driver driver1 : filteredDrivers) {
				double distance = driver1.getDistanceFromCustomer();
				if (distance < minDistance) {
					minDistance = distance;
					closestDriver = driver1;
				}
			}

			
			if (closestDriver != null) {
				System.out.println("Driver " + closestDriver.getName() + " will take you to the destination.");
				double totalCharge = customer_Distance * 8.0;
				System.out.println("Your charge will be Rs " + totalCharge);
			} else {
				System.out.println("No suitable driver available for your request.");
			}
		}
		else if (carRequested.equals("5Seater")) {
			for (Seaters driver : drivers1) {
				if (driver.getRating() >= 4.0 && driver.getPreferredDestinations().contains(destination)) {
					filteredDrivers1.add(driver);

				}

			}

		
			Seaters closestDriver = null;
			double minDistance = Double.MAX_VALUE;
			//System.out.println(minDistance);
			for (Seaters driver1 : filteredDrivers1) {
				double distance = driver1.getDistanceFromCustomer();
				if (distance < minDistance) {
					minDistance = distance;
					closestDriver = driver1;
					
					System.out.println(closestDriver.getPreferredDestinations());
					
				}
			}
			//System.out.println(closestDriver.getPreferredDestinations());

			if (closestDriver != null) {
				System.out.println("Driver " + closestDriver.getName() + " will take you to the destination.");
				double totalCharge = customer_Distance * 8.0;
				System.out.println("Your charge will be Rs " + totalCharge);
			} else {
				System.out.println("No suitable driver available for your request.");
			}

		}
	}
}
