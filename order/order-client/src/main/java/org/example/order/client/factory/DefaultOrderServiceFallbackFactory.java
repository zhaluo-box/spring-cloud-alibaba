package org.example.order.client.factory;

import lombok.extern.slf4j.Slf4j;
import org.example.order.client.exchange.OrderService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created  on 2022/4/24 17:17:34
 *
 * @author zl
 */
@Slf4j
@Component
public class DefaultOrderServiceFallbackFactory implements FallbackFactory<OrderService> {

    @Override
    public OrderService create(Throwable cause) {
        return (userId, commodityCode, orderCount) -> {
            log.error("订单服务调用异常：{}" + cause.getMessage(), cause);
            return null;
        };
    }
}
