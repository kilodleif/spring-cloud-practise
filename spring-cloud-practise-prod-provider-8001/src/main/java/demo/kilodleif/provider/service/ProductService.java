package demo.kilodleif.provider.service;

import demo.kilodleif.common.entity.Product;

import java.util.List;

/**
 * @author kilodleif
 * @date 2019-01-03 16:10
 */
public interface ProductService {

    List<Product> list();

    Product get(Integer productId);

}
