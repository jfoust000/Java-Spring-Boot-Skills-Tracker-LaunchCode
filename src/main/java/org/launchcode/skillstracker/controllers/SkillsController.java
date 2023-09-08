package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsTracker() {

        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    public String skillsTrackerForm() {

        return "<html>" +
                "<body>" +
                "<form action='skillsTracker' method='post'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label>My favorite language:</label><br>" +
                "<select name='firstLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label>My second favorite language:</label><br>" +
                "<select name='secondLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label>My third favorite language:</label><br>" +
                "<select name='thirdLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @RequestMapping(value = "skillsTracker", method = RequestMethod.POST)
    public String skillsTrackerPost(@RequestParam String name,
                                    @RequestParam String firstLanguage, @RequestParam String secondLanguage,
                                    @RequestParam String thirdLanguage) {

        if (name == null) {

            name = "Anonymous Guest";

        }

        return "<html>" +
                "<body>" +
                "<h1>" + name + "'s top favorite languages:" + "</h1><br>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }



}
