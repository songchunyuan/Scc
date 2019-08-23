package com.zeei.ktp.base.mapper;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by Administrator on 2019/8/20.
 */
@RegisterMapper
public interface BaseMapper<T, K> extends Mapper<T>, IdListMapper<T, K> {
}
