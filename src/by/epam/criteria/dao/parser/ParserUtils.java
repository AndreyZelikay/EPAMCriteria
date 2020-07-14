package by.epam.criteria.dao.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserUtils {

    private static final String FIND_PARAM_VALUE_REGEX = "(?<=%s=).*?(?=($|,))";

    public static String getParameterValueAsString(String parameterName, String input) {
        Pattern pattern = Pattern.compile(String.format(FIND_PARAM_VALUE_REGEX, parameterName));
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()) {
            return input.substring(matcher.start(), matcher.end());
        }

        return null;
    }
}
