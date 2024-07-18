package businessLogic;

import dataAccess.ProductDAO;
import model.Product;
import java.util.List;

public class ProductBLL {
    private ProductDAO productDAO;

    public ProductBLL() {
        productDAO = new ProductDAO();
    }

    public List<Product> getAllProducts() {
        return productDAO.findAll();
    }

    public Product getProductById(int id) {
        return productDAO.findById(id);
    }

    public Product addProduct(Product product) {
        return productDAO.insert(product);
    }

    public Product updateProduct(Product product) {
        return productDAO.update(product);
    }
    public void deleteProduct(int productId) {
        productDAO.delete(productId);
    }
}
