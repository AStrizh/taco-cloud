package com.erudos.tacocloud.data;

import com.erudos.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
