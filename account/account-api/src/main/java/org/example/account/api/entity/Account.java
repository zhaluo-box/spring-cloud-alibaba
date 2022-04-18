package org.example.account.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Created  on 2022/4/18 22:22:03
 *
 * @author zl
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@TableName(value = "account_tbl", autoResultMap = true)
public class Account {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String userId;

    private Long money;
}
