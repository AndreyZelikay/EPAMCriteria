package by.epam.criteria.service.impl;

import by.epam.criteria.dao.ApplianceDAO;
import by.epam.criteria.dao.DAOFactory;
import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.criteria.Criteria;
import by.epam.criteria.service.ApplianceService;
import by.epam.criteria.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		return applianceDAO.find(criteria);
	}

}
