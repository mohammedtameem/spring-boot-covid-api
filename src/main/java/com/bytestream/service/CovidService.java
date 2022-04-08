package com.bytestream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bytestream.dao.CovidDao;
import com.bytestream.entity.CovidData;

@Service
public class CovidService 
{
	
	@Autowired
	private CovidDao dao;
	
	
	public List<CovidData> getCovidData()
	{ 
	  return dao.findAll();  
	}
	
	public CovidData getCovidDataByCity(String name)
	{
		List<CovidData> list =dao.findAll();
		CovidData data = null;
		for(CovidData record: list)
		{
			if(record.getCity().equalsIgnoreCase(name))
			{
				data = record;
				break;
			}
		}
		return data;
	}

	public void addCovidRecord(CovidData data) {
		
	     dao.save(data);
		
	}
	
	public void deleteCovidRecord(long name)
	{
		dao.deleteById(name);
		
	}

	public void updateCovidRecord(CovidData data) {
		
		List<CovidData> list= dao.findAll(); 
		for(CovidData covid : list)
		{
			if(covid.getDeaths() == data.getDeaths())
			{
				covid.setCuredPatients(data.getCuredPatients());
				covid.setHospitalized(data.getHospitalized());
				dao.save(covid);
				break;
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
