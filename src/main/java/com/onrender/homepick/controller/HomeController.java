package com.onrender.homepick.controller;

import com.onrender.homepick.dto.MemberSessionDto;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

    @GetMapping("/")
    public String index(HttpSession session, Model model){
        // 타운캐스팅(강제타입변환: 큰 거 -> 작은 거): Object -> MemberSessionDto
        // 데이터타입 객체 = (강제타입) session.getAttribut("변수");
        MemberSessionDto user = (MemberSessionDto) session.getAttribute("loginUser");
        model.addAttribute("user", user);
        return "index"; // templates/index.html
    }
}
