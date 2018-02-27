package com.transform.transform;

import com.transform.input.InputPerson;
import com.transform.output.OutputAddress;
import com.transform.output.OutputPerson;

public class AddressTransformer extends AbstractTransformer {

    @Override
    public void transform(InputPerson inputPerson, OutputPerson outputPerson) {
        actualTransformation(inputPerson, outputPerson);

        super.transform(inputPerson, outputPerson);
    }

    private void actualTransformation(InputPerson inputPerson, OutputPerson outputPerson) {
        OutputAddress outputAddress = new OutputAddress();
        outputAddress.setStreet(inputPerson.getInputAddress().getStreet());
        outputPerson.setOutputAddress(outputAddress);
    }

}
