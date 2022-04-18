package org.example.storage.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.example.storage.entity.Storage;

/**
 * Created  on 2022/4/18 22:22:21
 *
 * @author zl
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    @Update("update storage_tbl st set st.count = st.count - #{count} where st.commodity_code = #{commodityCode} ")
    void deduct(String commodityCode, Integer count);
}
