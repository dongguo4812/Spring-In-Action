package com.dongguo.tacocloud.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 * taco配料表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "taco配料表")
public class Ingredient {

    @Schema(description = "主键id")
    @NotNull
    private Long id;

    @Schema(description = "配料名")
    @NotNull
    private String name;

    @Schema(description = "配料类别")
    @NotNull
    private Type type;

    public enum Type {
        WRAP,
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE;
    }

}
