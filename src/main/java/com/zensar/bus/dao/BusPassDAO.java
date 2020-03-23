package com.zensar.bus.dao;

import org.springframework.data.repository.CrudRepository;

import com.zensar.bus.model.BusPassMODL;

public interface BusPassDAO extends CrudRepository<BusPassMODL, Integer> {

	public BusPassMODL findBypassId(Integer passId);
}
