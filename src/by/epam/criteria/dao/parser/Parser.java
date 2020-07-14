package by.epam.criteria.dao.parser;

import by.epam.criteria.entity.Appliance;

public interface Parser {
    Appliance parse(String input);
}
