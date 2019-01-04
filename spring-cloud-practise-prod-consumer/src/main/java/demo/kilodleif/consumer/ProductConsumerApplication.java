package demo.kilodleif.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author kilodleif
 * @date 2019-01-04 16:44
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"demo.kilodleif.common"})
public class ProductConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumerApplication.class, args);
    }

}
