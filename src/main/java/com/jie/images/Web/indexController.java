package com.jie.images.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/4/10
 * WWW https://github.com/j6l
 */
@Controller
public class indexController {

    @RequestMapping("/find")
    public String gofind(){
        return "redirect:/find/1";
    }



    // @RequestMapping("/")
    // public String goindex(Model model){
    //     return "index";
    // }
}
