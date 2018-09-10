package com.hellozjf.test.test;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@ToString
public class B {
    private Integer b;
    private Integer c;

    public B(Integer b, Integer c) {
        this.b = b;
        this.c = c;
    }

    public B() {
    }
}
