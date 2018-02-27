package com.transform.transform;

import com.transform.input.InputPerson;
import com.transform.output.OutputPerson;

public class PersonTransformer extends AbstractTransformer {

    @Override
    public void transform(InputPerson inputPerson, OutputPerson outputPerson) {
        outputPerson.setName(inputPerson.getLastname());

        super.transform(inputPerson, outputPerson);
    }

}
