package product.domain;

import java.math.BigDecimal;

public final class Display {

    private BigDecimal size;

    public Display(BigDecimal size) {
        assert size != null;
        this.size = size;
    }

    private Display() {
    }

    public BigDecimal getSize() {
        return size;
    }

}
