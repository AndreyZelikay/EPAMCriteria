package by.epam.criteria.dao.parser.impl;

import by.epam.criteria.dao.parser.Parser;
import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.TabletPC;

import static by.epam.criteria.dao.parser.ParserUtils.getParameterValueAsString;
import static by.epam.criteria.entity.AppliancesParams.TabletPC.*;

public class TabletPCParserImpl implements Parser {
    @Override
    public Appliance parse(String input) {
        TabletPC tabletPC = new TabletPC();

        tabletPC.setBatteryCapacity(Integer.parseInt(
                getParameterValueAsString(BATTERY_CAPACITY.toString(), input)));
        tabletPC.setColor(
                getParameterValueAsString(COLOR.toString(), input));
        tabletPC.setDisplayInches(Integer.parseInt(
                getParameterValueAsString(DISPLAY_INCHES.toString(), input)));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt(
                getParameterValueAsString(FLASH_MEMORY_CAPACITY.toString(), input)));
        tabletPC.setMemoryRom(Integer.parseInt(
                getParameterValueAsString(MEMORY_ROM.toString(), input)));

        return tabletPC;
    }
}
