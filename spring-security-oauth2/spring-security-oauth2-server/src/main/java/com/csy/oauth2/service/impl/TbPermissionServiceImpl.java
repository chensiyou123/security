package com.csy.oauth2.service.impl;

import com.csy.oauth2.domain.TbPermission;
import com.csy.oauth2.mapper.TbPermissionMapper;
import com.csy.oauth2.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;
    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        Map map = new HashMap();
        map.put(userId,userId);
        return tbPermissionMapper.query(map);
    }
}
