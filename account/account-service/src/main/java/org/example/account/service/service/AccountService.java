package org.example.account.service.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.account.api.entity.Account;

/**
 * Created  on 2022/4/24 16:16:38
 *
 * @author zl
 */
public interface AccountService extends IService<Account> {
    void debit(String userId, int money);
}
