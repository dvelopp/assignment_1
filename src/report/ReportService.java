package report;

import product.domain.Product;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public abstract class ReportService<T> {

    public abstract String generateUniqueObjectsReport(List<Product> products);
    public abstract boolean canHandle(ReportType reportType);
    public abstract boolean canHandle(Class type);

    protected abstract void addRow(StringBuilder sb, T object, Function<T, Object>... valueSuppliers);

    protected String generateUniqueObjectsReport(List<T> objects, Function<T, Object>... valueSuppliers) {
        StringBuilder sb = new StringBuilder();
        Set<T> uniqueObjects = new LinkedHashSet<>(objects);
        uniqueObjects.forEach(object -> addRow(sb, object, valueSuppliers));
        return sb.toString();
    }

}
