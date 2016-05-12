package services;

import product.domain.Product;
import product.service.ProductService;
import report.ReportType;

import java.util.List;

public class MainService {

    private ProductService productService;
    private PrintService printService;

    public void printReport(ReportType reportType) {
        List<Product> products = productService.getAllProducts();
        printService.printUniqueObjectsReport(products, Product.class, reportType);
    }

}
