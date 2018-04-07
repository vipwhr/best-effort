package com.adrian.demo.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult implements Serializable {

    Integer code;
    String message;
    Object row;

    public JsonResult(Integer code, String message, Object row) {
        this.code = code;
        this.message = message;
        this.row = row;
    }

    public JsonResult(Integer code, String message) {
        this(code, message, null);
    }

    public JsonResult(Object row){
        this(200,"SUCCESS",row);
    }


    public static JsonResult SUCCESS = new JsonResult(200, "SUCCESS");
}
