package services;

import report.ReportService;
import report.ReportType;
import system.domain.Identifiable;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class PrintService {

    //Autowired collection with Spring
    private List<ReportService> reportServices;
    private Printer printer;

    public  <T extends Identifiable> void printUniqueObjectsReport(List<T> objects,
                                                                   Class<T> targetType,
                                                                   ReportType reportType) {
        Optional<ReportService> handler = reportServices.stream()
                .filter(service -> service.canHandle(reportType))
                .filter(service -> service.canHandle(targetType))
                .findFirst();
        if (handler.isPresent()) {
            String reportText = handler.get().generateUniqueObjectsReport(objects);
            try {
                printer.print(reportText);
            } catch (IOException e) {
                throw new RuntimeException("There was an error during the print.\n" + e.getMessage());
            }
        }
        throw new IllegalArgumentException("No handlers have been found for requested objects");
    }

}
