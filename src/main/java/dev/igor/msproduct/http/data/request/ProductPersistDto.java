package dev.igor.msproduct.http.data.request;

import java.math.BigDecimal;

public class ProductPersistDto {

    private String description;
    private BigDecimal amount;

    public String getDescription() {
        return description;
    }
    public BigDecimal getAmount() {
        return amount;
    }
}
