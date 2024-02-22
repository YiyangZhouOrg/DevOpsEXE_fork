package com.liam.cloud6225.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {
    private final SqlSession sqlSession;

    public UserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Object> selectAllUsers() {
        return this.sqlSession.selectList("selectAllUsers");
    }
}
