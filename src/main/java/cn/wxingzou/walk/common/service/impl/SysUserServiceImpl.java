package cn.wxingzou.walk.common.service.impl;

import cn.wxingzou.walk.common.entity.SysUser;
import cn.wxingzou.walk.common.mapper.SysUserMapper;
import cn.wxingzou.walk.common.service.ISysUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author wuxiaolin
 * @since 2019-08-06
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public SysUser findByUsername(String username) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        SysUser user = this.getOne(wrapper);
        return user;
    }
}
