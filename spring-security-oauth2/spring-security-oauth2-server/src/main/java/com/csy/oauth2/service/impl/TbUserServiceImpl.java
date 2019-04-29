package com.csy.oauth2.service.impl;

import com.csy.oauth2.domain.TbUser;
import com.csy.oauth2.mapper.TbUserMapper;
import com.csy.oauth2.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TbUserServiceImpl implements TbUserService {
    @Resource
    private TbUserMapper tbUserMapper;
    @Override
    public TbUser getByUsername(String username) {
        Map map = new HashMap();
        map.put("username", username);
        List<TbUser>users = tbUserMapper.query(map);
        return users.get(0);
    }
}
