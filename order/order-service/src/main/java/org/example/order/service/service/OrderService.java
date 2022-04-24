package org.example.order.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.order.api.entity.Order;

/**
 * Created  on 2022/4/24 16:16:20
 *
 * @author zl
 */
public interface OrderService extends IService<Order> {
    /**
     * 添加订单
     *
     * @param userId        用户ID
     * @param commodityCode 商品编号
     * @param orderCount    订单数量
     */
    Order create(String userId, String commodityCode, int orderCount);
}
