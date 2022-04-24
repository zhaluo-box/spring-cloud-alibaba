package org.example.order.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Created  on 2022/4/24 16:16:11
 *
 * @author zl
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@TableName(value = "order_tbl", autoResultMap = true)
public class Order {

    @TableId
    private Long id;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 商品编号
     */
    private String commodityCode;

    /**
     * 商品数量
     */
    private Integer count;

    /**
     * 订单金额
     */
    private long money;

}
