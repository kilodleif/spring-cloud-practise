package demo.kilodleif.common.service;

import demo.kilodleif.common.entity.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author kilodleif
 * @date 2019-01-04 16:39
 */
@FeignClient(value = "SPRING-CLOUD-PRACTISE-PROD-PROVIDER")
public interface ProductClientService {

    @GetMapping("/product/list")
    List<Product> list();

    @GetMapping("/product/get/{id}")
    Product get(@PathVariable("id") Integer productId);

}
