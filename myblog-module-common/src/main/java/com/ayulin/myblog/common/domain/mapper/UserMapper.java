package com.ayulin.myblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ayulin.myblog.common.domain.dos.UserDO;

/**
 * @author: ayulin
 * @description: TODO
 **/
public interface UserMapper extends BaseMapper<UserDO> {
    // 添加一个根据用户名查询信息的默认方法
    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }
}