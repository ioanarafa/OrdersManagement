package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientView extends JFrame {

    private final JButton addClientButton = new JButton("Add");
    private final JButton deleteClientButton = new JButton("Delete");
    private final JButton editClientButton = new JButton("Edit");
    private final JButton backButton = new JButton("Back");
    private final JButton viewAllButton = new JButton("View all");
    private final JTextField id = new JTextField();
    private final JTextField name = new JTextField();
    private final JTextField email = new JTextField();
    private final JLabel idLabel = new JLabel("Id: ");
    private final JLabel nameLabel = new JLabel("Name: ");
    private final JLabel emailLabel = new JLabel("E-mail: ");
    private final JTextArea textArea;
    private final JScrollPane scroll;

    public ClientView() {

        this.setBounds(0, 100, 1200, 1200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);

        idLabel.setForeground(Color.BLACK);
        idLabel.setBounds(30, 10, 140, 25);
        id.setBounds(215, 0, 100, 25);
        nameLabel.setForeground(Color.BLACK);
        nameLabel.setBounds(30, 40, 140, 25);
        name.setBounds(215, 50, 100, 25);
        emailLabel.setForeground(Color.BLACK);
        emailLabel.setBounds(30, 205, 145, 30);
        email.setBounds(215, 210, 100, 25);

        addClientButton.setBounds(950, 435, 150, 45);
        deleteClientButton.setBounds(950, 485, 150, 45);
        editClientButton.setBounds(950, 545, 150, 45);
        viewAllButton.setBounds(950, 605, 150, 45);
        backButton.setBounds(950, 645, 150, 45);

        textArea = new JTextArea();
        textArea.setBounds(120, 363, 791, 266);
        scroll = new JScrollPane(textArea);
        scroll.setBounds(120, 363, 791, 266);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.getViewport().setBackground(Color.WHITE);

        this.getContentPane().add(scroll);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(idLabel);
        this.getContentPane().add(id);
        this.getContentPane().add(nameLabel);
        this.getContentPane().add(name);
        this.getContentPane().add(emailLabel);
        this.getContentPane().add(email);
        this.getContentPane().add(addClientButton);
        this.getContentPane().add(deleteClientButton);
        this.getContentPane().add(editClientButton);
        this.getContentPane().add(viewAllButton);
        this.getContentPane().add(backButton);
        this.getContentPane().add(scroll);
    }

    public String getName() {
        return name.getText();
    }
    public String getEmail() {
        return email.getText();
    }
    public int getId() {
        return Integer.parseInt(id.getText());
    }

    public void addAddButtonListener(ActionListener actionListener) {
        addClientButton.addActionListener(actionListener);
    }
    public void addDeleteButtonListener(ActionListener actionListener) {
        deleteClientButton.addActionListener(actionListener);
    }

    public void addEditButtonListener(ActionListener actionListener) {
        editClientButton.addActionListener(actionListener);
    }
    public void addViewAllButtonListener(ActionListener actionListener) {
        viewAllButton.addActionListener(actionListener);
    }

    public void addBackButtonListener(ActionListener actionListener) {
        backButton.addActionListener(actionListener);
    }
    public static void main(String[] args) {
        new ClientView().setVisible(true);
    }

}