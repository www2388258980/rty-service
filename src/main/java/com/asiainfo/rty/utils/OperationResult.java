package com.asiainfo.rty.utils;

import java.io.Serializable;

/**
 * 操作返回对象
 *
 * @author <a href="mailto:lihz2@asiainfo.com">FluteD</a>
 * @version 2016-4-11
 */
public class OperationResult<T> implements Serializable {

    private static final long serialVersionUID = 4573613428545769800L;

    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_FAILURE = "fail";

    public OperationResult() {
        this.status = STATUS_SUCCESS;
    }

    public OperationResult(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public OperationResult(String status, String message, T data, long total) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.total = total;
    }

    public OperationResult(String status, String message, T data, String errorCode) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.errorCode = errorCode;
    }


    /**
     * 操作结果状态
     */
    private String status;

    /**
     * 错误代码，各模块自行定义
     * 操作为STATUS_SUCCESS时，为空。
     */
    private String errorCode;

    /**
     * 错误简短信息
     * 操作为STATUS_SUCCESS时，为空。
     */
    private String message;

    /**
     * 操作返回的可序列化对象
     */
    private T data;

    /**
     * 数据总量，用于分页查询时使用
     */
    private long total;


    /**
     * 错误
     *
     * @param msg
     * @return
     */
    public OperationResult<T> failure(String msg) {
        this.setStatus(OperationResult.STATUS_FAILURE);
        this.setMessage(msg);
        return this;
    }

    /**
     * 成功
     *
     * @param msg
     * @return
     */
    public OperationResult<T> success(String msg) {
        this.setStatus(OperationResult.STATUS_SUCCESS);
        this.setMessage(msg);
        return this;
    }

    /**
     * 判断是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        return STATUS_SUCCESS.equals(this.getStatus());
    }


    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the total
     */
    public long getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(long total) {
        this.total = total;
    }


}

