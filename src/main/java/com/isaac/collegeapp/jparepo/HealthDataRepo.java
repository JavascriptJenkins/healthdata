package com.isaac.collegeapp.jparepo;

import com.isaac.collegeapp.h2model.HealthDataVO;
import com.isaac.collegeapp.h2model.TokenVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthDataRepo extends CrudRepository<HealthDataVO, Long> {

}
