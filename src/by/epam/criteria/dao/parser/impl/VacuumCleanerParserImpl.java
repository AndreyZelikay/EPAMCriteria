package by.epam.criteria.dao.parser.impl;

import by.epam.criteria.dao.parser.Parser;
import by.epam.criteria.entity.Appliance;
import static by.epam.criteria.entity.AppliancesParams.VacuumCleaner.*;
import by.epam.criteria.entity.VacuumCleaner;

import static by.epam.criteria.dao.parser.ParserUtils.getParameterValueAsString;

public class VacuumCleanerParserImpl implements Parser {
    @Override
    public Appliance parse(String input) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        vacuumCleaner.setBagType(
                getParameterValueAsString(BAG_TYPE.toString(), input));
        vacuumCleaner.setCleaningWidth(Integer.parseInt(
                getParameterValueAsString(CLEANING_WIDTH.toString(), input)));
        vacuumCleaner.setFilterType(
                getParameterValueAsString(FILTER_TYPE.toString(), input));
        vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(
                getParameterValueAsString(MOTOR_SPEED_REGULATION.toString(), input)));
        vacuumCleaner.setPowerConsumption(Integer.parseInt(
                getParameterValueAsString(POWER_CONSUMPTION.toString(), input)));
        vacuumCleaner.setWandType(
                getParameterValueAsString(WAND_TYPE.toString(), input));

        return vacuumCleaner;
    }
}
