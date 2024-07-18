package org.example;

import presentation.*;

public class Main {
    public static void main(String[] args) {
        // Alegeți una dintre următoarele linii pentru a deschide fereastra corespunzătoare:
        new PageView().setVisible(true);
        //new ClientView().setVisible(true);  // Deschide fereastra pentru clienți
       // new ProductView().setVisible(true);  // Deschide fereastra pentru produse
       // new OrderView().setVisible(true);  // Deschide fereastra pentru comenzi
        //new Controller(new ClientView(),new ClientView()).setVisible(true);  // Deschide fereastra pentru clienți
    }
}