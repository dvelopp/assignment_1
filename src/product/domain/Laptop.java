package product.domain;

import java.math.BigDecimal;

public class Laptop extends Product {

    private Display display;
    private Integer batteryLifeTime;

    public Laptop(String name, String description, BigDecimal price, Display display, Integer batteryLifeTime) {
        super(name, description, price);
        assert display != null;
        assert batteryLifeTime != null;
        this.display = display;
        this.batteryLifeTime = batteryLifeTime;
    }

    public Display getDisplay() {
        return display;
    }

    public Integer getBatteryLifeTime() {
        return batteryLifeTime;
    }

}
