package hedspi.aims;

import hedspi.aims.disc.DigitalVideoDisc;
import hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Order anOrder = new Order();
        //hust.soict.hedspi.aims.order.Order anOrder1 = new hust.soict.hedspi.aims.order.Order();
        // Create a new dvd object and set the fields
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
        dvdList[1]=new DigitalVideoDisc("StarWar","Animation","roger Allers",90,18.99f);
        anOrder.addDigitalVideoDisc(dvdList);

        anOrder.printListOrdered();



    }
}
