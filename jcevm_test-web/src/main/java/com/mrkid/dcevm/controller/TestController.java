package com.mrkid.dcevm.controller;

import com.mrkid.dcevm.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: xudong
 * Date: 5/18/15
 * Time: 3:35 PM
 */
@Controller
public class TestController {
    @Autowired
    private CalcService calcService;

    @RequestMapping(value = "/calc", method = RequestMethod.GET)
    @ResponseBody
    public String calc(@RequestParam("a") int a, @RequestParam("b") int b) {
        return String.valueOf(calcService.calc(a, b));
    }

}
