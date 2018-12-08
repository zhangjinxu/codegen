package com.zjx.opensource.codegen.exception;

import com.zjx.opensource.codegen.util.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

    @ExceptionHandler(ServiceException.class)
    public ResponseResult handleServiceException(ServiceException e) {
        return ResponseResult.getFailResult(e.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    public ResponseResult handleThrowable(Throwable t) {
        return ResponseResult.getFailResult();
    }
}
