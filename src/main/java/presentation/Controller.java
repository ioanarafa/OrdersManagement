package presentation;

import businessLogic.ClientBLL;
import businessLogic.OrderBLL;
import businessLogic.ProductBLL;
import model.Client;
import model.Order;
import model.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private PageView firstPageView;
    private ClientView clientView;
    private ProductView productView;
    private OrderView orderView;
    private ClientBLL clientBll = new ClientBLL();
    private ProductBLL productBll = new ProductBLL();
    private OrderBLL orderBll = new OrderBLL();

    public Controller(PageView firstPageView, ClientView clientView, ProductView productView, OrderView orderView) {
        this.firstPageView = firstPageView;
        this.clientView = clientView;
        this.productView = productView;
        this.orderView = orderView;
        this.firstPageView.clientButtonListener(new ClientListener());
        this.firstPageView.productButtonListener(new ProductListener());
        this.firstPageView.orderButtonListener(new OrderListener());
        this.clientView.addAddButtonListener(new ClientAddListener());
        this.clientView.addDeleteButtonListener(new ClientDeleteListener());
        this.clientView.addEditButtonListener(new ClientUpdateListener());
        this.clientView.addViewAllButtonListener(new ClientViewAllListener());
        this.clientView.addBackButtonListener(new ClientBackListener());
        this.productView.addAddButtonListener(new ProductAddListener());
        this.productView.addDeleteButtonListener(new ProductDeleteListener());
        this.productView.addEditButtonListener(new ProductUpdateListener());
        this.productView.addViewAllButtonListener(new ProductViewAllListener());
        this.productView.addBackButtonListener(new ProductBackListener());
        this.orderView.addAddButtonListener(new OrderAddListener());
        this.orderView.addViewAllButtonListener(new OrderViewAllListener());
        this.orderView.addBackButtonListener(new OrderBackListener());
    }
    class ClientListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clientView.setVisible(true);
            firstPageView.setVisible(false);
            productView.setVisible(false);
            orderView.setVisible(false);
        }
    }
    class ProductListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            productView.setVisible(true);
            clientView.setVisible(false);
            firstPageView.setVisible(false);
            orderView.setVisible(false);
        }
    }

    class OrderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            orderView.setVisible(true);
            productView.setVisible(false);
            clientView.setVisible(false);
            firstPageView.setVisible(false);
        }
    }

    class ClientBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            firstPageView.setVisible(true);
            clientView.setVisible(false);
        }
    }

    class ClientAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = new Client(clientView.getId(), clientView.getName(), clientView.getEmail());
            clientBll.addClient(client);
        }
    }

    class ClientDeleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clientBll.deleteClient(clientView.getId());
        }
    }

    class ClientUpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Client client = new Client(clientView.getId(), clientView.getName(), clientView.getEmail());
            clientBll.updateClient(client);
        }
    }

    class ClientViewAllListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Client> clientsList = new ArrayList<>();
            clientsList.addAll(clientBll.getAllClients());
        }
    }

    class ProductBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            firstPageView.setVisible(true);
            productView.setVisible(false);
        }
    }

    class ProductAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Product product = new Product(productView.getId(), productView.getName(), productView.getQuantity(), (int) productView.getPrice());
            productBll.addProduct(product);
        }
    }

    class ProductDeleteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            productBll.deleteProduct(productView.getId());
        }
    }

    class ProductUpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Product product = new Product(productView.getId(), productView.getName(), productView.getQuantity(), (int) productView.getPrice());
            productBll.updateProduct(product);
        }
    }

    class ProductViewAllListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Product> productsList = new ArrayList<>();
            productsList.addAll(productBll.getAllProducts());

        }
    }

    class OrderBackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            firstPageView.setVisible(true);
            orderView.setVisible(false);
        }
    }

    class OrderAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int clientId = (int) orderView.getClientComboBox().getSelectedItem();
            int productId = (int) orderView.getProductComboBox().getSelectedItem();
            Order order = new Order(orderView.getId(), clientId, productId, orderView.getQuantity());
            orderBll.addOrder(order);
        }
    }

    class OrderViewAllListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            List<Order> orderList = new ArrayList<>();
            orderList.addAll(orderBll.getAllOrders());

        }
    }
}
