package com.kuebiko.kuebikofakebankacc.repo;

import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<ProfileEntity, Long> {

    @Query(value = "select pe.* from profile_entity pe where pe.ssn = ?1", nativeQuery = true)
    public ProfileEntity findByssn(String ssn);


}
