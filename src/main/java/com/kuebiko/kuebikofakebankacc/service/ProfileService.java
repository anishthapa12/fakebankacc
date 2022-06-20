package com.kuebiko.kuebikofakebankacc.service;

import com.kuebiko.kuebikofakebankacc.doa.ProfileDao;
import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import com.kuebiko.kuebikofakebankacc.mappers.ProfileMapper;
import com.kuebiko.kuebikofakebankacc.modules.ProfileModules;
import com.kuebiko.kuebikofakebankacc.validation.ProfileValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileService implements ProfileServiceIf {
    @Autowired
    ProfileDao profileDao;

    @Override
    public ProfileModules signUp(ProfileModules profileModules) {

        String anyErrors = ProfileValidation.validateProfileData(profileModules);
        if (anyErrors != null) {
            ProfileModules response = new ProfileModules();
            response.setMessage(anyErrors);
            return response;
        }
        ProfileEntity profileEntity = ProfileMapper.map(profileModules);
        ProfileEntity saveEntity = profileDao.save(profileEntity);
        ProfileModules response = ProfileMapper.map(saveEntity);

        return response;
    }

}
