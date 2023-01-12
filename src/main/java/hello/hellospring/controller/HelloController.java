package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //get으로 hello라는 데이터가 넘어왔을때(@GetMapping("hello"))
    //hello1.html viewpage로 연결한다(return값에 해당하는 html페이지)
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello1";
    }

    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("data", "login완료");
        return "/LoginPage/login";
    }
}
