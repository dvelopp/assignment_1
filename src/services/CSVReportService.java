package services;

import products.FullHDMonitor;
import products.Laptop;
import products.Monitor;
import products.UHDMonitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Html report service
 */
public class CSVReportService {

    //Injected using DI (e.g. spring)
    private ProductService productService;


    public String generateUniqueProductReport(List products) {
        ArrayList uniqueProducts = new ArrayList();
        String report = "";
        for (int i = 0; i < products.size(); i++) {
            Object product = products.get(i);
            if (product == FullHDMonitor.class) {
                int id = ((FullHDMonitor) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = +((FullHDMonitor) product).getId() + ";" + ((FullHDMonitor) product).getName() + ((FullHDMonitor) product).getPrice() + "\n";
                }
            }
            if (product == Laptop.class) {
                int id = ((Laptop) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = +((FullHDMonitor) product).getId() + ";" + ((FullHDMonitor) product).getName() + ((FullHDMonitor) product).getPrice() + "\n";
                }
            }
            if (product == UHDMonitor.class) {
                int id = ((UHDMonitor) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = +((FullHDMonitor) product).getId() + ";" + ((FullHDMonitor) product).getName() + ((FullHDMonitor) product).getPrice() + "\n";
                }
            }
            if (product == Monitor.class) {
                int id = ((Monitor) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = +((FullHDMonitor) product).getId() + ";" + ((FullHDMonitor) product).getName() + ((FullHDMonitor) product).getPrice() + "\n";
                }
            }
        }

        return report;
    }

    /**
     * Returns true if product with such id already exists in list
     *
     * @param productId
     * @param uniqueProducts
     * @return
     */
    boolean contains(int productId, ArrayList uniqueProducts) {
        for (int i = 0; i < uniqueProducts.size(); i++) {
            Object product = uniqueProducts.get(i);
            if (product == FullHDMonitor.class) {
                int id = ((FullHDMonitor) product).getId();
                if (id == productId) {
                    return true;
                }
            }
            if (product == Laptop.class) {
                int id = ((Laptop) product).getId();
                if (id == productId) {
                    return true;
                }
            }
            if (product == UHDMonitor.class) {
                int id = ((UHDMonitor) product).getId();
                if (id == productId) {
                    return true;
                }
            }
            if (product == Monitor.class) {
                int id = ((Monitor) product).getId();
                if (id == productId) {
                    return true;
                }
            }
        }
        return false;
    }
}
