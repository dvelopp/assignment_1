package product.service;

import product.domain.Product;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class ProductService {

    public List<Product> getAllProducts() {
        //STUB
        return emptyList();
    }

    public List<Product> getProductByIds(List<Integer> productIds) {
        return getAllProducts().stream()
                .filter(productIds::contains)
                .collect(toList());
    }

}
