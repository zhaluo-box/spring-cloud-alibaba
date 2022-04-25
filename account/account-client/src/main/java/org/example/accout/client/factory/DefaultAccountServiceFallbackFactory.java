package org.example.accout.client.factory
                ;

import lombok.extern.slf4j.Slf4j;
import org.example.accout.client.exchange.AccountService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created  on 2022/4/25 09:9:32
 *
 * @author zl
 */
@Slf4j
@Component
public class DefaultAccountServiceFallbackFactory implements FallbackFactory<AccountService> {

    @Override
    public AccountService create(Throwable cause) {
        return (userId, money) -> log.error("账户服务调用异常：", cause);
    }
}
