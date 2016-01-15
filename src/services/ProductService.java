package services;

import products.FullHDMonitor;
import products.Laptop;
import products.Monitor;
import products.UHDMonitor;

import java.util.ArrayList;

/**
 * Service returns all available products.
 */
public class ProductService {

    /**
     * Returns all Available products from some external system.
     *
     * @return
     */
    ArrayList getAllProducts() {
        //STUB
        return null;
    }

    /**
     * Search products by given ids.
     *
     * @param ids
     * @return
     */
    ArrayList getProductByIds(ArrayList ids) {
        ArrayList products = getAllProducts();
        ArrayList result = new ArrayList();
        for (int j = 0; j < ids.size(); j++) {
            Integer searchId = (Integer) ids.get(j);
            for (int i = 0; i < products.size(); i++) {
                Object product = products.get(i);
                if (product == FullHDMonitor.class) {
                    int id = ((FullHDMonitor) product).getId();
                    if (searchId == id) {
                        result.add(product);
                    }
                }
                if (product == Laptop.class) {
                    int id = ((Laptop) product).getId();
                    if (searchId == id) {
                        result.add(product);
                    }
                }
                if (product == UHDMonitor.class) {
                    int id = ((UHDMonitor) product).getId();
                    if (searchId == id) {
                        result.add(product);
                    }
                }
                if (product == Monitor.class) {
                    int id = ((Monitor) product).getId();
                    if (searchId == id) {
                        result.add(product);
                    }
                }
            }
        }
        return result;
    }
}
