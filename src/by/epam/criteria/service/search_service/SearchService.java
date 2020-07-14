package by.epam.criteria.service.search_service;

import by.epam.criteria.entity.criteria.Criteria;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchService {

    private static final String GROUP_NAME_REGEX = "^%s ";
    private static final String PARAM_REGEX = " %s=%s(,|$)";

    public static boolean isStringMatchesCriteria(String input, Criteria criteria) {
        Pattern pattern = Pattern.compile(String.format(GROUP_NAME_REGEX, criteria.getGroupSearchName()));
        Matcher matcher = pattern.matcher(input);

        if(!matcher.find()) {
            return false;
        }

        for(Map.Entry<String, Object> param: criteria.getCriteria().entrySet()) {
            pattern = Pattern.compile(String.format(PARAM_REGEX, param.getKey(), param.getValue().toString()));
            matcher = pattern.matcher(input);

            if(!matcher.find()) {
                return false;
            }
        }

        return true;
    }
}
