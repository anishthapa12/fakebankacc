package com.kuebiko.kuebikofakebankacc.mappers;

import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import com.kuebiko.kuebikofakebankacc.models.ProfileModel;

public class ProfileMapper {


    public static ProfileEntity map(ProfileModel pm) {
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity.setFirstName(pm.getFirstName());
        profileEntity.setMiddleName(pm.getMiddleName());
        profileEntity.setLastName(pm.getLastName());
        profileEntity.setAddress(pm.getAddress());
        profileEntity.setDateOfBirth(pm.getDateOfBirth());
        profileEntity.setEmail(pm.getEmail());
        profileEntity.setPhoneNumber(pm.getPhoneNumber());
        profileEntity.setSsn(pm.getSsn());
        profileEntity.setGender(pm.getGender());
        profileEntity.setId(pm.getId());

        return profileEntity;
    }
    public static ProfileModel map(ProfileEntity pe) {
        ProfileModel profileModule = new ProfileModel();
        profileModule.setFirstName(pe.getFirstName());
        profileModule.setMiddleName(pe.getMiddleName());
        profileModule.setLastName(pe.getLastName());
        profileModule.setAddress(pe.getAddress());
        profileModule.setDateOfBirth(pe.getDateOfBirth());
        profileModule.setEmail(pe.getEmail());
        profileModule.setPhoneNumber(pe.getPhoneNumber());
        profileModule.setSsn(pe.getSsn());
        profileModule.setGender(pe.getGender());
        profileModule.setId(pe.getId());

        return profileModule;


    }

}
