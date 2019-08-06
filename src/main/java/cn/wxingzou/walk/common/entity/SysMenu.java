package cn.wxingzou.walk.common.entity;

import java.time.LocalDateTime;

import cn.wxingzou.walk.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author wuxiaolin
 * @since 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ToString(callSuper = true)
public class SysMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 上级
     */
    private Long parent;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 权限
     */
    private String permission;

    /**
     * 类型   0：目录   1：菜单   2：按钮
     */
    private Integer type;

    /**
     * 菜单按钮
     */
    private String icon;

    /**
     * 排序
     */
    private Integer sort;

}
