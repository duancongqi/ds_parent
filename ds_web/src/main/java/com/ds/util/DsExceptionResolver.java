package com.ds.util;


import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理类
 */
public class DsExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        DsException dsException = null;
        if (ex instanceof DsException){
            dsException = (DsException)ex;
        }else {
            dsException = new DsException("服务器走丢了");
        }
        //错误信息
        String message = dsException.getMessage();
        //将错误信息传到错误页面
        ModelAndView mv = new ModelAndView("error").addObject("message",message);
        return mv;
    }
}
