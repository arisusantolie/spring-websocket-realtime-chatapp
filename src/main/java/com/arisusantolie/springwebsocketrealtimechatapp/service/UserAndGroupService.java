package com.arisusantolie.springwebsocketrealtimechatapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserAndGroupService {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Map<String,Object>> fetchAll(String myId) {
        List<Map<String,Object>> getAllUser=jdbcTemplate.queryForList("select * from users where id!=?",myId);

        return getAllUser;

    }


    public List<Map<String,Object>> fetchAllGroup(String groupId) {
        List<Map<String,Object>> getAllUser=jdbcTemplate.queryForList("SELECT gr.* FROM `groups` gr " +
                "join group_members gm on gm.group_id=gr.id and gm.user_id=?",groupId);

        return getAllUser;
    }
}
