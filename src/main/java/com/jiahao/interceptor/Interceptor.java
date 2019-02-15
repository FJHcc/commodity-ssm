package com.jiahao.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

/**
 * @author fangjiahao
 * @data 2019/2/15 14:39
 */
public class Interceptor implements HandlerInterceptor {
    Logger logger = Logger.getLogger(Interceptor.class.toString());

    @Override
    /**
    * 在调用控制器之前执行preHandle，如果返回TRUE,则调用下一个拦截器的preHandle方法。
    * 如果所有的preHandle都返回true，则调用控制器进行处理。
     * 返回false终止调用
    */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Interceptor的preHandle方法被调用");
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("username");
        if (name.isEmpty()){
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;
        }
        else
        return true;
    }

    @Override
    /**
     * 在执行控制器的方法时调用，而且控制器中所有的代码执行完之后调用postHandle方法，该方法能处理模型数据
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    /**
     * 当控制器执行完后，将模型与视图返回给核心控制器，核心控制器渲染完视图之后afterCompletion调用。
     * 只有对应的preHandle返回true时该方法调用
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
