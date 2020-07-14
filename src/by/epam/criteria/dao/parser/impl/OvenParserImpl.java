package by.epam.criteria.dao.parser.impl;

import by.epam.criteria.dao.parser.Parser;
import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.Oven;

import static by.epam.criteria.dao.parser.ParserUtils.getParameterValueAsString;
import static by.epam.criteria.entity.AppliancesParams.Oven.*;

public class OvenParserImpl implements Parser {
    @Override
    public Appliance parse(String input) {
        Oven oven = new Oven();

        oven.setCapacity(Integer.parseInt(
                getParameterValueAsString(CAPACITY.toString(), input)));
        oven.setDepth(Integer.parseInt(
                getParameterValueAsString(DEPTH.toString(), input)));
        oven.setHeight(Double.parseDouble(
                getParameterValueAsString(HEIGHT.toString(), input)));
        oven.setPowerConsumption(Integer.parseInt(
                getParameterValueAsString(POWER_CONSUMPTION.toString(), input)));
        oven.setWeight(Integer.parseInt(
                getParameterValueAsString(WEIGHT.toString(), input)));
        oven.setWidth(Double.parseDouble(
                getParameterValueAsString(WIDTH.toString(), input)));

        return oven;
    }
}
