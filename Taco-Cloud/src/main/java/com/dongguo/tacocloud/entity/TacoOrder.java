package com.dongguo.tacocloud.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 */
@Data
@Schema(description = "订单表")
public class TacoOrder implements Serializable {
    private static final long serialVersionUID = -6897845401283049115L;
    @Schema(description = "主键id")
    private Long id;
    @Schema(description = "配送时间")
    private Date placedAt;
    @Schema(description = "配送名称")
    private String deliveryName;
    @Schema(description = "配送街道")
    private String deliveryStreet;
    @Schema(description = "配送城市")
    private String deliveryCity;
    @Schema(description = "配送状态")
    private String deliveryState;
    @Schema(description = "配送速度")
    private String deliveryZip;
    @Schema(description = "订单编码")
    private String ccNumber;
    @Schema(description = "订单有效期")
    private String ccExpiration;
    @Schema(description = "订单身份标识")
    private String ccCVV;
    private List<Taco> tacos = new ArrayList<>();
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
