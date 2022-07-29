package dev.igor.msproduct.model;

import io.micrometer.core.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal amount;

    public Product() {
    }

    public Product(@NonNull String description, @NonNull BigDecimal amount) {
        this.description = Objects.requireNonNull(description);
        this.amount = Objects.requireNonNull(amount);
    }

    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
