package cn.wxingzou.walk.common.controller;


import cn.wxingzou.walk.common.entity.SysRole;
import cn.wxingzou.walk.common.service.ISysRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wuxiaolin
 * @version 1.0
 * @since 2019-08-06
 */
@Controller
@RequestMapping("${baseUrl}/common/role")
public class SysRoleController extends BaseController<ISysRoleService, SysRole> {



}
