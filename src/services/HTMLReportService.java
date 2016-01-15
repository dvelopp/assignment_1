package services;

import products.FullHDMonitor;
import products.Laptop;
import products.Monitor;
import products.UHDMonitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Html report service.
 */
public class HTMLReportService {

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
                    report = report + "<div>" + ((FullHDMonitor) product).getId() + "</div><div>" + ((FullHDMonitor) product).getName() + "</div><div>" + ((FullHDMonitor) product).getPrice() + "</div>\n";
                }
            }
            if (product == Laptop.class) {
                int id = ((Laptop) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = report + "<div>" + ((FullHDMonitor) product).getId() + "</div><div>" + ((FullHDMonitor) product).getName() + "</div><div>" + ((FullHDMonitor) product).getPrice() + "</div>\n";
                }
            }
            if (product == UHDMonitor.class) {
                int id = ((UHDMonitor) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = report + "<div>" + ((FullHDMonitor) product).getId() + "</div><div>" + ((FullHDMonitor) product).getName() + "</div><div>" + ((FullHDMonitor) product).getPrice() + "</div>\n";
                }
            }
            if (product == Monitor.class) {
                int id = ((Monitor) product).getId();
                if (!contains(id, uniqueProducts)) {
                    uniqueProducts.add(product);
                    report = report + "<div>" + ((FullHDMonitor) product).getId() + "</div><div>" + ((FullHDMonitor) product).getName() + "</div><div>" + ((FullHDMonitor) product).getPrice() + "</div>\n";
                }
            }
        }

        return report;
    }

    Object getObjectById(ArrayList list, int index) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = i + 1;
            Object obj = it.next();
            if (i == index) {
                return obj;
            }
        }
        return null;
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
