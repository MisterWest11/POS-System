import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {

    public static void main(String[] args) {
        //new ShowItems();
        //create a home Frame1
        ShowItems show_items = new ShowItems();


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        //frame.setLocationRelativeTo(null);
        frame.setTitle("MINI MARKET");
        frame.setSize(500,500);
        frame.setVisible(true);

        /*JLabel headingTitle = new JLabel("Simple Mini Market POS");
        headingTitle.setBounds(0,20,50,20);
        frame.add(headingTitle);*/

        //create an AddStock Frame2
        JFrame addStockFrame = new JFrame();
        addStockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addStockFrame.setLayout(null);
        addStockFrame.setLocationRelativeTo(null);
        addStockFrame.setSize(500,500);
        addStockFrame.setResizable(false);
        addStockFrame.setTitle("Add Stock");

        //create titlelabel for frame2(AddStock)
        JLabel titleLabel = new JLabel();
        //titleLabel.setText("Add Stock");
        titleLabel.setVisible(true);
        titleLabel.setBounds(100, 25, 100, 20);
        titleLabel.setHorizontalTextPosition(JLabel.CENTER);
        titleLabel.setVerticalTextPosition(JLabel.TOP);




        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name:");
        nameLabel.setVisible(true);
        nameLabel.setBounds(20, 70, 50, 20);
        //nameLabel.setHorizontalTextPosition(JLabel.CENTER);
        //nameLabel.setVerticalTextPosition(JLabel.TOP);

        //create a textfield for name in frame2
        JTextField nameField = new JTextField();
        nameField.setBounds(100, 70, 193, 28);

        //create ItemNumber label and textfield.
        JLabel itemNumber = new JLabel();
        itemNumber.setText("Item Number");
        itemNumber.setVisible(true);
        itemNumber.setBounds(20, 120, 100, 20);


        JTextField itemNumberField = new JTextField();
        itemNumberField.setBounds(100, 120, 193, 28);

        //create itemQuantity label and textfield.
        JLabel itemQuantity = new JLabel();
        itemQuantity.setText("Quantity");
        itemQuantity.setVisible(true);
        itemQuantity.setBounds(20, 180, 100, 20);


        JTextField textQuantity = new JTextField();
        textQuantity.setBounds(100, 180, 193, 28);

        //create a jlabel and textbox to display the price we bought the stock for.
        JLabel stockPriceLabel = new JLabel();
        stockPriceLabel.setText("Stock Price:");
        stockPriceLabel.setVisible(true);
        stockPriceLabel.setBounds(20, 220, 100, 20);

        JTextField stockPrice = new JTextField();
        stockPrice.setBounds(100, 220, 193, 28);


        //create itemPrice label and textfield.
        JLabel itemPrice = new JLabel();
        itemPrice.setText("Price");
        itemPrice.setVisible(true);
        itemPrice.setBounds(20, 280, 100, 20);


        JTextField textPrice = new JTextField();
        textPrice.setBounds(100, 280, 193, 28);





        JButton newButton = new JButton("New");
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        newButton.setBounds(45,350,70,25);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String itemNumberText = itemNumberField.getText();
                String quantityText = textQuantity.getText();
                String priceText = textPrice.getText();

                if (name.isEmpty() || itemNumberText.isEmpty() || quantityText.isEmpty() || priceText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields must be filled out", "Incomplete Input",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    int itemNumber = Integer.parseInt(itemNumberText);
                    int qty = Integer.parseInt(quantityText);
                    double price = Double.parseDouble(priceText);

                    if (itemNumber < 0 || qty < 0 || price < 0) {
                        JOptionPane.showMessageDialog(null, "Negative values are not allowed", "Invalid Input",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Create a new item
                        AddStock item = new AddStock(name, itemNumber, qty,price);
                        // Add the item to the table
                        ShowItems si = new ShowItems();
                        //table.addItem(item);

                        JOptionPane.showMessageDialog(null, "Item saved");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid numeric input", "Invalid Input",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        saveButton.setBounds(130,350,70,25);

        JButton backButton = new JButton("Back");
        backButton.setBounds(215,350,70,25);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                addStockFrame.setVisible(false);
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(300,350,70,25);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        //Create a JFrame3 called SoldItems
        JFrame SoldItemsFrame = new JFrame();
        SoldItemsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SoldItemsFrame.setLayout(null);
        SoldItemsFrame.setLocationRelativeTo(null);
        SoldItemsFrame.setSize(500,500);


        //create a label
        JLabel label = new JLabel();
        label.setText("Welcome To Mini Market");
        label.setVisible(true);
        label.setBounds(100, 8, 500, 20);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);


        //create a button
        JButton StockButton = new JButton("Add Stock");
        StockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itNum, qty;
                /*try {
                    String input = JOptionPane.showInputDialog("Enter Item Number:");
                    itNum = Integer.parseInt(input);
                    String input1 = JOptionPane.showInputDialog("Enter Quantity:");
                    qty = Integer.parseInt(input1);
                    if (show_items.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Item List is empty.!");
                    } else {
                        show_items.find(itNum).qty += qty;
                        JOptionPane.showMessageDialog(this, "Stock Added!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }*/
            }
        });

        StockButton.setBounds(70,100,90,25);
        StockButton.setLayout(null);
        StockButton.setSize(120,25);
        StockButton.setVisible(true);



        StockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStockFrame.setVisible(true);
                frame.setVisible(false);
            }
        });



        //create purchase button

        JButton purchaseButton = new JButton("Purchase");
        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemNumber;
                int qty;
                double total = 0;

                boolean validInput = false;
                do{
                    try{
                        itemNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter item number:"));
                        qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                        validInput = true;
                    }catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Invalid Input. Please enter a number");
                    }
                }while (!validInput);

                boolean makeAnotherPurchase = false;
                do{
                    int result = JOptionPane.showConfirmDialog(null, "Do you want to make another purchase?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                        validInput = false;
                        do{
                            try{
                                itemNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter item number:"));
                                qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
                                validInput = true;
                            }catch (NumberFormatException nfe){
                                JOptionPane.showMessageDialog(null,"Invalid Input. Please enter a number");
                            }

                        } while (!validInput);
                        makeAnotherPurchase = true;
                    }

                }while (makeAnotherPurchase);

                //if (qty > show_items)


            }
        });
        purchaseButton.setBounds(70,180,90,25);
        purchaseButton.setLayout(null);
        purchaseButton.setSize(120,25);
        purchaseButton.setVisible(true);

        //create AddItem button
        JButton DeleteButton = new JButton("Delete Item");
        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int item_Number = 0;
                try{
                    String input = JOptionPane.showInputDialog("Enter item number to delete.");
                    if(input == itemNumberField.getText()){

                    }
                }catch(Exception ee){

                }
            }
        });
        DeleteButton.setBounds(70,250,90,25);
        DeleteButton.setLayout(null);
        DeleteButton.setSize(120,25);
        DeleteButton.setVisible(true);

        //Create Delete button
        JButton AddItemButton = new JButton("Add Item");
        AddItemButton.setBounds(220,100,90,25);
        AddItemButton.setLayout(null);
        AddItemButton.setSize(120,25);
        AddItemButton.setVisible(true);

        //Create SoldItem button
        JButton SoldItemButton = new JButton("Sold Item");
        SoldItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //SoldItemsFrame.setVisible(true);
                frame.setVisible(false);
                itemList soldItems = new itemList();
                soldItems.pack();
                soldItems.setVisible(true);
            }
        });
        SoldItemButton.setBounds(220,180,90,25);
        SoldItemButton.setLayout(null);
        SoldItemButton.setSize(120,25);
        SoldItemButton.setVisible(true);

        //Create ShowItems button
        JButton ShowItemsButton = new JButton("Show Item");
        ShowItemsButton.setBounds(220,250,90,25);
        ShowItemsButton.setLayout(null);
        ShowItemsButton.setSize(120,25);
        ShowItemsButton.setVisible(true);

        ShowItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ShowItems Show_Items = new ShowItems();
            //Show_Items.setSize(500, 500);
            //Show_Items.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Show_Items.setVisible(true);
            frame.setVisible(false);


            }
        });

        //Create Exit button
        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(220,380,90,25);
        ExitButton.setLayout(null);
        ExitButton.setSize(120,25);
        ExitButton.setVisible(true);
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ShowItems Show_Items = new ShowItems();

        Show_Items.setSize(500,500);
        Show_Items.setDefaultCloseOperation(ShowItems.EXIT_ON_CLOSE);

        //add components to frame.
        //frame.add(panel);
        frame.add(StockButton);
        frame.add(label);
        frame.add(purchaseButton);
        frame.add(AddItemButton);
        frame.add(DeleteButton);
        frame.add(SoldItemButton);
        frame.add(ShowItemsButton);
        frame.add(ExitButton);
        addStockFrame.add(titleLabel);
        addStockFrame.add(nameLabel);
        addStockFrame.add(nameField);
        addStockFrame.add(itemNumber);
        addStockFrame.add(itemNumberField);
        addStockFrame.add(itemQuantity);
        addStockFrame.add(textQuantity);
        addStockFrame.add(itemPrice);
        addStockFrame.add(textPrice);
        addStockFrame.add(newButton);

        addStockFrame.add(newButton);
        addStockFrame.add(saveButton);
        addStockFrame.add(backButton);
        addStockFrame.add(exitButton);
        addStockFrame.add(stockPriceLabel);
        addStockFrame.add(stockPrice);


    }
}
