package org.wristband.datasourceconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/config")
public class ConfigController {

    @RequestMapping("/homepage")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
