package com.xiao.util;


import org.junit.jupiter.api.Test;

class ArrayTest {
    @Test
    void add() throws IllegalAccessException {
        Array<Integer> array = new Array();
        array.add(0, 2);
        System.out.println(array.toString());
    }
    
}
