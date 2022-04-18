package org.example.storage.service.controller;

import org.example.storage.service.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ResponseEntity<Void> deduct(String commodityCode, Integer count) {
        storageService.deduct(commodityCode, count);
        return ResponseEntity.ok().build();
    }

    @Value("${test.str}")
    private String valStr;

    @GetMapping
    public String get() {

        System.out.println(valStr + "  =======================");
        return valStr;
    }

}
