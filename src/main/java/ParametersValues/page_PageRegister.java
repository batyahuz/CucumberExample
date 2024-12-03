package ParametersValues;

import stepdefinitions.StepDefinitions;

import static utils.Helper.registerPage;

public class page_PageRegister {

    static {
        registerPage("עמוד ציות משהוא---", StepDefinitions.class);
        registerPage("פניית לקוח", StepDefinitions.class);
        registerPage("לקוח", StepDefinitions.class);
    }
}
