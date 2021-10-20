package cn.ekgc.witmed.base.pojo.vo;

import cn.ekgc.witmed.base.pojo.enums.ResponseCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * <b>系统基础信息类 - 系统响应视图信息</b>
 * <p>
 *     系统响应视图包含一下属性：<br/>
 *     1、响应编码：code<br/>
 *     2、响应数据：data<br/>
 *     所有返回前端数据<b>都必须以本系统响应视图信息返回</b>
 * </p>
 * @param <E>
 * @author HUAWEI MACBOOK
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("系统基础信息类 - 系统响应视图信息")
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -8727308959795367090L;
	@ApiModelProperty(name = "系统响应编码",example = "2000")
	private Integer code;
	@ApiModelProperty(name = "系统响应数据")
	private E data;

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public static ResponseVO getSuccessResponseVO(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode()
				, ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getRemark());
	}

	public static ResponseVO getSuccessResponseVO(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode()
				,data);
	}

	public static ResponseVO getUnAutnResponseVO(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getCode()
				, ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getRemark());
	}

	public static ResponseVO getErrorResponseVO(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode()
				, data);
	}

	public static ResponseVO getExceptionResponseVO(Exception exception){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_EXCEPTION.getCode()
				, exception.getMessage());
	}
}
