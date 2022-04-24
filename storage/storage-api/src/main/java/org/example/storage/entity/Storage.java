package org.example.storage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 库存
 * Created  on 2022/4/18 21:21:15
 *
 * @author zl
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@TableName(value = "storage_tbl",autoResultMap = true)
public class Storage {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 唯一索引
     * 商品编码
     */
    private String commodityCode;

    /**
     * 库存
     */
    private Long count;

}
