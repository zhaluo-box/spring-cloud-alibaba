package org.example.business.service.service.impl;

import org.example.business.service.service.BusinessService;
import org.example.order.client.exchange.OrderService;
import org.example.storage.client.exchange.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created  on 2022/4/24 17:17:00
 *
 * @author zl
 */
@Service
public class DefaultBusinessService implements BusinessService {

    @Autowired
    private StorageService storageService;

    @Autowired
    private OrderService orderService;

    @Override
    public void purchase(String userId, String commodityCode, int orderCount) {
        // 扣减库存
        storageService.deduct(commodityCode, orderCount);
        // 创建订单
        orderService.create(userId, commodityCode, orderCount);
    }
}
