package things;

import java.util.Random;

public class Phone {

    private String number;
    private double price;

    public Phone(String number) {
        this.number = number;

        Random rndGen = new Random();

        double dollars = rndGen.nextInt(150, 1450);
        double cents = rndGen.nextDouble();
        double price = dollars + cents;

        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo(){
        System.out.printf("Type-> Phone-> \t\t %-20s \t\t Price:%8.2f\n", number, price);
    }
}
