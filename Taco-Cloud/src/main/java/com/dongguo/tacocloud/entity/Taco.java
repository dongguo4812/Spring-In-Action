package com.dongguo.tacocloud.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 */
@Data
@Schema(description = "taco")
public class Taco {
    @Schema(description = "主键id")
    private Long id;
    @Schema(description = "创建时间")
    private Date createdAt = new Date();
    @Schema(description = "名称")
    @NotNull
    private String name;
    @Schema(description = "配料表集合")
    @NotEmpty
    private List<Ingredient> ingredients;
}
