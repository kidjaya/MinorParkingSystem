package xyz.kidjaya.utils;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

public class ResultBuilder {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    public ResultBuilder success(Boolean success){
        this.success = success;
        return this;
    }

    public ResultBuilder code(Integer code){
        this.code = code;
        return this;
    }

    public ResultBuilder message(String message){
        this.message = message;
        return this;
    }

    public ResultBuilder data(Map<String, Object> data){
        this.data = data;
        return this;
    }

    public ResultBuilder data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ResultBuilder ok(){
        ResultBuilder resultBuilder = new ResultBuilder();
        resultBuilder.success(ResultCode.SUCCESS.getSuccess());
        resultBuilder.code(ResultCode.SUCCESS.getCode());
        resultBuilder.message(ResultCode.SUCCESS.getMessage());
        return resultBuilder;
    }

    public ResultBuilder error(){
        ResultBuilder resultBuilder = new ResultBuilder();
        resultBuilder.success(ResultCode.UNKNOWN_REASON.getSuccess());
        resultBuilder.code(ResultCode.UNKNOWN_REASON.getCode());
        resultBuilder.message(ResultCode.UNKNOWN_REASON.getMessage());
        return resultBuilder;
    }

    public Result build() {
        return new Result(success, code, message, data);
    }


}
