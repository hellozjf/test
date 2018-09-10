package com.hellozjf.test.test;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@ToString
public class A {
    private Integer a;
    private Integer c;

    public A(Integer a, Integer c) {
        this.a = a;
        this.c = c;
    }

    public A() {
    }
}
