package com.kuebiko.kuebikofakebankacc.mappers;

import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import com.kuebiko.kuebikofakebankacc.modules.ProfileModules;

public class ProfileMapper {


    public static ProfileEntity map(ProfileModules profileModules) {
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity.setFirstName(profileEntity.getFirstName());
        profileEntity.setMiddleName(profileEntity.getMiddleName());
        profileEntity.setLastName(profileEntity.getLastName());
        profileEntity.setAddress(profileEntity.getAddress());
        profileEntity.setDateOfBirth(profileEntity.getDateOfBirth());
        profileEntity.setEmail(profileEntity.getEmail());
        profileEntity.setPhoneNumber(profileEntity.getPhoneNumber());
        profileEntity.setSsn(profileEntity.getSsn());
        profileEntity.setGender(profileEntity.getGender());
        profileEntity.setId(profileEntity.getId());

        return profileEntity;
    }
    public static ProfileModules map(ProfileEntity profileModules) {
        ProfileModules profileModule = new ProfileModules();
        profileModule.setFirstName(profileModules.getFirstName());
        profileModule.setMiddleName(profileModules.getMiddleName());
        profileModule.setLastName(profileModules.getLastName());
        profileModule.setAddress(profileModules.getAddress());
        profileModule.setDateOfBirth(profileModules.getDateOfBirth());
        profileModule.setEmail(profileModules.getEmail());
        profileModule.setPhoneNumber(profileModules.getPhoneNumber());
        profileModule.setSsn(profileModules.getSsn());
        profileModule.setGender(profileModules.getGender());
        profileModule.setId(profileModules.getId());

        return profileModule;


    }

}
