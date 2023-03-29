package things;

import living.Person;

import java.util.ArrayList;
import java.util.Objects;

public class BookBag {

    private Person owner;
    private ArrayList<Object> items;


    public BookBag(Person owner) {
        this.owner = owner;
        ArrayList<Object> items = new ArrayList<>();
        this.items = items;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public ArrayList<Object> getItems() {
        return items;
    }

    public void listItems(){
    }

    public void displayItems(){
        for(Object item: items){
            if(item instanceof Phone){
                ((Phone) item).displayInfo();
            }
        }

        for(Object item: items){
            if(item instanceof Book){
                ((Book) item).displayInfo();
            }
        }

    }
}
