package com.fight.dao;

import com.fight.entity.AdminUser;
import com.fight.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class TestMapperTest {


    /**
     * 测试AdminUserMapper的功能
     */
    @Test
    public void test2() {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AdminUserMapper mapper = sqlSession.getMapper(AdminUserMapper.class);
        AdminUser adminUser = mapper.selectByPrimaryKey(5);
        System.out.println(adminUser);
    }

    // 测试插入数据
    @Test
    public void test3() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AdminUserMapper mapper = sqlSession.getMapper(AdminUserMapper.class);
        Byte a = 0;
        AdminUser adminUser = new AdminUser(5,"admin5", "e10adc3949ba59abbe56e057f20f883e", "胡八一", a);
        mapper.insert(adminUser);
        sqlSession.commit();
        sqlSession.close();
    }
}