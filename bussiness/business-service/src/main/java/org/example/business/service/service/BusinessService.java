package org.example.business.service.service;

/**
 * Created  on 2022/4/24 17:17:00
 *
 * @author zl
 */
public interface BusinessService {
    void purchase(String userId, String commodityCode, int orderCount);
}
