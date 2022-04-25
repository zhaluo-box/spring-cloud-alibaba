package org.example.order.api.entity.api;

import org.example.order.api.entity.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created  on 2022/4/24 17:17:29
 *
 * @author zl
 */
public interface OrderApi {

    @RequestMapping("/orders/")
    Order create(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam int orderCount);
}
