package cn.wxingzou.walk.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wuxiaolin
 * @version 1.0
 * @date 2019-08-06 16:00
 **/
@Data
@Accessors(chain = true)
@EqualsAndHashCode
public class BaseEntity implements Serializable {

    @TableId
    private Long id;

    /**
     * 是否停用 使用 {@link cn.wxingzou.walk.common.util.Global} 的 INT_TRUE 和 INT_FALSE
     */
    private Integer enable;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private Long updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;


    public <T> T convert(Class<T> clazz) {
        return (T) this;
    }

}