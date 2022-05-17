package hedspi.aims;

import hedspi.aims.disc.DigitalVideoDisc;
import hedspi.aims.order.Order;

public class DiskTest {
    public static void main(String[] args) {
        Order anOrder = new Order();


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("Geogre Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvdList[]=new DigitalVideoDisc[2];
        dvdList[0]=new DigitalVideoDisc("Aladdin","Animation","Roger Allers",90,18.99f);
        dvdList[1]=new DigitalVideoDisc("Hello Puppy","Animation","Roger Allers",90,18.99f);

        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.printListOrdered();
        anOrder.getALuckyItem();
        anOrder.printListOrdered();
    }
}
