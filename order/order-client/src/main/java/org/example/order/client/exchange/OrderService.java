package org.example.order.client.exchange;

import org.example.common.core.constants.ServiceNameConstant;
import org.example.order.api.entity.api.OrderApi;
import org.example.order.client.factory.DefaultOrderServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created  on 2022/4/24 17:17:32
 *
 * @author zl
 */
@FeignClient(contextId = "orderService", name = ServiceNameConstant.ORDER_SERVICE_NAME, fallbackFactory = DefaultOrderServiceFallbackFactory.class)
public interface OrderService extends OrderApi {
}
