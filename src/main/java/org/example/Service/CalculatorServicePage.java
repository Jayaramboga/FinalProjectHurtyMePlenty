package org.example.Service;

import org.example.Model.Calculator;

import java.io.IOException;

public class CalculatorServicePage {
    private final String INSTANCE_FIELD  ="testdata.value.NumberOfInstancesField";
    Calculator calculator;
    public Calculator getCalculatorData() throws IOException {

        System.out.println(TestReader.getTestData(INSTANCE_FIELD));
        calculator= new Calculator(TestReader.getTestData(INSTANCE_FIELD));
        // calculator.setInstancesField( PropertyReader.readProperty(INSTANCE_FIELD));
        return calculator;

    }
}
