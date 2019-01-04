package demo.kilodleif.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kilodleif
 * @date 2019-01-03 14:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer productId;

    private String productName;

    private Float productPrice;

    private String dbSource;

}
