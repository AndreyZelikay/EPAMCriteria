package by.epam.criteria.dao;

import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws IOException;
}
