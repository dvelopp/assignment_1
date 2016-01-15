package services;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Main service.
 */
public class MainService {

    //Injected using DI (e.g. spring)
    ProductService productService;
    //Injected using DI (e.g. spring)
    HTMLReportService htmlReportService;
    //Injected using DI (e.g. spring)
    CSVReportService csvReportService;


    String getCSVReport() {
        ArrayList products = productService.getAllProducts();
        return csvReportService.generateUniqueProductReport(products);
    }

    String getHtmlReport() {
        ArrayList products = productService.getAllProducts();
        return htmlReportService.generateUniqueProductReport(products);
    }

    public void prinntReport(String name) {
        if (name == "CSV") {
            String report = getCSVReport();
            try {
                print(report);
            } catch (Throwable throwable) {
                //print error to console
                System.out.println(throwable);
                //Exit method without error
                System.exit(0);
            }
        }
        if (name == "HTML") {
            String report = getHtmlReport();
            try {
                print(report);
            } catch (Throwable throwable) {
                //print error to console
                System.out.println(throwable);
                //Exit method without error
                System.exit(0);
            }
        }
    }


    /**
     * Prints given string to some printer.
     *
     * @param report
     * @throws IOException
     */
    void print(String report) throws IOException {
        //PRINT REPORT
        //STUB
    }
}
