package product.domain;

import system.domain.Identifiable;

import java.math.BigDecimal;

public abstract class Product extends Identifiable {

    private String name;
    private String description;
    private BigDecimal price;

    public Product(String name, String description, BigDecimal price) {
        assert name != null;
        assert description != null;
        assert price != null;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
