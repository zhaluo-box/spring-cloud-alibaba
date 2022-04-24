package org.example.order.api.entity.api;

import org.example.order.api.entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created  on 2022/4/24 17:17:29
 *
 * @author zl
 */
public interface OrderApi {

    @RequestMapping("/orders/")
    Order create(String userId, String commodityCode, int orderCount);
}
