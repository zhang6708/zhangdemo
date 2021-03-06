package com.aocismanage.modules.common;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandlerInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object user = request.getSession().getAttribute("loginCode");
        //System.out.println("user = " + user);
        // 如果获取的request的session中的loginUser参数为空（未登录），就返回登录页，否则放行访问
        if (user != null) {
            return true;

        } else {
            // 已登录，放行
            // 未登录，给出错误信息，
////            request.setAttribute("msg","无权限请先登录");
//            // 获取request返回页面到登录页
            String path =request.getSession() .getServletContext().getContextPath();
            response.sendRedirect(path + "/");
            // request.getRequestDispatcher("html/Login").forward(request, response);
            return false;
        }


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
