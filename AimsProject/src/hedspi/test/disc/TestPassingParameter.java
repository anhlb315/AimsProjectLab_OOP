package hedspi.test.disc;

import hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");


        swap(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());
        System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle());

        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: "+jungleDVD.getTitle());

    }

    public static void swap(DigitalVideoDisc o1,DigitalVideoDisc o2){
        DigitalVideoDisc tmp=new DigitalVideoDisc(o1.getTitle(), o1.getCategory(),o1.getDirector(), o1.getLength(), o1.getCost());
        changeTitle(o1,o2.getTitle());
        changeCategory(o1,o2.getCategory());
        changeDirector(o1,o2.getDirector());
        changeLength(o1,o2.getLength());
        changeCost(o1,o2.getCost());
        changeTitle(o2,tmp.getTitle());
        changeCategory(o2,tmp.getCategory());
        changeDirector(o2,tmp.getDirector());
        changeLength(o2,tmp.getLength());
        changeCost(o2,tmp.getCost());

    }
    public static void changeTitle(DigitalVideoDisc dvd,String title){
        String oldTitle= dvd.getTitle();
        dvd.setTitle(title);
        dvd=new DigitalVideoDisc(oldTitle);
    }
    public static void changeCategory(DigitalVideoDisc dvd,String category){
        String oldCategory= dvd.getCategory();
        dvd.setCategory(category);
        dvd=new DigitalVideoDisc(oldCategory);
    }
    public static void changeDirector(DigitalVideoDisc dvd,String director){
        String oldDirector= dvd.getDirector();
        dvd.setDirector(director);
        dvd=new DigitalVideoDisc(oldDirector);
    }
    public static void changeLength(DigitalVideoDisc dvd, int length){
        int oldLength= dvd.getLength();
        dvd.setLength(length);
//        dvd=new hust.soict.hedspi.aims.disc.DigitalVideoDisc(oldLength);
    }
    public static void changeCost(DigitalVideoDisc dvd,float cost){
        float oldCost= dvd.getCost();
        dvd.setCost(cost);
//        dvd=new hust.soict.hedspi.aims.disc.DigitalVideoDisc(oldCost);
    }
}
