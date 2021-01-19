package booking;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by John Creaner on 03/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Main
{
   public static void main(String[] args)
   {
      System.out.println();
      System.out.println();
      System.out.println("Hi, Welcome to the booking application. We have no bookings on record please following the instructions to make a new booking");
      System.out.println();
      Booking b1 = new Booking();
      System.out.println();
      System.out.println();
      System.out.println("Thank you for making a booking with us! Please choose one of the following");
      boolean quit = false;
      Scanner keyboard = new Scanner(System.in);
      while(!quit)
      {
         System.out.println();
         System.out.println();
         System.out.println("1. Change booking details");
         System.out.println("2. View booking details");
         System.out.println("3. Exit");
         try
         {
            int choice = keyboard.nextInt();
            switch (choice)
            {
               case 1 -> {
                  System.out.println("Would you like to change details of:");
                  System.out.println("1. Flight");
                  System.out.println("2. Parking");
                  System.out.println("3. Passenger");
                  System.out.println("4. Covid Details");
                  int changeChoice = keyboard.nextInt();
                  switch (changeChoice)
                  {
                     case 1 -> {
                        System.out.println("Which flight detail would you like to change?");
                        System.out.println("1. Destination");
                        System.out.println("2. Flight Day");
                        int flightChange = keyboard.nextInt();
                        switch (flightChange)
                        {
                           case 1 -> {
                              System.out.println("Your current destination is " + b1.getFlight().getDestination() + " what would you like to change it to?");
                              b1.getFlight().printDestinationMenu();
                              int destination = keyboard.nextInt();
                              b1.getFlight().setDestinationWithNumber(destination);
                           }
                           case 2 -> {
                              System.out.println("What would you like to change your flight day to?");
                              System.out.println("Please enter in the following format (DD/MM/YYYY)");
                              keyboard.nextLine();
                              b1.getFlight().setFlightDay(keyboard.nextLine());
                           }
                           default -> System.out.println("Incorrect input, returning to menu");
                        }
                     }
                     case 2 -> {
                        System.out.println("Which parking detail would you like to change?");
                        System.out.println("1. Departure Airport");
                        System.out.println("2. Flight Date");
                        int parkingChoice = keyboard.nextInt();
                        if (parkingChoice == 1)
                        {
                           System.out.println("What is your new Departure Airport?");
                           keyboard.nextLine();
                           b1.getParking().setDeparture(keyboard.nextLine());
                        } else if (parkingChoice == 2)
                        {
                           System.out.println("What is your new flight date? (DD/MM/YYYY)");
                           keyboard.nextLine();
                           b1.getParking().setStartDate(keyboard.nextLine());
                        } else
                        {
                           System.out.println("Incorrect input, returning to menu");
                        }
                     }
                     case 3 -> {
                        System.out.println("What passenger detail would you like to change?");
                        System.out.println("1.Change passenger name");
                        System.out.println("2.Change passenger baggage");
                        int passengerChoice = keyboard.nextInt();
                        if (passengerChoice == 1)
                        {
                           System.out.println("What is your new passenger name?");
                           keyboard.nextLine();
                           b1.getPassenger().setPassengerName(keyboard.nextLine());
                        } else if (passengerChoice == 2)
                        {
                           System.out.println("What is the new number of bags?");
                           b1.getPassenger().setPassengerBaggage(keyboard.nextInt());
                        } else
                        {
                           System.out.println("Incorrect input, returning to menu");
                        }
                     }
                     case 4 -> {
                        System.out.println("The documents would you like to change?");
                        System.out.println("1. Passport Number");
                        System.out.println("2. Issuing Authority");
                        System.out.println("3. Passport Issue Date");
                        System.out.println("4. Passport Expiry Date");
                        System.out.println("5. Covid Test Date");
                        int covidChoice = keyboard.nextInt();
                        switch (covidChoice)
                        {
                           case 1 -> {
                              System.out.println("What is the new passport number?");
                              b1.getCovid19().setReadPassportNumber(keyboard.nextInt());
                           }
                           case 2 -> {
                              System.out.println("What is the new passport authority?");
                              keyboard.nextLine();
                              b1.getCovid19().setReadPassportAuthority(keyboard.nextLine());
                           }
                           case 3 -> {
                              System.out.println("What is the new passport issue date?");
                              keyboard.nextLine();
                              b1.getCovid19().setReadPassportIssueDate(keyboard.nextLine());
                           }
                           case 4 -> {
                              System.out.println("What is the new passport expiry date?");
                              keyboard.nextLine();
                              b1.getCovid19().setReadPassportExpiryDate(keyboard.nextLine());
                           }
                           case 5 -> {
                              System.out.println("What is the new covid-19 test date?");
                              keyboard.nextLine();
                              b1.getCovid19().setCovidTestDate(keyboard.nextLine());
                           }
                           default -> System.out.println("Incorrect input, returning to menu");
                        }
                     }
                  }
               }
               case 2 -> System.out.println(b1.toString());
               case 3 -> quit = true;
            }
         }catch(InputMismatchException e){
            System.out.println("Please enter a number between 1 and 4.");
         }

      }

   }//main
}//class
