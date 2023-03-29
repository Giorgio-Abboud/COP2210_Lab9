package living;

import things.BookBag;

public class Person {

    private String firstName;
    private String lastName;
    private BookBag bookBag;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BookBag getBookBag() {
        return bookBag;
    }

    public void setBookBag(BookBag bookBag) {
        this.bookBag = bookBag;
    }

    //public double totalPriceOfPossessions(){}

}
