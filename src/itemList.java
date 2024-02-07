import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class itemList<item> extends JFrame {
//show sold  items in a jtable.
//Item first;


    public itemList() {

        super("Sold Items");

        JPanel panel = new JPanel();
        panel = new JPanel();
        panel.setSize(100,100);
        String[] columnNames = {"Item Number", "Item Name", "Item Quantity", "Stock Price", "Price"};

        Object[][] data = {
                {1, "Item 1", 2, 20.00, 10.00},
                {2, "Item 2", 3, 30.00, 12.00},
                {3, "Item 3", 1, 15.00, 25.00},
                {3, "Item 5", 5, 12.00, 17.00},
                {4, "Item 4", 4, 40.00, 56.00}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);


        JLabel totalSale = new JLabel("Total");

        totalSale.setBounds(100, 100, 100, 20);
        //setVisible(true);
        //panel.add(totalSale);

        panel.add(scrollPane);
        this.add(panel);

        JButton mainButton = new JButton("Main Page");
        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);


            }
        });
        mainButton.setBounds(70,100,90,25);
        setDefaultCloseOperation(ShowItems.EXIT_ON_CLOSE);


        //panel.add(mainButton);


    }







}
