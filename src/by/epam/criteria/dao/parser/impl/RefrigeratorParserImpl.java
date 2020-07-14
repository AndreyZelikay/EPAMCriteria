package by.epam.criteria.dao.parser.impl;

import by.epam.criteria.dao.parser.Parser;
import by.epam.criteria.entity.Appliance;

import static by.epam.criteria.dao.parser.ParserUtils.getParameterValueAsString;
import static by.epam.criteria.entity.AppliancesParams.Refrigerator.*;
import by.epam.criteria.entity.Refrigerator;

public class RefrigeratorParserImpl implements Parser {
    @Override
    public Appliance parse(String input) {
        Refrigerator refrigerator = new Refrigerator();

        refrigerator.setFreezerCapacity(Integer.parseInt(
                getParameterValueAsString(FREEZER_CAPACITY.toString(), input)));
        refrigerator.setHeight(Double.parseDouble(
                getParameterValueAsString(HEIGHT.toString(), input)));
        refrigerator.setOverallCapacity(Double.parseDouble(
                getParameterValueAsString(OVERALL_CAPACITY.toString(), input)));
        refrigerator.setPowerConsumption(Integer.parseInt(
                getParameterValueAsString(POWER_CONSUMPTION.toString(), input)));
        refrigerator.setWeight(Integer.parseInt(
                getParameterValueAsString(WEIGHT.toString(), input)));
        refrigerator.setWidth(Double.parseDouble(
                getParameterValueAsString(WIDTH.toString(),input)));

        return refrigerator;
    }
}
