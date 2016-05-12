package product.domain;

import java.math.BigDecimal;

public class FullHDMonitor extends Product {

    private Display display;

    public FullHDMonitor(String name, String description, BigDecimal price, Display display) {
        super(name, description, price);
        assert display != null;
        this.display = display;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    public Display getDisplay() {
        return display;
    }
}
