package com.kuebiko.kuebikofakebankacc.service;

import com.kuebiko.kuebikofakebankacc.models.ProfileModel;

public interface ProfileServiceIf {

    public ProfileModel signUp(ProfileModel profileModules) throws Exception;


    ProfileModel get(String ssn);
}
