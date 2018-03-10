package cn.lesliu.Trading.common;


/**
 * 消息体
 */
public class MessageResult {

    private String message;
    private int code;
    private Object data;
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public MessageResult(){}
    public MessageResult(String message, int code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }
    public MessageResult(String message, int code, Object data, Integer total) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.total=total;
    }
    public MessageResult(String message,int code){
        this.code=code;
        this.message=message;
    }
    public MessageResult(int code,Object data){
        this.code=code;
        this.data=data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
