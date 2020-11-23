package booking;

import java.util.Scanner;

/**
 * Created by John Creaner on 14/11/2020
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Covid19
{

   private final int readPassportNumber;
   private final String readPassportAuthority;
   private final String readPassportIssueDate;
   private final String readPassportExpiryDate;
   private final String covidTestDate;


   public Covid19()
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
