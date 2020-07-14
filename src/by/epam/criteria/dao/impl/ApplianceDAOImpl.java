package by.epam.criteria.dao.impl;

import by.epam.criteria.dao.ApplianceDAO;
import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.criteria.Criteria;
import by.epam.criteria.dao.parser.ParserProvider;
import by.epam.criteria.service.search_service.SearchService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {

	private FileInputStream inputStream;

	public ApplianceDAOImpl() {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(new File("src\\resources\\db.config")));

			inputStream = new FileInputStream(new File(props.getProperty("filename")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

		List<Appliance> resultList = new LinkedList<>();

		String line;
		ParserProvider parserProvider = new ParserProvider();
		while((line = reader.readLine()) != null) {
			if(SearchService.isStringMatchesCriteria(line, criteria)) {
				resultList.add(parserProvider
						.takeParser(criteria.getGroupSearchName())
						.parse(line));
			}
		}

		inputStream.getChannel().position(0);

		return resultList;
	}
}