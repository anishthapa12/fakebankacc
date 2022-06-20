package com.kuebiko.kuebikofakebankacc.controller;

import com.kuebiko.kuebikofakebankacc.models.ProfileModel;
import com.kuebiko.kuebikofakebankacc.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fakeBank-profile")
public class ProfileController {
    @Autowired
    ProfileService profileService;


    @RequestMapping(value= "/signUp", method = RequestMethod.POST)
    public ProfileModel signUp(@RequestBody ProfileModel profileModules) throws Exception {
        return profileService.signUp(profileModules);

    }

    @RequestMapping(value= "/view", method = RequestMethod.GET)
    public ProfileModel view(@RequestParam String ssn ){
        return profileService.get(ssn);
    }

    @RequestMapping(value= "/update", method = RequestMethod.PUT)
    public ProfileModel update(@RequestBody ProfileModel profileModules){
        return null;
    }


}
