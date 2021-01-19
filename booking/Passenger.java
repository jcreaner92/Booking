package booking;

import java.util.Arrays;
import java.util.InputMismatchException;
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
   public int passengerQuantity;
   private int passengerBaggage;
   private String passengerName;
   private String [] seat;

   // Constructor method
   public Passenger(){
      boolean valid = false;
      do
      {
         try
         {
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
            // for loop to create seat number and letter for each passenger
            for (int i = 0; i < passengerQuantity; i++)
            {
               Random random = new Random();
               //Generating a seat number between 1 and 100
               int seatNumber = (int) (Math.random() * 100) + 1;
               //Appending the letter to the number and adding it to the array
               char seatLetter = "ABCDEF".charAt(random.nextInt(5));
               //Converting integer to a string
               this.seat[i] = Integer.toString(seatNumber) + seatLetter;
               valid = true;
            }
         }catch(InputMismatchException e){
            System.out.println("Invalid input, please start again.");
         }
      }while(!valid);
   }

   public int getPassengerBaggage()
   {
      return passengerBaggage;
   }

   public void setPassengerBaggage(int passengerBaggage)
   {
      this.passengerBaggage = passengerBaggage;
   }

   public String getPassengerName()
   {
      return passengerName;
   }

   public void setPassengerName(String passengerName)
   {
      this.passengerName = passengerName;
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
