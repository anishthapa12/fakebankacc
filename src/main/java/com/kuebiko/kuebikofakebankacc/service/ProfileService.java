package com.kuebiko.kuebikofakebankacc.service;

import com.kuebiko.kuebikofakebankacc.doa.ProfileDao;
import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import com.kuebiko.kuebikofakebankacc.mappers.ProfileMapper;
import com.kuebiko.kuebikofakebankacc.models.ProfileModel;
import com.kuebiko.kuebikofakebankacc.validation.ProfileValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileService implements ProfileServiceIf {
    @Autowired
    ProfileDao profileDao;

    @Override
    public ProfileModel signUp(ProfileModel profileModules) {

        String anyErrors = ProfileValidation.validateProfileData(profileModules);
        if (anyErrors != null) {
            ProfileModel response = new ProfileModel();
            response.setMessage(anyErrors);
            return response;
        }
        ProfileEntity profileEntity = ProfileMapper.map(profileModules);
        ProfileEntity saveEntity = profileDao.save(profileEntity);
        ProfileModel response = ProfileMapper.map(saveEntity);

        return response;
    }

    @Override
    public ProfileModel get(String ssn) {

        // validate ssn
         String errors = ProfileValidation.validateSsn(ssn);

        if(errors != null) {
            ProfileModel response = new ProfileModel();
            response.setMessage(errors);
            return  response;
        }
        //
        ProfileEntity profileEntity = profileDao.getBySsn(ssn);
        if(profileEntity == null) {
            ProfileModel response = new ProfileModel();
            response.setMessage("No data found for " + ssn);
            return  response;
        }

        // map entity to model
        return ProfileMapper.map(profileEntity);

    }

}
