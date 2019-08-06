package cn.wxingzou.walk.common.controller;


import cn.wxingzou.walk.common.entity.SysUser;
import cn.wxingzou.walk.common.service.ISysUserService;
import cn.wxingzou.walk.common.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author wuxiaolin
 * @since 2019-08-06
 */
@RestController
@RequestMapping("${baseUrl}/common/user")
@Slf4j
public class SysUserController extends BaseController<ISysUserService, SysUser> {

}
