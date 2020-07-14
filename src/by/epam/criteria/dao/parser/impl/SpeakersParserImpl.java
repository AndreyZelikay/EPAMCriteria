package by.epam.criteria.dao.parser.impl;

import by.epam.criteria.dao.parser.Parser;
import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.Speakers;

import static by.epam.criteria.dao.parser.ParserUtils.getParameterValueAsString;
import static by.epam.criteria.entity.AppliancesParams.Speakers.*;

public class SpeakersParserImpl implements Parser {
    @Override
    public Appliance parse(String input) {
        Speakers speakers = new Speakers();

        speakers.setCordLength(Integer.parseInt(
                getParameterValueAsString(CORD_LENGTH.toString(), input)));
        speakers.setFrequencyRange(
                getParameterValueAsString(FREQUENCY_RANGE.toString(), input));
        speakers.setNumberOfSpeakers(Integer.parseInt(
                getParameterValueAsString(NUMBER_OF_SPEAKERS.toString(), input)));
        speakers.setPowerConsumption(Integer.parseInt(
                getParameterValueAsString(POWER_CONSUMPTION.toString(), input)));

        return speakers;
    }
}
