package com.dongguo.tacocloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//代表集合名称
@Document("myCollection")
@NoArgsConstructor
@AllArgsConstructor
public class MyCollection {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String sex;
}
