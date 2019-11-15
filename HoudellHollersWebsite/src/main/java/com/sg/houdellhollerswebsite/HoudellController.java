package com.sg.houdellhollerswebsite;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HoudellController {
    @RequestMapping(value = "/viewHome", method = RequestMethod.GET)
    public String displayHeroes(Map<String, Object> model) {
        return "home";
    }

    @RequestMapping(value = "/viewPictures", method = RequestMethod.GET)
    public String displayPictures(Map<String, Object> model) {
        List<Picture> pictureList = dao.getAllPictures();
        model.put("pictureList", pictureList);
        return "pictures";
    }

    @RequestMapping(value = "/viewVideos", method = RequestMethod.GET)
    public String displayVideos(Map<String, Object> model) {
        List<Video> videoList = dao.getAllVideos();
        model.put("videoList", videoList);
        return "videos";
    }

    @RequestMapping(value = "/viewShows", method = RequestMethod.GET)
    public String displayShows(Map<String, Object> model) {
        List<Shows> showList = dao.getAllShows();
        model.put("showList", showList);
        return "shows";
    }

    @RequestMapping(value = "/viewContact", method = RequestMethod.GET)
    public String displayContact(Map<String, Object> model) {
        List<Contact> contactList = dao.getAllContacts();
        model.put("contactList", contactList);
        return "contacts";
    }
}
