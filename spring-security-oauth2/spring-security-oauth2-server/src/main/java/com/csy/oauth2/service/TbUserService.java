package com.csy.oauth2.service;

import com.csy.oauth2.domain.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
