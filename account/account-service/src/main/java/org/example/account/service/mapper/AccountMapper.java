package org.example.account.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.account.api.entity.Account;

/**
 * Created  on 2022/4/24 16:16:37
 *
 * @author zl
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
