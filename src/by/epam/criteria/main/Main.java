package by.epam.criteria.main;

import static by.epam.criteria.entity.AppliancesParams.*;

import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.criteria.Criteria;
import by.epam.criteria.service.ApplianceService;
import by.epam.criteria.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 32);

		appliances = service.find(criteriaOven);

		appliances.forEach(PrintApplianceInfo::print);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		appliances = service.find(criteriaOven);

		appliances.forEach(PrintApplianceInfo::print);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliances = service.find(criteriaTabletPC);// find(Object...obj)

		appliances.forEach(PrintApplianceInfo::print);
	}

}
