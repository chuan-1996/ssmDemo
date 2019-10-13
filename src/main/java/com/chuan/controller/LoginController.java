package com.chuan.controller;

import com.chuan.commons.isEmpty;
import com.chuan.po.User;
import com.chuan.service.vo.UserVO;
import com.chuan.service.UserService;
import com.chuan.service.BeanMapperService;
import com.chuan.commons.Result;
import com.chuan.commons.SessionConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
class LoginController extends  BaseController{

    @Autowired
    private UserService userService;
    @Autowired
    private BeanMapperService beanMapperService;

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    //加载系统登录页面
    @RequestMapping(value = "/login")
    public String loadLoginPage() {
        return "/login";
    }

    @RequestMapping(value = "/register")
    public String loadRegisterPage() {
        return "/register";
    }
    //加载系统登录页面
    @RequestMapping(value = "/update")
    public String loadUpdatePage() {
        return "/changepasswd";
    }

    //用户登录校验
    @RequestMapping(value = "/login-check", method = RequestMethod.POST)
    @ResponseBody
    public Result loginCheck(HttpServletRequest request, @RequestParam("username") String userName,
                             @RequestParam("password") String password) {

        //可用shiro
        System.out.println("ready to check!");
        User a = userService.getUserByUserName(userName);

        //PO-VO
        if(isEmpty.isObjectNotEmpty(a)){
            if(userService.loginCheck(a,password)){
                UserVO b = beanMapperService.mapper(a,UserVO.class);
                super.setSessionUser(SessionConst.IN, request, b);
                return Result.success();
            }
            return Result.error("密码错误");
        }
        return Result.error("用户不存在");

    }

    //用户注册
    @RequestMapping(value = "/user-add", method = RequestMethod.POST)
    @ResponseBody
    public Result userAdd(HttpServletRequest request, @RequestParam("username") String userName, @RequestParam("realname") String realname,
                             @RequestParam("password") String password) {

        Object a = userService.saveUsers(userName,realname,password);
        if(a instanceof Result) {
            return (Result)a;
        }
        super.setSessionUser(SessionConst.IN,request,(UserVO)a);
        return Result.success();
    }

    //修改密码
    @RequestMapping(value = "/update-password", method = RequestMethod.POST)
    @ResponseBody
    public Result changePassword(HttpServletRequest request, @RequestParam("oldPassword") String oldPassword, @RequestParam("password1") String password1,
                          @RequestParam("password2") String password2) {

        Object a = userService.updatePassword(super.getSessionUser(SessionConst.IN,request),oldPassword,password1,password2);
        if(a instanceof Result) {
            return (Result)a;
        }
        super.removeSessionUser(SessionConst.OUT, request);
        super.setSessionUser(SessionConst.IN,request,(UserVO)a);
        return Result.success();
    }

    //管理页面
    @RequestMapping(value = "/management", method = RequestMethod.GET)
    public String management() {
        return "/management";
    }
    @RequestMapping(value = "/show-user")
    @ResponseBody
    public List<UserVO> showUser(HttpServletRequest request) {
        //是管理员
        if(super.getSessionUser(SessionConst.IN,request).getUsername().equals("admin")){
            return userService.getUsers();
        }
        else{
            return null;
        }
    }
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        super.removeSessionUser(SessionConst.OUT, request);
        return "redirect:/login";
    }

}
