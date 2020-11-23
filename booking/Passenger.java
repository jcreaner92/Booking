package booking;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by John Creaner on 26/10/2020
 * Programme creates a passenger reading in from the keyboard
 * Asks number of passengers and bags
 * Creates a random seat number for each passenger
 */
public class Passenger
{
   // Declaring variables
   public final int passengerQuantity;
   private final int passengerBaggage;
   private final String passengerName;
   private final String [] seat;

   // Constructor method
   public Passenger(){
      // Read in from the scanner class
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter your name: ");
      this.passengerName = scanner.nextLine();
      System.out.println("How many passengers are in this booking? ");
      this.passengerQuantity = scanner.nextInt();

      // Initializing the array with the provided passenger quantity.
      this.seat = new String[passengerQuantity];
      System.out.println("How many bags will you be checking in? ");
      this.passengerBaggage = scanner.nextInt();
      // Initializing the for loop for to create seat number and letter
      for(int i = 0; i < passengerQuantity; i++){
         Random random = new Random();
         //Generating a seat number between 1 and 100
         int seatNumber = (int) (Math.random() * 100) + 1;
         //Appending the letter to the number and adding it to the array
         char seatLetter = "ABCDEF".charAt(random.nextInt(5));
         //Converting integer to a string
         this.seat[i] = Integer.toString(seatNumber) + seatLetter;
      }
   }
   // Returning the properties of the class as a string
   public String toString()
   {
      return
                  "Passenger Details \r\n" + "\r\n" +
                  "Passenger Name: \t\t\t\t\t\t\t\t" + passengerName + "\r\n" +
                  "Number of passengers travelling: \t\t\t\t" + passengerQuantity + "\r\n"+
                  "Number of bags checked in: \t\t\t\t\t\t" + passengerBaggage + "\r\n" +
                  "Passenger Seats: \t\t\t\t\t\t\t\t" + Arrays.toString(seat);
   }
}//class
