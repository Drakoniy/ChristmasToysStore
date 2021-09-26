package com.simbirsoft.christmastoysstore.repositoty;

import com.simbirsoft.christmastoysstore.entity.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface helloWorldRepository extends JpaRepository<testEntity, Long> {

}
