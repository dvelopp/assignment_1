package report;

import system.domain.Identifiable;

import java.util.function.Function;

import static report.ReportType.CSV;

public abstract class CSVReportService<T extends Identifiable>
        extends ReportService<T> {

    private static final String CSV_DELIMITER = ";";

    @Override
    protected void addRow(StringBuilder sb, T object, Function<T, Object>... valueSuppliers) {
        for (Function<T, Object> valueSupplier : valueSuppliers) {
            sb.append(valueSupplier.apply(object));
            sb.append(CSV_DELIMITER);
        }
        sb.append("\n");
    }

    @Override
    public boolean canHandle(ReportType reportType) {
        return CSV.equals(reportType);
    }

}
