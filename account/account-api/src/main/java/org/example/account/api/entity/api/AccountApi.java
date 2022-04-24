package org.example.account.api.entity.api;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created  on 2022/4/24 17:17:38
 *
 * @author zl
 */
public interface AccountApi {

    @PutMapping("/accounts/")
    void debit(@RequestParam String userId, @RequestParam int money);
}
