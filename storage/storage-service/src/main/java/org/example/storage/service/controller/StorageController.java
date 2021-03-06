package org.example.storage.service.controller;

import org.example.storage.service.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  on 2022/4/18 21:21:25
 *
 * @author zl
 */
@RefreshScope
@RestController
@RequestMapping("/storages/")
public class StorageController {

    @Autowired
    StorageService storageService;

    /**
     * 扣减库存
     */
    @PostMapping
    public ResponseEntity<Void> deduct(@RequestParam String commodityCode, @RequestParam Integer count) {
        storageService.deduct(commodityCode, count);
        return ResponseEntity.ok().build();
    }

}
