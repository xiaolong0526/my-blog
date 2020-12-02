package com.fight.service.impl;

import com.fight.dao.AdminUserMapper;
import com.fight.entity.AdminUser;
import com.fight.service.AdminUserService;
import com.fight.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AdminUserServiceImpl implements AdminUserService {


    @Resource
    private AdminUserMapper adminUserMapper;

    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */
    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, passwordMd5);
    }

    /**
     * 根据id获取详情信息
     * @param loginUserId
     * @return
     */
    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    /**
     * 更改密码
     * @param loginUserId
     * @param originPassword
     * @param newPassword
     * @return
     */
    @Override
    public Boolean updatePassword(Integer loginUserId, String originPassword, String newPassword) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            String originPasswordMD5 = MD5Util.MD5Encode(originPassword, "UTF-8");
            String newPasswordMD5 = MD5Util.MD5Encode(newPassword, "UTF-8");
            //比较原始密码是否相同
            if (originPasswordMD5.equals(adminUser.getLoginPassword())) {
                //设置新密码
                adminUser.setLoginPassword(newPasswordMD5);
                // 判断是否修改成功,update和insert语句返回的是sql语句影响的行数
                if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 修改当前登陆用户信息
     * @param loginUserId
     * @param loginUserName
     * @param nickName
     * @return
     */
    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        AdminUser adminUser = adminUserMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null) {
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            // 判断是否修改成功
            if (adminUserMapper.updateByPrimaryKeySelective(adminUser) > 0) {
                return true;
            }
        }
        return false;
    }
}
