package cn.wxingzou.walk.common.controller;

import cn.wxingzou.walk.common.entity.BaseEntity;
import cn.wxingzou.walk.common.util.Global;
import cn.wxingzou.walk.common.util.Result;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * @author wuxiaolin
 * @version 1.0
 * @date 2019-08-06 17:03
 **/
public abstract class BaseController<S extends IService, E extends BaseEntity> {

    Logger log = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    protected S service;


    @ResponseBody
    @GetMapping("/list")
    public Result list(Page<E> page, E entity) {
        IPage result = service.page(page, new QueryWrapper(entity));
        return Result.success(result);
    }


    @ResponseBody
    @GetMapping("/get/{id}")
    public Result get(@PathVariable Long id) {
        return Result.success(service.getById(id));
    }


    @ResponseBody
    @DeleteMapping("/save")
    public Result delete(E entity) {
        LocalDateTime now = LocalDateTime.now();
        entity.setEnable(Global.INT_FALSE)
                .setCreateBy(null)
                .setCreateTime(now)
                .setUpdateBy(null)
                .setUpdateTime(now);
        return Result.success(service.saveOrUpdate(entity));
    }

    @ResponseBody
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id) {
        UpdateWrapper wrapper = new UpdateWrapper();
        wrapper.eq("id", id);
        wrapper.set(true, "enable", Global.INT_TRUE);
        return Result.success(service.update(wrapper));
    }


}
