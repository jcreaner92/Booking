package booking;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by John Creaner on 14/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Covid19
{

   private int readPassportNumber;
   private String readPassportAuthority;
   private String readPassportIssueDate;
   private String readPassportExpiryDate;
   private String covidTestDate;

   public Covid19()
   {
      boolean valid = false;
      do
      {
         try
         {
            Scanner scanner = new Scanner(System.in);

            //Read in passport details
            System.out.println("Enter your passport number, or travel document reference number: ");
            this.readPassportNumber = scanner.nextInt();

            //Read in Passport Authority
            System.out.println("Enter Issuing Authority: ");
            scanner.nextLine();
            this.readPassportAuthority = scanner.nextLine();

            // Read in Passport Issue Date
            System.out.println("Enter Issue Date: (dd/mm/yyyy)");
            this.readPassportIssueDate = scanner.nextLine();

            // Read in Passport Expiry Date
            System.out.println("Enter Expiry Date: (dd/mm/yyyy)");
            this.readPassportExpiryDate = scanner.nextLine();

            // Read in covid test Date
            System.out.println("Enter Date of negative Covid test: (dd/mm/yyyy) Must be in past 72 hours");
            this.covidTestDate = scanner.nextLine();
            valid = true;
         }catch(InputMismatchException e){
            System.out.println("Invalid input please start again");
         }
      }while(!valid);
   }

   public int getReadPassportNumber()
   {
      return readPassportNumber;
   }

   public void setReadPassportNumber(int readPassportNumber)
   {
      this.readPassportNumber = readPassportNumber;
   }

   public String getReadPassportAuthority()
   {
      return readPassportAuthority;
   }

   public void setReadPassportAuthority(String readPassportAuthority)
   {
      this.readPassportAuthority = readPassportAuthority;
   }

   public String getReadPassportIssueDate()
   {
      return readPassportIssueDate;
   }

   public void setReadPassportIssueDate(String readPassportIssueDate)
   {
      this.readPassportIssueDate = readPassportIssueDate;
   }

   public String getReadPassportExpiryDate()
   {
      return readPassportExpiryDate;
   }

   public void setReadPassportExpiryDate(String readPassportExpiryDate)
   {
      this.readPassportExpiryDate = readPassportExpiryDate;
   }

   public String getCovidTestDate()
   {
      return covidTestDate;
   }

   public void setCovidTestDate(String covidTestDate)
   {
      this.covidTestDate = covidTestDate;
   }

   public String toString()
   {
      return

                  "Document Number: \t\t\t\t\t\t\t\t" + readPassportNumber +
                  "\r\nIssue Authority:\t\t\t\t\t\t\t\t" + readPassportAuthority +
                  "\r\nIssue Date: \t\t\t\t\t\t\t\t\t"+ readPassportIssueDate +
                  "\r\nExpiry Date: \t\t\t\t\t\t\t\t\t" + readPassportExpiryDate +
                  "\r\nNegative Covid Test Date: (Within 72 hours)\t\t" + covidTestDate;
   }
}//class
