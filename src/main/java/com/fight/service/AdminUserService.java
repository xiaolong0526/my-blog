package com.fight.service;


import com.fight.entity.AdminUser;

public interface AdminUserService {

    AdminUser login(String userName, String password);

    /**
     * 获取用户信息
     * @param loginUserId
     * @return
     */
    AdminUser getUserDetailById(Integer loginUserId);

    /**
     * 修改当前登陆用户的登陆密码
     * @param loginUserId
     * @param originPassword
     * @param newPassword
     * @return
     */
    Boolean updatePassword(Integer loginUserId, String originPassword, String newPassword);

    /**
     * 修改当前登陆用户的名称信息
     * @param loginUserId
     * @param loginUserName
     * @param nickName
     * @return
     */
    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);

}
