package com.transform;

import com.transform.input.InputAddress;
import com.transform.input.InputPerson;
import com.transform.output.OutputPerson;
import com.transform.transform.AddressTransformer;
import com.transform.transform.PersonTransformer;
import com.transform.transform.Transformer;

public class Orchestrator {

    private static void transform() {
        InputAddress inputAddress = new InputAddress();
        inputAddress.setStreet("greenfield");

        InputPerson inputPerson = new InputPerson();
        inputPerson.setLastname("joe");
        inputPerson.setInputAddress(inputAddress);


        OutputPerson outputPerson = new OutputPerson();

        Transformer pt = new PersonTransformer();
        Transformer at = new AddressTransformer();

        pt.setNextChain(at);

        pt.transform(inputPerson, outputPerson);

        System.out.println("outputPerson =  name and address " + outputPerson.getName() + ", " + outputPerson.getOutputAddress().getStreet());
    }

    public static void main(String[] args) {
        transform();
    }
}
