package org.example.order.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.order.api.entity.Order;
import org.example.order.service.mapper.OrderMapper;
import org.example.order.service.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created  on 2022/4/24 16:16:22
 *
 * @author zl
 */
@Service
public class DefaultOrderService extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Order create(String userId, String commodityCode, int orderCount) {
        // 计算金额
        int orderMoney = calculate(commodityCode, orderCount);
        // 账户扣减余额
        accountService.debit(userId, orderMoney);
        Order order = new Order().setCommodityCode(commodityCode).setUserId(userId).setCount(orderCount).setMoney(orderMoney);
        save(order);
        return order;

    }

    private int calculate(String commodityCode, int orderCount) {
        int price = 20;
        return price * orderCount;
    }
}
