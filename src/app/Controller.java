//==========================================================================================
// PROGRAMMER: Giorgio Abboud
// PANTHER ID: 6360563
//
// CLASS: COP2210
// SECTION: U01
// SEMESTER: Spring 2023
// CLASSTIME: T/TH 9:30 am - 12:15 pm
//
// Project: Lab 9
// DUE: April 2 2023
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                own and that none of it is the work of any other person.
//==========================================================================================

package app;

import java.util.Random;
import living.Person;
import things.Book;
import things.BookBag;
import things.PencilBag;
import things.Phone;

public class Controller {

    //-----------------------------------------------------------------
    // beginning of main(String[] args)) method

    public static void main(String[] args) {

        yourInfoHeader();

        Random rndGen = new Random();

        Person person = new Person("Mike", "Johnson");
        BookBag bookBag = new BookBag(person);
        person.setBookBag(bookBag);

        for(int i = 0; i < 5; i++){

            int areaCode = rndGen.nextInt(100, 999);
            int threeDigit = rndGen.nextInt(100, 999);
            int fourDigit = rndGen.nextInt(1000, 9999);

            String phoneNumber = "(" + areaCode + ")-" + threeDigit + "-" + fourDigit;

            Phone phone = new Phone(phoneNumber);

            bookBag.getItems().add(phone);
        }

        //bookBag.displayItems();


        PencilBag pencilBag = new PencilBag();
        //========== CONTINUE HERE ==========//


        String[] subjects = {"Math", "Chemistry", "CS", "Physics", "History"};
        for(int i = 0; i < 4; i++){
            int subject = rndGen.nextInt(subjects.length);
            int price1 = rndGen.nextInt(50, 250);
            double price2 = rndGen.nextDouble();
            double price = price1 + price2;

            Book book = new Book(subjects[subject], price);

            bookBag.getItems().add(book);
        }

        bookBag.displayItems();

    }

//-----------------------------------------------------------------
    // beginning of yourInfoHeader() method

    public static void yourInfoHeader() {

        System.out.println("============================================");
        System.out.println("PROGRAMMER:  " + "Giorgio Abboud");
        System.out.println("PANTHER ID:  " + "6360563");
        System.out.println();
        System.out.println("CLASS: \t\t COP 2210 ");
        System.out.println("SECTION: \t " + "U01");
        System.out.println("SEMESTER: \t " + "Spring");
        System.out.println("CLASSTIME: \t " + "9:30 am to 12:15 pm");
        System.out.println();
        System.out.println("Assignment: " + "Lab 9");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person.");
        System.out.println("============================================");
        System.out.println();

    }// end yourInfoHeader

}//end Controller
