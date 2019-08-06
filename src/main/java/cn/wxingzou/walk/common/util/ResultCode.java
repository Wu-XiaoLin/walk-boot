package cn.wxingzou.walk.common.util;

/**
 * ajax返回结果嵌套对象
 * @author 武晓林
 */
public class ResultCode {

    private int errorCode;
    private String msg;

    public ResultCode() {
    }

    public ResultCode(int errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public static final ResultCode SUCCESS = new ResultCode(200, "操作成功");
    public static final ResultCode BIND_ERROR = new ResultCode(400001, "参数校验异常");
    public static final ResultCode DATA_NOTEXIST_ERROR = new ResultCode(500001, "数据不存在");
    public static final ResultCode SAVE_DATA_ERROR = new ResultCode(500002, "保存数据失败！");
    public static final ResultCode PERMISSION_ERROR = new ResultCode(500003, "权限异常！");
    public static final ResultCode NIM_SERVER_ERROR = new ResultCode(501001, "云信服务调用异常！");

}
