package com.bytestream.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytestream.entity.CovidData;

@Repository
public interface CovidDao extends JpaRepository<CovidData, Long>
{

}
