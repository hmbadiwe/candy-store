package com.learning.candystore.common;

/**
 *
 * Message delivery class.
 *
 * @author Rugal Berntein
 */
public class SweetMessage
{

    public static SweetMessage failMessage(String message)
    {
        return new SweetMessage(FAIL, message);
    }

    public static SweetMessage successMessage(String message, Object data)
    {
        return new SweetMessage(SUCCESS, message, data);
    }

    public static final String SUCCESS = "SUCCESS";

    public static final String FAIL = "FAIL";

    private String status = FAIL;

    private String message = null;

    private Object data = null;

    private SweetMessage()
    {
    }

    private SweetMessage(String status, String message, Object data)
    {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private SweetMessage(String status, String message)
    {
        this(status, message, null);
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

}
