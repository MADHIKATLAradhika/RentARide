package carRider;

public class Driver {
	
     protected String name;
     protected String carModel;
     protected double rating;
     protected double distanceFromCustomer;
     

     public Driver(String name, String carModel, double rating, double distanceFromCustomer) {
         this.name = name;
         this.carModel = carModel;
         this.rating = rating;
         this.distanceFromCustomer = distanceFromCustomer;
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

	    
}


