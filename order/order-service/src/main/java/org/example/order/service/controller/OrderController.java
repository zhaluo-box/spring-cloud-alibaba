package org.example.order.service.controller;

import org.example.order.api.entity.Order;
import org.example.order.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  on 2022/4/24 16:16:09
 *
 * @author zl
 */
@RestController
@RequestMapping("/orders/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单,并扣减账户余额
     */
    @PostMapping
    public ResponseEntity<Order> create(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam int orderCount) {
        return ResponseEntity.ok(orderService.create(userId, commodityCode, orderCount));
    }
}
