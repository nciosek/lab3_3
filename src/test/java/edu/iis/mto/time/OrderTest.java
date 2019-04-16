package edu.iis.mto.time;

import org.junit.Test;

public class OrderTest {

    @Test (expected = OrderExpiredException.class) public void orderExpiredDateTest(){
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}