package com.ecommerce.product_service.service.interfaces;

import com.ecommerce.product_service.dto.ProductRequestDTO;
import com.ecommerce.product_service.dto.ProductResponseDTO;
import com.ecommerce.product_service.entity.Product;

public interface ProductService {

    ProductResponseDTO create(ProductRequestDTO productRequestDTO);

    ProductResponseDTO getById(Long id);
}
