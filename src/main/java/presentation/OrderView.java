package presentation;

import businessLogic.ClientBLL;
import businessLogic.ProductBLL;
import model.Client;
import model.Product;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class OrderView extends JFrame {
    private final JButton addOrderButton = new JButton("Add");
    private final JButton backButton = new JButton("Back");
    private final JButton viewAllButton = new JButton("View all");
    private final JTextField id = new JTextField();
    private final JTextField quantity = new JTextField();
    private final JLabel idLabel = new JLabel("Id: ");
    private final JLabel idClientLabel = new JLabel("idClient: ");
    private final JLabel idProductLabel = new JLabel("idProduct: ");
    private final JLabel quantityLabel = new JLabel("Quantity: ");
    private final JTextArea textArea;
    private final JScrollPane scroll;
    private final JComboBox clientComboBox;
    private final JComboBox productComboBox;
    private ClientBLL clientBLL = new ClientBLL();
    private ProductBLL productBll = new ProductBLL();
    private final JButton billButton = new JButton("Bill");

    public OrderView() {
        this.setBounds(0, 100, 1200, 1200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);


        idLabel.setForeground(Color.BLACK);
        idLabel.setBounds(30, 10, 140, 25);


        id.setBounds(215, 0, 100, 25);

        idClientLabel.setForeground(Color.BLACK);
        idClientLabel.setBounds(30, 40, 140, 25);

        idProductLabel.setForeground(Color.BLACK);
        idProductLabel.setBounds(30, 95, 100, 25);

        quantityLabel.setForeground(Color.BLACK);
        quantityLabel.setBounds(30, 205, 145, 30);

        quantity.setBounds(215,210,100,25);

        addOrderButton.setBounds(950, 435, 150, 45);
        viewAllButton.setBounds(950, 605, 150, 45);
        backButton.setBounds(950, 685, 150, 45);
        billButton.setBounds(950,550,150,45);


        textArea = new JTextArea();
        textArea.setBounds(120, 363, 791, 266);
        scroll = new JScrollPane(textArea);
        scroll.setBounds(120, 363, 791, 266);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.getViewport().setBackground(Color.WHITE);
        this.getContentPane().add(scroll);


        clientComboBox = new JComboBox<>();
        List<Client> clientList = new ArrayList<>();
        clientList.addAll(clientBLL.getAllClients());
        for (Client client : clientList) {
            clientComboBox.addItem(client.getId());
        }
        clientComboBox.setBounds(215, 50, 100, 25);
        this.getContentPane().add(clientComboBox);


        productComboBox = new JComboBox<>();
        List<Product> productList = new ArrayList<>();
        productList.addAll(productBll.getAllProducts());
        for (Product product : productList) {
            productComboBox.addItem(product.getId());
        }
        productComboBox.setBounds(215, 95, 100, 25);
        this.getContentPane().add(productComboBox);



        this.getContentPane().setLayout(null);
        this.getContentPane().add(idLabel);
        this.getContentPane().add(id);
        this.getContentPane().add(idClientLabel);
        this.getContentPane().add(idProductLabel);
        this.getContentPane().add(quantityLabel);
        this.getContentPane().add(quantity);
        this.getContentPane().add(addOrderButton);
        this.getContentPane().add(backButton);
        this.getContentPane().add(viewAllButton);
        this.getContentPane().add(billButton);
        this.getContentPane().add(scroll);
    }

    public JComboBox getClientComboBox() {
        return clientComboBox;
    }

    public JComboBox getProductComboBox() {
        return productComboBox;
    }

    public int getQuantity() {
        return Integer.parseInt(quantity.getText());
    }

    public int getId() {
        return Integer.parseInt(id.getText());
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void addAddButtonListener(ActionListener actionListener) {
        addOrderButton.addActionListener(actionListener);
    }
    public void addViewAllButtonListener(ActionListener actionListener) {
        viewAllButton.addActionListener(actionListener);
    }
    public void addBackButtonListener(ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }
    public void addBillButtonListener(ActionListener actionListener) {
        billButton.addActionListener(actionListener);
    }

    public void showInfoMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }
}
