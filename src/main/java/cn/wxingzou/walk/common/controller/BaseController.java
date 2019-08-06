package cn.wxingzou.walk.common.controller;

import cn.wxingzou.walk.common.entity.BaseEntity;
import cn.wxingzou.walk.common.util.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wuxiaolin
 * @version 1.0
 * @date 2019-08-06 17:03
 **/
public abstract class BaseController<S extends IService, E extends BaseEntity> {

    Logger log = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private S service;


    @ResponseBody
    @RequestMapping("/list")
    public Result list(Page<E> page, E entity) {
        log.info("page {}", page);
        log.info("entity {}", entity);
        IPage result = service.page(page);
        return Result.success(result);
    }

}
