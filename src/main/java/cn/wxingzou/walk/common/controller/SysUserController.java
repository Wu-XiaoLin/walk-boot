package cn.wxingzou.walk.common.controller;


import cn.wxingzou.walk.common.entity.SysUser;
import cn.wxingzou.walk.common.service.impl.SysUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author wuxiaolin
 * @since 2019-08-06
 */
@Controller
@RequestMapping("${baseUrl}/common/user")
@Slf4j
public class SysUserController extends BaseController<SysUserServiceImpl, SysUser> {


}
