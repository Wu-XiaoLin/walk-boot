package cn.wxingzou.walk.common.controller;


import cn.wxingzou.walk.common.entity.SysMenu;
import cn.wxingzou.walk.common.service.ISysMenuService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import cn.wxingzou.walk.common.controller.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuxiaolin
 * @version 1.0
 * @since 2019-08-06
 */
@Controller
@RequestMapping("${baseUrl}/common/sys-menu")
public class SysMenuController extends BaseController<ISysMenuService, SysMenu> {

}
