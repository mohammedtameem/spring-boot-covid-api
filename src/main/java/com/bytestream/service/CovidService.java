package com.bytestream.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bytestream.entity.CovidData;

@Service
public class CovidService 
{
	static List<CovidData> list = new ArrayList();
	static
	{
		 CovidData data = new CovidData(100, 50, "Newyork", 200);
	     CovidData data1 = new CovidData(200, 150, "London", 300);
	     CovidData data2 = new CovidData(300, 550, "Rome", 500);
	     CovidData data3 = new CovidData(400, 750, "Geneva", 150);
	   
	     list.add(data);
	     list.add(data1);
	     list.add(data2);
	     list.add(data3);
	}
	
	public List<CovidData> getCovidData()
	{
	     return list;
	}
	
	public CovidData getCovidDataByCity(@PathVariable("name") String name)
	{
		CovidData result = null;
	    for(CovidData data: list)
	    {
	    	if(data.getCity().equalsIgnoreCase(name))
	    	{
	    		result = data;
	    		break;
	    	}
	    }
	    return result;
	}

	public void addCovidRecord(CovidData data) {
		
		list.add(data);
		
	}
	
	public void deleteCovidRecord(String name)
	{
		CovidData result = null;
	    for(CovidData data: list)
	    {
	    	if(data.getCity().equalsIgnoreCase(name))
	    	{
	    		result = data;
	    		list.remove(result);
	    		break;
	    	}
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
