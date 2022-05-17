package hedspi.aims.order;

import hedspi.aims.disc.DigitalVideoDisc;
import hedspi.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBER_ORDERED=10;
    public static final int MAX_LIMITTED_ORDERS=10;
    private static int nbOrders=0;
    private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered=-1;
    private MyDate dateOrdered;

    public Order(){
        if(nbOrders==MAX_LIMITTED_ORDERS){
            System.out.println("Full!!Cannot hust.soict.hedspi.aims.order.Order any more...");

        }
        else{
            nbOrders++;
            System.out.println("hust.soict.hedspi.aims.order.Order successfully...");
            this.dateOrdered=new MyDate();
        }
    }
    public Order(MyDate dateOrdered){
        if(nbOrders==MAX_LIMITTED_ORDERS){
            System.out.println("Full!!Cannot hust.soict.hedspi.aims.order.Order any more...");
        }
        else{
            nbOrders++;
            System.out.println("hust.soict.hedspi.aims.order.Order successfully...");
            this.dateOrdered=dateOrdered;
        }
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered>=MAX_NUMBER_ORDERED-1){
            System.out.println("The list is already full , cannot add the item "+disc.getTitle()+"!!!");
            return false;
        }
        else{
            qtyOrdered++;
            itemsOrdered[qtyOrdered]=disc;
            System.out.println("Added successfully the item "+disc.getTitle()+"!!!");
            return true;
        }
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int countList=dvdList.length;
        if(countList+this.qtyOrdered+1 >MAX_NUMBER_ORDERED){
            System.out.println("Cannot add the dvdList because the number of items is larger");
            return false;
        }
        else{
            for (int i=0;i< dvdList.length;i++){
                addDigitalVideoDisc(dvdList[i]);
            }
            System.out.println("Added successfully all the dvdList");
            return true;
        }
    }

    public DigitalVideoDisc getALuckyItem(){
        int luckyNumber=(int)Math.floor(Math.random()*(qtyOrdered+1));
        DigitalVideoDisc dvd;
        System.out.println("The lucky number is:"+luckyNumber);
        for(int i=0;i<=qtyOrdered;i++){
            if(i==luckyNumber){
                DigitalVideoDisc newDVD=itemsOrdered[i];
                System.out.println("The item is removed is:"+newDVD.getTitle());
                removeDigitalVideoDisc(itemsOrdered[i]);
                return newDVD;
            }
        }
        return null;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered<0){
            System.out.println("The list is empty, can not remove");
            return false;
        }
        else {
            for (int i=0;i<=qtyOrdered;i++){
                if(itemsOrdered[i].equals(disc)){
                    if(i==MAX_NUMBER_ORDERED-1){
                        qtyOrdered--;
                        System.out.println("Removed!!!");
                        return true;
                    }
                    else {
                        for (int j = i; j < qtyOrdered; j++) {
                            itemsOrdered[j] = itemsOrdered[j + 1];
                        }
                        qtyOrdered--;
                        System.out.println("Removed!!!");
                        return true;
                    }
                }
            }
            System.out.println("Cannot removed");
            return false;
        }
    }

    public boolean searchStringByTitle(String str){
        boolean isExist=false;
        for (int i=0;i<=this.qtyOrdered;i++){
            isExist=itemsOrdered[i].search(str);
            if(isExist==true){
                System.out.println("The item with name :"+itemsOrdered[i].getTitle()+" is founded!!");
                return isExist;
            }
        }
        System.out.println("Not founded item with the title:"+str);
        return isExist;
    }

    public float totalCost(){
        float sum=0f;
        for (int i=0;i<=qtyOrdered;i++){
            sum+=itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void printListOrdered(){
        System.out.println("**********hust.soict.hedspi.aims.order.Order**********");
        System.out.println("Date:"+this.dateOrdered.getDay()+"/"+this.dateOrdered.getMonth()+"/"+this.dateOrdered.getYear());
        System.out.println("hust.soict.hedspi.aims.order.Order Items:");
        for (int i=0;i<=this.qtyOrdered;i++){
            System.out.println((i+1)+".DVD-"+itemsOrdered[i].getTitle()+"-"+itemsOrdered[i].getCategory()+"-"+itemsOrdered[i].getDirector()+"-"+itemsOrdered[i].getLength()+":"+itemsOrdered[i].getCost()+"$");
        }
        System.out.println("Total Cost:"+totalCost()+"$");
        System.out.println("*************************************");
    }
}
