package dev.igor.msproduct.http;

import dev.igor.msproduct.http.data.request.ProductPersistDto;
import dev.igor.msproduct.http.data.response.ProductResponseDto;
import dev.igor.msproduct.model.Product;
import dev.igor.msproduct.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> insert(@RequestBody ProductPersistDto dto) {
        Product product = new Product(dto.getDescription(), dto.getAmount());
        Product savedProduct = productService.insert(product);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ProductResponseDto(savedProduct.getId(), savedProduct.getDescription()));
    }
}
