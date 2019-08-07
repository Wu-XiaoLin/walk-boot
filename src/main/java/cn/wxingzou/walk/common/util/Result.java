package cn.wxingzou.walk.common.util;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Objects;

/**
 * 封装通用响应
 *
 * @author wuxiaolin
 * @version 1.0
 * @date 2019-08-06 17:04
 **/
@ToString
@Data
@Accessors(chain = true)
public class Result {

    private int code = 200;//错误代码
    private String msg = "操作成功";// 提示信息
    private Object data = null;

    public Result() {

    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Result(Object data) {
        this.data = data;
    }

    public static Result error(ResultCode resultCode) {
        return new Result(resultCode.getErrorCode(), resultCode.getMsg());
    }

    public static Result fail(ResultCode resultCode) {
        return new Result(resultCode.getErrorCode(), resultCode.getMsg());
    }

    public static Result fail(ResultCode resultCode, Object data) {
        Result result = new Result(resultCode.getErrorCode(), resultCode.getMsg());
        if (Objects.nonNull(data)) {
            result.setData(data);
        }
        return result;
    }

    public static Result success(Object data) {
        return new Result(data);
    }


    public static Result success() {
        return new Result();
    }

}

