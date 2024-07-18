package businessLogic;

import dataAccess.BillDAO;
import model.Bill;
import java.util.List;

public class BillBLL {
    private BillDAO billDAO;

    public BillBLL() {
        billDAO = new BillDAO();
    }

    public List<Bill> getAllBills() {
        return billDAO.findAll();
    }

    public Bill getBillById(int id) {
        return billDAO.findById(id);
    }

    public Bill addBill(Bill bill) {
        return billDAO.insert(bill);
    }

    public Bill updateBill(Bill bill) {
        return billDAO.update(bill);
    }
}
