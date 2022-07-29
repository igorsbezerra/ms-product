package dev.igor.msproduct.http.data.response;

public class ProductResponseDto {

    private final Long id;
    private final String description;

    public ProductResponseDto(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
