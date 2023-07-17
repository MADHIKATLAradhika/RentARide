package carRider;

import java.util.List;

public class Seaters {
	protected String name;
    protected String carModel;
    protected double rating;
    protected double distanceFromCustomer;
    protected List<String> preferredDestinations;
	
	 public  Seaters(String name, String carModel, double rating, double distanceFromCustomer, List<String> preferredDestinations) {
	        this.name = name;
	        this.carModel = carModel;
	        this.rating = rating;
	        this.distanceFromCustomer = distanceFromCustomer;
	        this.preferredDestinations = preferredDestinations;
	        
	    }
	 public String getName() {
	        return name;
	    }

	    public String getCarModel() {
	        return carModel;
	    }

	    public double getRating() {
	        return rating;
	    }

	    public double getDistanceFromCustomer() {
	        return distanceFromCustomer;
	    }

	    public List<String> getPreferredDestinations() {
	        return preferredDestinations;
	    }
	 
	 
	

}
