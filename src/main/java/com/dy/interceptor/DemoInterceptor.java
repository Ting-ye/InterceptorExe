package com.dy.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        String uri=req.getRequestURI();
        if(1==1){
//            uri.equals("此处填写第一次登录时的请求格式如 /login")
        }
        else{

        }
        return true;
    }

    //日志记录 或者敏感词屏蔽
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("往"+modelAndView.getViewName()+"跳转");
        System.out.println("model值为"+modelAndView.getModel().get("model"));
        String word=modelAndView.getModel().get("model").toString();
        String newWord=word.replace("去你的","***");
        modelAndView.getModel().put("model",newWord);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
