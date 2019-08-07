package cn.wxingzou.walk.common.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.util.StrUtil;
import cn.wxingzou.walk.common.entity.SysUser;
import cn.wxingzou.walk.common.service.ISysUserService;
import cn.wxingzou.walk.common.util.Result;
import cn.wxingzou.walk.common.util.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @author wuxiaolin
 * @version 1.0
 * @date 2019-08-07 13:57
 **/
@RestController
@RequestMapping("${baseUrl}")
public class SysLoginController {

    @Autowired
    private ISysUserService userService;

    @PostMapping("login")
    public Result login(String username, String password, String captcha, HttpServletRequest request) {
        String sessionCaptcha = (String) request.getSession().getAttribute("captcha");
        if (Objects.isNull(sessionCaptcha) || !StrUtil.equalsIgnoreCase(sessionCaptcha, captcha)) {
            return Result.fail(ResultCode.BIND_ERROR).setMsg("验证码校验失败！");
        }

        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        SysUser user = userService.getOne(wrapper);
        if (user == null) {
            return Result.fail(ResultCode.DATA_NOTEXIST_ERROR);
        }

        return Result.success();
    }

    @RequestMapping("captcha.jpg")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(116, 36, 4, 20);
        request.getSession().setAttribute("captcha", captcha.getCode().toUpperCase());
        ServletOutputStream outputStream = response.getOutputStream();
        captcha.write(outputStream);
        outputStream.close();
    }


}
