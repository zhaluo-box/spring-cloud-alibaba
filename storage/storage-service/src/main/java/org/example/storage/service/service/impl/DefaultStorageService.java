package org.example.storage.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.storage.entity.Storage;
import org.example.storage.service.mapper.StorageMapper;
import org.example.storage.service.service.StorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created  on 2022/4/18 22:22:23
 *
 * @author zl
 */
@Service
public class DefaultStorageService extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, Integer count) {
        baseMapper.deduct(commodityCode, count);
    }
}
