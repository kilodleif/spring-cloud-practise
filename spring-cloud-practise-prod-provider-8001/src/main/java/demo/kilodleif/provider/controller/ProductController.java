package demo.kilodleif.provider.controller;

import demo.kilodleif.common.entity.Product;
import demo.kilodleif.provider.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kilodleif
 * @date 2019-01-03 16:08
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List<Product> list(){
        return productService.list();
    }

    @GetMapping("/get/{id}")
    public Product get(@PathVariable("id") Integer id){
        return productService.get(id);
    }

}
