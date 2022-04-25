package org.example.business.service.controller;

import org.example.business.service.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  on 2022/4/24 16:16:50
 *
 * @author zl
 */

@RestController
@RequestMapping("businesses")
public class BusinessController {



    @Autowired
    private BusinessService businessService;

    /**
     * 采购
     */
    @PostMapping
    public ResponseEntity<Void> purchase(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam int orderCount) {
        businessService.purchase(userId, commodityCode, orderCount) ;
        return ResponseEntity.ok().build();
    }

}
