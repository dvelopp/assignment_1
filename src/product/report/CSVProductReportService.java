package product.report;

import product.domain.Product;
import report.CSVReportService;

import java.util.List;

public class CSVProductReportService extends CSVReportService<Product> {

    @Override
    public String generateUniqueObjectsReport(List<Product> products) {
        return generateUniqueObjectsReport(products,
                Product::getId,
                Product::getName,
                Product::getPrice);
    }

    @Override
    public boolean canHandle(Class type) {
        return Product.class.equals(type);
    }

}
