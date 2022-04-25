package org.example.storage.client.exchange;

import org.example.common.core.constants.ServiceNameConstant;
import org.example.storage.api.StorageApi;
import org.example.storage.client.factory.DefaultStorageServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created  on 2022/4/24 17:17:06
 *
 * @author zl
 */
@FeignClient(contextId = "storageService", name = ServiceNameConstant.STORAGE_SERVICE_NAME, fallbackFactory = DefaultStorageServiceFallbackFactory.class)
public interface StorageService extends StorageApi {
}
