package cn.baymin.marvel.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: jiangys
 * @Description:
 * @Date: Created in 11:29 2019/4/30
 * @Modified By:
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    public String toHome(){
        return "home/index";
    }

    @RequestMapping("/{pageName}")
    public String toPage(@PathVariable(value = "pageName")String page){
        return "home/"+page;
    }

}
