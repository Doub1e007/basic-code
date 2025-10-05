package com.doub1e.exception;

import com.doub1e.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice    // 用来捕获控制器Controller层抛出的所有异常
//@ResponseBody
//@ControllerAdvice
public class GlobalExceptionHander {
    @ExceptionHandler(Exception.class)       // 指定处理何种异常
    public Result doException(Exception ex){
        log.error(ex.getMessage());
        return Result.error("出错了，请联系管理员！！！");

    }
}
