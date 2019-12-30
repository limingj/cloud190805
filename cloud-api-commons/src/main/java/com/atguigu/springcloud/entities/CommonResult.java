package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther zzyy
 * @create 2019-12-28 11:40
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T>
{
    private Integer code;
    private String  message;
    private T data;
}
