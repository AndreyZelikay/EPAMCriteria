package by.epam.criteria.service;

import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria) throws IOException;
	
}
