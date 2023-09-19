package shop.mtcoding.streamstudy.kakao;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)                               
@Entity
@Table(name="product_tb")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false)
    private String productName;               // 상품 페이지명?
    @Column(length = 1000, nullable = false)
    private String description;               // 상품 설명
    private String deliveryPrice;
    @Column(length = 500)
    private String image;                    // 상품 이미지
    private int price;                       // 톡딜가

    @OneToMany(mappedBy = "product")
    private List<Option> options = new ArrayList<>();

    @Builder
    public Product(Product product) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.description = product.getDescription();
        this.deliveryPrice = product.getDeliveryPrice();
        this.image = product.getImage();
        this.price = product.getPrice();
    }

}
