package demo.kilodleif.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author kilodleif
 * @date 2019-01-03 15:57
 */
@SpringBootApplication
@MapperScan(basePackages = "demo.kilodleif.provider.mapper")
@EnableEurekaClient
public class ProductProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider8002Application.class, args);
    }

}
