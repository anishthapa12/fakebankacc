package com.kuebiko.kuebikofakebankacc.repo;

import com.kuebiko.kuebikofakebankacc.entity.ProfileEntity;
import com.kuebiko.kuebikofakebankacc.modules.ProfileModules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<ProfileEntity, Long> {


}
