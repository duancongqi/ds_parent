package com.ds.controller;

import com.ds.pojo.Datas;
import com.ds.pojo.User;
import com.ds.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserServcie userServcie;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping(value = {"/","index"},method = RequestMethod.GET)
    //@ResponseBody
    public String Hello(ModelMap map){
   // public ModelAndView Hello(){
        List<User> list = userServcie.findUser();
        map.addAttribute("list",list);
        //return new ModelAndView("WEB-INF/list").addObject("list",list);
        return "WEB-INF/list";
    }

    /**
     * 测试
     */
    @RequestMapping(value = "test",method = {RequestMethod.POST})
    @ResponseBody
    public void test(@RequestBody Datas datas){
      System.out.print(datas.toString());

    }
    /**
     * 测试
     */
    @RequestMapping(value = "test1",method ={RequestMethod.POST,RequestMethod.GET} )
    @ResponseBody
    public void test1(@RequestBody String data){
      System.out.print(data);
    }

}
