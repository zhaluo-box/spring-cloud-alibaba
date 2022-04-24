package org.example.account.service.controller;

import org.example.account.api.entity.Account;
import org.example.account.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created  on 2022/4/24 16:16:35
 *
 * @author zl
 */
@RestController
@RequestMapping("/accounts/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 扣减余额
     *
     * @param userId 用户ID
     * @param money  金额
     */
    @PutMapping
    public ResponseEntity<Void> debit(@RequestParam String userId, @RequestParam int money) {
        accountService.debit(userId, money);
        return ResponseEntity.ok().build();
    }

    /**
     * 添加账户
     */
    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        accountService.save(account);
        return ResponseEntity.ok(account);
    }
}
