package com.sg.houdellhollerswebsite;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/hello"})
public class HoudellController {
        
    @RequestMapping(value = "/viewhome", method = RequestMethod.GET)
    public String displayHome(Map<String, Object> model) {
        return "home";
    }

    @RequestMapping(value = "/viewPictures", method = RequestMethod.GET)
    public String displayPicture(Map<String, Object> model) {
        return "pictures";
    }

    @RequestMapping(value = "/viewVideos", method = RequestMethod.GET)
    public String displayVideos(Map<String, Object> model) {
        return "videos";
    }

    @RequestMapping(value = "/viewShows", method = RequestMethod.GET)
    public String displayShows(Map<String, Object> model) {
        return "shows";
    }

    @RequestMapping(value = "/viewContact", method = RequestMethod.GET)
    public String displayContct(Map<String, Object> model) {
        return "contact";
    }
}
