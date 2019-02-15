package com.jiahao.controller;

import com.jiahao.pojo.Commodity;
import com.jiahao.service.CommodityService;
import com.jiahao.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.text.normalizer.NormalizerBase;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "commodity")
public class CommodityController {
    Logger logger = Logger.getLogger(CommodityController.class.toString());

    @Autowired
    private CommodityService commodityService;


    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(Model model, HttpSession session, @RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password){
        String result = commodityService.login(username, password);
        if (result != null && !result.isEmpty()){
            model.addAttribute("username",result);
            session.setAttribute("username",result);
            return "home";
        }
        else{
            model.addAttribute("error","用户名或密码错误！");
            return "login";
        }

    }

    @RequestMapping(value = "getList")
    public String getList(Model model){
        List<Commodity> commodityList = commodityService.getCommodityList();
        int a = 0;
        for (Commodity c : commodityList){
            model.addAttribute("id"+a++,c.getId());
        }
        return "home";
    }

/*    @RequestMapping(value = "goLogin")
    public String goLogin(){
        return "login";
    }*/

    /**
     * 测试拦截器
     */
    @RequestMapping(value = "interceptor")
    public String interceptor(){
        logger.info("CommodityController被执行");
        return "login";
    }
}
