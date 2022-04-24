package org.example.storage.client.factory;

import lombok.extern.slf4j.Slf4j;
import org.example.storage.client.exchange.StorageService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created  on 2022/4/24 17:17:08
 *
 * @author zl
 */
@Slf4j
@Component
public class DefaultStorageServiceFallbackFactory implements FallbackFactory<StorageService> {

    @Override
    public StorageService create(Throwable cause) {
        return (commodityCode, count) -> log.error("扣减库存失败： ", cause);
    }
}
