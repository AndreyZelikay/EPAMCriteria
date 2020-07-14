package by.epam.criteria.dao.parser;

import by.epam.criteria.dao.parser.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ParserProvider {

    private final Map<ParserName, Parser> parsers = new HashMap<>();

    public ParserProvider() {
        parsers.put(ParserName.Laptop, new LaptopParserImpl());
        parsers.put(ParserName.Oven, new OvenParserImpl());
        parsers.put(ParserName.Refrigerator, new RefrigeratorParserImpl());
        parsers.put(ParserName.Speakers, new SpeakersParserImpl());
        parsers.put(ParserName.TabletPC, new TabletPCParserImpl());
        parsers.put(ParserName.VacuumCleaner, new VacuumCleanerParserImpl());
    }

    public Parser takeParser(String parserName) {
        return parsers.get(ParserName.valueOf(parserName));
    }
}
