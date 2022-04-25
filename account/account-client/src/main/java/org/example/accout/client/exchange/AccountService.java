package org.example.accout.client.exchange;

import org.example.account.api.entity.api.AccountApi;
import org.example.accout.client.factory.DefaultAccountServiceFallbackFactory;
import org.example.common.core.constants.ServiceNameConstant;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created  on 2022/4/25 09:9:30
 *
 * @author zl
 */
@FeignClient(contextId = "accountService", name = ServiceNameConstant.ACCOUNT_SERVICE_NAME, fallbackFactory = DefaultAccountServiceFallbackFactory.class)
public interface AccountService extends AccountApi {

}
