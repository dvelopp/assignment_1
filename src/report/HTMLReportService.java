package report;

import system.domain.Identifiable;

import java.util.function.Function;

import static report.ReportType.HTML;
import static system.utils.HtmlUtils.wrapWithTag;

public abstract class HTMLReportService<T extends Identifiable>
        extends ReportService<T> {

    private static final String DIV_TAG = "div";

    @Override
    protected void addRow(StringBuilder sb, T object, Function<T, Object>... valueSuppliers) {
        for (Function<T, Object> valueSupplier : valueSuppliers) {
            sb.append(wrapWithTag(valueSupplier.apply(object).toString(), DIV_TAG));
        }
        sb.append("\n");
    }

    @Override
    public boolean canHandle(ReportType reportType) {
        return HTML.equals(reportType);
    }

}
