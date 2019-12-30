package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther zzyy
 * @create 2019-12-28 11:37
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}
