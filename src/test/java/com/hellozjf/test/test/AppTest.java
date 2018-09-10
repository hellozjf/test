package com.hellozjf.test.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testBeanUtils() throws Exception {

        A a = new A(1, 3);
        B b = new B();
        BeanUtils.copyProperties(b, a);
        assertEquals(null, b.getB());
        assertEquals(Integer.valueOf(3), b.getC());
    }

    @Test
    public void testBeanUtils2() throws Exception {

        A a = new A(1, null);
        B b = new B();
        BeanUtils.copyProperties(b, a);
        assertEquals(null, b.getB());
        assertEquals(null, b.getC());
    }
}
