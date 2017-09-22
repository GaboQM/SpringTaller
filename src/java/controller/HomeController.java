/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author gaboqm
 */
@Controller
public class HomeController {
    
    @RequestMapping("home.htm")
    public ModelAndView home(){
       ModelAndView mav= new ModelAndView();
       mav.setViewName("home");
       
       return mav;
    }
    
    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros(){
       ModelAndView mav= new ModelAndView();
       mav.setViewName("nosotros");
       
       return mav;
    }
    
    
    
    
}
