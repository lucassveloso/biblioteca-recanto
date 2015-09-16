package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HiController {

    private static final String HI_VIEW = "hi";
    private static final String INDEX = "index";

    @RequestMapping("/")
    public String index() {
        return INDEX;
    }

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return HI_VIEW;
    }
}

