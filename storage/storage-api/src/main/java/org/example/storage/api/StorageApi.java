package org.example.storage.api;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created  on 2022/4/18 22:22:16
 *
 * @author zl
 */

public interface StorageApi {

    @PostMapping("/storages/")
    void deduct(String commodityCode, Integer count);

}
