package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/")
    String home(HttpServletRequest req, Model model) {
        model.addAttribute("status", req.getParameter("status"));
        return "home";
    }


//    @RequestMapping("/archivedCardsPage")
//    String archivedCardsPage(HttpServletRequest req) {
//        if (AccountResolver.INSTANCE.getAccount(req) != null) {
//            return "archivedCardsPage";
//        }
//
//        return "redirect:/login";
//    }

}