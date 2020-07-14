package by.epam.criteria.dao.parser.impl;

import by.epam.criteria.entity.Appliance;
import by.epam.criteria.entity.Laptop;
import by.epam.criteria.dao.parser.Parser;
import static by.epam.criteria.dao.parser.ParserUtils.getParameterValueAsString;
import static by.epam.criteria.entity.AppliancesParams.Laptop.*;

public class LaptopParserImpl implements Parser {
    @Override
    public Appliance parse(String input) {
        Laptop laptop = new Laptop();

        laptop.setBatteryCapacity(Double.parseDouble(
                getParameterValueAsString(BATTERY_CAPACITY.toString(), input)));
        laptop.setCPU(Double.parseDouble(
                getParameterValueAsString(CPU.toString(), input)));
        laptop.setDisplayInches(Integer.parseInt(
                getParameterValueAsString(DISPLAY_INCHS.toString(), input)));
        laptop.setMemoryRom(Integer.parseInt(
                getParameterValueAsString(MEMORY_ROM.toString(), input)));
        laptop.setOS(
                getParameterValueAsString(OS.toString(), input));
        laptop.setSystemMemory(Integer.parseInt(
                getParameterValueAsString(SYSTEM_MEMORY.toString(), input)));

        return laptop;
    }
}
