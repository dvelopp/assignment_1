package product.domain;

import java.math.BigDecimal;

public class UHDMonitor extends Product{

    private Display display;

    public UHDMonitor(String name, String description, BigDecimal price, Display display) {
        super(name, description, price);
        assert display != null;
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }
}
