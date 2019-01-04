package demo.kilodleif.consumer.controller;

import demo.kilodleif.common.entity.Product;
import demo.kilodleif.common.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kilodleif
 * @date 2019-01-04 18:19
 */
@RestController
@RequestMapping("/product")
public class ProductConsumerController {

    @Autowired
    private ProductClientService productClientService;

    @GetMapping("/list")
    public List<Product> list(){
        return productClientService.list();
    }

    @GetMapping("/get/{id}")
    public Product get(@PathVariable("id") Integer id){
        return productClientService.get(id);
    }


}
