package com.goku.coreui.sys.service;

import com.github.pagehelper.PageInfo;
import com.goku.coreui.sys.model.SysMenu;
import com.goku.coreui.sys.model.SysRole;
import com.goku.coreui.sys.model.SysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2018/1/9.
 */
public interface SysUserService {
    PageInfo getUserForPaging(String username, String name,String orderFiled, String orderSort, int pageindex, int pagenum);
    SysUser selectByPrimaryKey(String UserId);
    int deleteUser(String UserId);
    int saveUser(SysUser sysUser);
    int editUser(SysUser sysUser);
    int menuAuth(List<SysMenu> sysMenus, String userid, String moduleId);
    int roleauth(List<SysRole> sysRoles, String userid);

    int insert(SysUser sysUser);
    int edit(SysUser user);
    int delete(String ids);
    SysUser queryByOpenId(String openId);
    Map queryById(String id);
}
