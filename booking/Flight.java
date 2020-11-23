package booking;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by John Creaner on 15/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Flight
{
   //Declare class variables
   private String destination;
   private final String flightDay;
   private String flightTime;
   private double price;
   DecimalFormat df = new DecimalFormat("00.00");

   public Flight()
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Where would you like to fly?");
      System.out.println("1. England");
      System.out.println("2. France");
      System.out.println("3. Germany");
      System.out.println("4. Portugal");
      System.out.println("5. Cyprus");
      int destinationNum = scanner.nextInt();

      switch (destinationNum)
      {
         case 1 -> {
            destination = "England";
            price = 100.50;
            flightTime = "10:05AM";
         }
         case 2 -> {
            destination = "France";
            price = 120.00;
            flightTime = "2:00PM";
         }
         case 3 -> {
            destination = "Germany";
            price = 130.00;
            flightTime = "5:00PM";
         }
         case 4 -> {
            destination = "Portugal";
            price = 89.00;
            flightTime = "6:00AM";
         }
         case 5 -> {
            destination = "Cyprus";
            price = 200.00;
            flightTime = "10.00PM";
         }
      }

      System.out.println("Do you need a return?");
      String returnFlight = scanner.next();

      if (returnFlight.equals("Y"))
      {
         price = price * 2;
      }
      System.out.println("What date would you like to fly? (dd/mm/yyyy)");
      this.flightDay = scanner.next();
   }

   public String toString()
   {
      return
            "Your destination is:\t\t\t\t\t\t\t" + destination + "\r\n" +
            "Flight Date: \t\t\t\t\t\t\t\t\t" + flightDay + "\r\n" +
            "Flight Time: \t\t\t\t\t\t\t\t\t" + flightTime + "\r\n" +
            "Price Per person: \t\t\t\t\t\t\t\t£" + df.format(price)+"\r\n";
   }
}//class
