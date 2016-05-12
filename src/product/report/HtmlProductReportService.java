package product.report;

import product.domain.Product;
import report.HTMLReportService;

import java.util.List;

public class HtmlProductReportService extends HTMLReportService<Product> {

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
