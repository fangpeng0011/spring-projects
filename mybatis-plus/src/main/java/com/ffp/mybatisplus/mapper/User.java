package com.ffp.mybatisplus.mapper;

import lombok.Data;

/**
 * Description:
 *
 * @author ffp
 * @date 2022/10/18 9:54
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
