package com.binron.multidatasource.mapper.master;

import com.binron.multidatasource.mapper.base.BaseMapper;
import com.binron.multidatasource.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    
}
