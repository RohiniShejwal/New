package com.BikkadIT.IRCTC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.IRCTC.model.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer>{

}
