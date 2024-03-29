package com.tuananhdo.controller.admin;

import com.tuananhdo.service.OrderService;
import com.tuananhdo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminHomeController {
    @Autowired
    private ProductService productService;


    @GetMapping("/admin-home")
    public String home(ModelMap map) {
        map.addAttribute("listProducts", productService.finAll());
        return "admin/admin-home";
    }

}
