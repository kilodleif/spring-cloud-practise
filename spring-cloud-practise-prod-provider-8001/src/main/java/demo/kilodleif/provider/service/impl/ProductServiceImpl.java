package demo.kilodleif.provider.service.impl;

import demo.kilodleif.common.entity.Product;
import demo.kilodleif.provider.mapper.ProductMapper;
import demo.kilodleif.provider.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kilodleif
 * @date 2019-01-03 16:43
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list() {
        return productMapper.selectAll();
    }

    @Override
    public Product get(Integer productId) {
        return productMapper.selectByPrimaryKey(productId);
    }
}
