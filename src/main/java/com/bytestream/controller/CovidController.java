package com.bytestream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytestream.entity.CovidData;
import com.bytestream.service.CovidService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class CovidController 
{
	@Autowired
	CovidService service;
	
	@GetMapping("/getCovidData")
	public List<CovidData> getCovidData()
	{
	    return service.getCovidData();
	}
	
	@GetMapping("/getCovidBycity/{name}")
	public CovidData getCovidDataByCity(@PathVariable("name") String name)
	{
	    return service.getCovidDataByCity(name);
	}
	
	@PostMapping("/addCovid")
	public void addCovidRecord(@RequestBody CovidData data)
	{
		service.addCovidRecord(data);
	}
	
	@DeleteMapping("/delete/{name}")
	public void deleteCOvidData(@PathVariable("name") String name)
	{
		service.deleteCovidRecord(name);
	}
	
	

}
