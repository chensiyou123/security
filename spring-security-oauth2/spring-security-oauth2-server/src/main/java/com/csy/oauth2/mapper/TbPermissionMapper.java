package com.csy.oauth2.mapper;

import com.csy.oauth2.domain.TbPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TbPermissionMapper {
    List<TbPermission> query(Map map);
}
