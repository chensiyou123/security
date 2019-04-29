package com.csy.oauth2.mapper;

import com.csy.oauth2.domain.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TbUserMapper{
    List<TbUser>query(Map map);
}
