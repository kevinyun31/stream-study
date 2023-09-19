package shop.mtcoding.streamstudy.kakao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private int id;
    private String productName;
    private String description;
    private String deliveryPrice;
    private String image;
    private int price; // 이미지 URL 목록

    public static ProductDTO product(Product product) {
        return new ProductDTO(
            product.getId(),
            product.getProductName(),
            product.getDescription(),
            product.getDeliveryPrice(),
            product.getImage(),
            product.getPrice()             // 이미지 URL 목록을 가져오는 메서드를 정의해야 합니다.
        );
    }
}
