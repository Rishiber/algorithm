package com.github.code.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: Code_HashMap
 * @Description:
 * @Author: Rishiber
 * @Version: 1.0
 * @create: 2019/7/12 16:20
 */
//（经典）哈希函数性质：
//1）输入域无穷大
//2）输出域有穷尽（S域）
//3）输入参数固定的情况下，得到的返回值也是固定的（没有随机成分）
//4）输入参数不相同，有可能得到相同的输出值（发生碰撞）
//5）如果有很多不同输入（样本点足够大），将在输出域上均匀出现返回值（哈希函数的离散性）

//推论：S域均匀，对返回值统一做模m处理，则新的输出域(0, m-1)也均匀

// 大数据问题利器：哈希函数=>相同输入导致相同输出，不同输入均匀分布。
public class Code_HashMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("test", new Object());
    }
}
