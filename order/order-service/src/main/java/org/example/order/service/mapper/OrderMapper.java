package org.example.order.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.order.api.entity.Order;

/**
 * Created  on 2022/4/24 16:16:23
 *
 * @author zl
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
