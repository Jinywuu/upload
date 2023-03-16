package upload.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/hello")
public class hellowcentos {
    @GetMapping("/ss")
    public String hellocentos(){
        log.info("收到访问");
        System.out.println("");
        return "hhhhhhhhhhasdasdasd";
    }
}
