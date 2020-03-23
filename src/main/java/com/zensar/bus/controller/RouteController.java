package com.zensar.bus.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.zensar.bus.dao.PickupPointDAO;
import com.zensar.bus.dao.RouteDAO;
import com.zensar.bus.model.PickupPointMODL;
import com.zensar.bus.model.RouteMODL;

@RestController
public class RouteController {

	@Autowired
	private RouteDAO routeDAO;

	@Autowired
	private PickupPointDAO pickupDAO;
	

	@RequestMapping(value = "/buspass/find_route", method = RequestMethod.POST)
	public ResponseEntity<List<RouteMODL>> findAllRoutes() {
		List<RouteMODL> routes = (List<RouteMODL>) routeDAO.findAll();
		return new ResponseEntity<List<RouteMODL>>(routes, HttpStatus.OK);

	}

	@RequestMapping(value = "/buspass/{routeId}/pickUpPoints")
	public ResponseEntity<List<PickupPointMODL>> getPickUpPointByRoute(@PathVariable Integer routeId){
		
		List<PickupPointMODL> pickUpPoints =  pickupDAO.findByrouteId(routeId);
		
		return new ResponseEntity<List<PickupPointMODL>>(pickUpPoints, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/buspass/pickUpPoints", method = RequestMethod.POST)
	public ResponseEntity<List<PickupPointMODL>> findAllPickUpPoints() {
		List<PickupPointMODL> pickUpPoints = (List<PickupPointMODL>) pickupDAO.findAll();

		return new ResponseEntity<List<PickupPointMODL>>(pickUpPoints, HttpStatus.OK);

	}
}
