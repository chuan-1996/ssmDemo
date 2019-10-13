package com.chuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qq491
 */

@Controller
public class IndexController  extends BaseController{
    @RequestMapping(value = "/index")
    public String loadAnalysisLoginPage() {
        return "/index";
    }
}
