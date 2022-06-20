package com.kuebiko.kuebikofakebankacc.doa;

import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import com.kuebiko.kuebikofakebankacc.repo.ProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileDao implements ProfileDaoIf {

    @Autowired
    ProfileRepo profileRepo;

    @Override
    public ProfileEntity save(ProfileEntity profileEntity) {
       ProfileEntity saveData = profileRepo.save(profileEntity);

        return saveData;

    }

    @Override
    public ProfileEntity getBySsn(String ssn) {

        return profileRepo.findByssn(ssn);


    }
}
