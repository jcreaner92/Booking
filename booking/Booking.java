package booking;

/**
 * Created by John Creaner on 26/10/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Booking
{  // Declaring variables
   private final Parking parking;
   private Flight flight;
   private Passenger passenger;
   private Covid19 covid19;

   // Constructor
   public Booking(){
      this.parking = new Parking();
      this.flight = new Flight();
      this.passenger = new Passenger();
      this.covid19 = new Covid19();
   }

   public Parking getParking()
   {
      return parking;
   }

   public Flight getFlight()
   {
      return flight;
   }

   public Passenger getPassenger()
   {
      return passenger;
   }

   public Covid19 getCovid19()
   {
      return covid19;
   }

   // Returning the properties of the class as a string
   public String toString()
   {
      return "Your Booking is complete, your details are below \n\n" +
            parking.toString() + "\n"+
            flight.toString() + "\n"+
            passenger.toString() + "\n"+
            covid19.toString();
   }
}//class
