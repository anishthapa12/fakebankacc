package com.kuebiko.kuebikofakebankacc.doa;

import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;

public interface ProfileDaoIf {

    public ProfileEntity save(ProfileEntity profileEntity);


    ProfileEntity getBySsn(String ssn);
}
