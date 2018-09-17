package com.flying;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {

        // 1. Individual values 单独值
        Stream stream = Stream.of("a1", "b1", "c1");
        stream.forEach(System.out::print);//打印 a1b1c1

        // 2. Arrays 数组
        String[] strArray = new String[] {"a2", "b2", "c2"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        System.out.println(stream.collect(Collectors.joining(",")).toString());//打印 a2,b2,c2


    }

}
