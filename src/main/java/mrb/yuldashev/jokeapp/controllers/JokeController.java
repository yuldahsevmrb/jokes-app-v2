package mrb.yuldashev.jokeapp.controllers;

import mrb.yuldashev.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        String joke = jokeService.getJoke();
        System.out.println(joke);
        model.addAttribute("joke", joke);
        return "index";
    }
}
