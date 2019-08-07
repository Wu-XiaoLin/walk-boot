package cn.wxingzou.walk.common.service;

import cn.wxingzou.walk.common.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author wuxiaolin
 * @since 2019-08-06
 */
public interface ISysUserService extends IService<SysUser> {

    public SysUser findByUsername(String username);

}
