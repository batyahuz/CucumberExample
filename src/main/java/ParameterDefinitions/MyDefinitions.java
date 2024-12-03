package ParameterDefinitions;

import io.cucumber.java.ParameterType;

public class MyDefinitions {
    @ParameterType("\"[^\"]*\"")
    public String name(String string) {
        return string.substring(1, string.length() - 1);
    }

    @ParameterType("\"[^\"]*\"")  public String page(String string) {
        return string.substring(1, string.length() - 1);
    }
}
