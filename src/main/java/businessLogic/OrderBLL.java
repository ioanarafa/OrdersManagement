package businessLogic;

import dataAccess.OrderDAO;
import model.Order;
import java.util.List;

public class OrderBLL {
    private OrderDAO orderDAO;

    public OrderBLL() {
        orderDAO = new OrderDAO();
    }

    public List<Order> getAllOrders() {
        return orderDAO.findAll();
    }

    public Order getOrderById(int id) {
        return orderDAO.findById(id);
    }

    public Order addOrder(Order order) {
        return orderDAO.insert(order);
    }

    public Order updateOrder(Order order) {
        return orderDAO.update(order);
    }
    public void deleteOrder(Order order) {
        orderDAO.delete(order.getId());
    }
}
