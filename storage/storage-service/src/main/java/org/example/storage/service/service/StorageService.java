package org.example.storage.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.storage.entity.Storage;

/**
 * Created  on 2022/4/18 22:22:21
 *
 * @author zl
 */
public interface StorageService extends IService<Storage> {
    void deduct(String commodityCode, Integer count);
}
