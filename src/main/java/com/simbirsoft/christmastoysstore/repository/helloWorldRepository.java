package com.simbirsoft.christmastoysstore.repository;

import com.simbirsoft.christmastoysstore.model.SimpleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface helloWorldRepository extends JpaRepository<SimpleUser, Long> {

}
