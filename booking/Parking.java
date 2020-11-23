package booking;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by John Creaner on 14/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Parking
{

   private final String departure;
   private final String space;
   private final int days;
   private double total;
   private double pickupTotal;
   private final double total1;
   private final String startDate;
   DecimalFormat df = new DecimalFormat("00.00");


   public Parking()
   {

      Scanner scanner = new Scanner(System.in);
      //departure airport
      System.out.println("Please enter departure airport:");
      this.departure = scanner.nextLine();

      //parking start date
      System.out.println("What date will to you start parking? (dd/mm/yyyy)");
      this.startDate = scanner.nextLine();

      //number of days parking needed
      System.out.println("How many days parking needed?:\t");
      this.days = scanner.nextInt();

      //terminal collection
      System.out.println("Do you need transportation to and from terminal?\n (Yes-enter:Y / No-enter:N):");
      scanner.nextLine();
      String transport = scanner.nextLine();

      //random allocated parking space
      int spaceNumber = (int) (Math.random() * 100) + 1;
      Random random = new Random();
      char blockLetter = "ABCDEF".charAt(random.nextInt(5));
      space = blockLetter + Integer.toString(spaceNumber);

      double daysCost = 5.00;
      if(transport.equals("Y"))
      {
         System.out.print("Please enter the number of adults and / or children:\n");
         System.out.print("No. of adults:\t\t");
         int adult = scanner.nextInt();
         System.out.print("No. of children:\t");
         int child = scanner.nextInt();
         double pickUpCost = 3.00;
         pickupTotal=(adult * pickUpCost)+(child * pickUpCost);
      }//if
      else
      {
         total = (total + (days * daysCost));
      }//else

      this.total1 = (pickupTotal + (days * daysCost));
         }

   public String toString()
   {

      return
            "Departure Airport: \t\t\t\t\t\t\t\t" + departure + "\r\n" +
                  "Start car parking: \t\t\t\t\t\t\t\t" + startDate + "\r\n" +
                  "Number of days: \t\t\t\t\t\t\t\t" + days + "\r\n"+
                  "Pickup Cost: \t\t\t\t\t\t\t\t\t" + "£"+df.format(pickupTotal) + "\r\n" +
                  "Total cost of parking and pick up: \t\t\t\t" + "£"+ df.format(total1)+ "\r\n" +
                  "Your allocated parking spot number:\t\t\t\t"+ space;
   }
}//
