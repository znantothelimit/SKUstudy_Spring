package SKstudy_1._hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello") // get방식 (<-> post방식)
    public String hello(Model model) { // model에다가 key는 data를, value는 hello 넣어줌
        model.addAttribute("data", "hello!!");
        return "hello"; // templates 디렉토리 안의 hello.html 파일을 찾아서 랜더링해줌
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) { // 키에 대한 밸류값을 받아 템플릿이 변환하여 전달
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello {
        private String name;

        /*getter setter 방식*/
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
