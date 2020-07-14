package by.epam.criteria.service.validation;

import by.epam.criteria.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		for(Map.Entry<String, Object> param: criteria.getCriteria().entrySet()) {
			if(param.getValue() == null) {
				return false;
			}
		}
		
		return true;
	}

}