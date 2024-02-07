import javax.swing.*;
//we add one item on the existing stock.
public class AddStock<Item> extends JFrame {
    public String name;
    public int itemNumber;
    public int qty;
    public double stockPrice;
    public double price;
    public Item next;

    public AddStock(String name, int itemNumber, int qty, double price) {
        name = "";
        itemNumber = 0;
        qty = 0;
        price = 0;
    }

    public void Item(String name, int itemNumber, int qty,double stockPrice, double price) {

        this.name = name;
        this.itemNumber = itemNumber;
        this.qty = qty;
        //this.stockPrice = stockPrice;
        this.price = price;
    }

    public String getName(){return name;}

    public int getItemNumber(){return itemNumber;}

    public int getQty(){return qty;}

    //public double getStockPrice(){return stockPrice;}

    public double getPrice(){return price;}

    public String toString() {

        /*System.out.println(name + " " + itemNumber + " " + qty + " " + stockPrice + " "+price);
        System.out.println();*/
        return "Item name : "+getName()+"\n Item number : "+getItemNumber()+"\n Item quantity :"+getQty()+"\n Item Price :"+getPrice();
    }


}
