package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageView extends JFrame {
    private final JButton clientButton = new JButton("Client");
    private final JButton orderButton = new JButton("Order");
    private final JButton productButton = new JButton("Product");
    private final ClientView cV = new ClientView();
    private final ProductView prV = new ProductView();
    private final OrderView oV = new OrderView();


    public PageView() {
        Controller c = new Controller(this, cV, prV, oV);
        this.setBounds(0, 100, 1200, 1200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setLayout(null);

        clientButton.setBounds(120, 435, 150, 45);
        clientButton.setBackground(Color.BLUE);

        orderButton.setBounds(420, 435, 150, 45);
        orderButton.setBackground(Color.BLUE);

        productButton.setBounds(720, 435, 150, 45);
        productButton.setBackground(Color.BLUE);

        this.getContentPane().add(clientButton);
        this.getContentPane().add(orderButton);
        this.getContentPane().add(productButton);

        this.setVisible(true);

    }

    public void productButtonListener(ActionListener actionListener) {
        productButton.addActionListener(actionListener);
    }

    public void clientButtonListener(ActionListener actionListener) {
        clientButton.addActionListener(actionListener);
    }

    public void orderButtonListener(ActionListener actionListener) {
        orderButton.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        new PageView();
    }
}
