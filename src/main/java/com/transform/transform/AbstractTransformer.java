package com.transform.transform;

import com.transform.input.InputPerson;
import com.transform.output.OutputPerson;

public abstract class AbstractTransformer implements Transformer{

    Transformer next;

    @Override
    public void setNextChain(Transformer transformer) {
        next = transformer;
    }

    @Override
    public void transform(InputPerson inputPerson, OutputPerson outputPerson) {
        if (next != null) {
            next.transform(inputPerson, outputPerson);
        }
    }
}
