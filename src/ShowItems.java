import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
//show items in stock
public class ShowItems extends JFrame {

    private DefaultTableModel model;
    private JTable table;


    public ShowItems(){
        this.setSize(400, 300);
        this.setVisible(false);
        this.setTitle("Show Available stock");

        String[] columnNames = {"Item Name", "Quantity", "Item Number", "Price"};
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane);

        //public void addItem

        /*public void addItem(itemList AddStock<Object> item;
        item) {
            model.addRow(new Object[]{item.getName(), item.getQty(), item.getItemNumber(), item.getPrice()});



        }*/

    }































    /*JPanel panel;
    private Button btnHome;
    private int item_number;
    private String item_name;
    private int item_quantity;
    private double stockPrice;
    private double item_price;


    public int getItem_number() {
        return item_number;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public double getStockPrice(){return stockPrice;}

    public double getItem_price() {
        return item_price;
    }

    public ShowItems(String item_name, int item_number, int item_quantity, double stockPrice,double item_price) {
        this.item_name = item_name;
        this.item_number = item_number;
        this.item_quantity = item_quantity;
        this.stockPrice = stockPrice;
        this.item_price = item_price;

    }

    public ShowItems() {
        super("Available Stock");

        panel = new JPanel();


        String[] columnNames = {"Item Number", "Item Name", "Item Quantity", "Stock Price", "Price"};

        String[][] data = {
                {"1", "Item 1", "6", "$10.00"},
                {"2", "Item 2", "7", "$15.00"},
                {"3", "Item 3", "3", "$20.00"},
                {"4", "Item 4", "2", "$25.00"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
       // panel.add(scrollPane);
       // add(panel);
        LinkedList<ShowItems> itemList = new LinkedList<ShowItems>();
        itemList.add(new ShowItems("chicken", 1, 6, 10.00, 20.00));
        itemList.add(new ShowItems("wings", 2, 7, 15.00,12.00));
        itemList.add(new ShowItems("pizza", 3, 3, 20.00,25.0));
        itemList.add(new ShowItems("burger", 4, 2, 25.00, 20.00));
        itemList.add(new ShowItems("burger", 4, 2, 25.00, 30.00));

        //itemList.add(new ShowItems((")));
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        for (ShowItems item:itemList ) {
            Object[] row = {item.getItem_name(), item.getItem_number(), item.getItem_quantity(),item.getStockPrice(), item.getItem_price()};
            model.addRow(row);
        }
        panel.add(scrollPane);
        this.add(panel);

        JButton backButton = new JButton("Back homepage");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });

        backButton.setBounds(70,100,90,25);
        panel.add(backButton);


        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }*/


}
