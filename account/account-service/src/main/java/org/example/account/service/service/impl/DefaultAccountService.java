package org.example.account.service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.account.api.entity.Account;
import org.example.account.service.mapper.AccountMapper;
import org.example.account.service.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created  on 2022/4/24 16:16:39
 *
 * @author zl
 */
@Service
public class DefaultAccountService extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void debit(String userId, int money) {
        Account account = getOne(new QueryWrapper<Account>().lambda().eq(Account::getUserId, userId));
        account.setMoney(account.getMoney() - money);
        updateById(account);
    }
}
