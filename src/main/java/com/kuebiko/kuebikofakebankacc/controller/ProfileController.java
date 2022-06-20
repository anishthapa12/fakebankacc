package com.kuebiko.kuebikofakebankacc.controller;

import com.kuebiko.kuebikofakebankacc.modules.ProfileModules;
import com.kuebiko.kuebikofakebankacc.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fakeBank-profile")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @RequestMapping(value= "/signUp", method = RequestMethod.POST)
    public ProfileModules signUp(@RequestBody ProfileModules profileModules) throws Exception {
        return profileService.signUp(profileModules);

    }
    @RequestMapping(value= "/view", method = RequestMethod.GET)
    public ProfileModules view(@RequestParam String ssn ){
        return null;

    }
    @RequestMapping(value= "/update", method = RequestMethod.PUT)
    public ProfileModules update(@RequestBody ProfileModules profileModules){
        return null;
    }


}
