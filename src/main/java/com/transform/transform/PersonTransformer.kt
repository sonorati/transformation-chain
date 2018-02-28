package com.transform.transform

import com.transform.input.InputPerson
import com.transform.output.OutputPerson

class PersonTransformer : AbstractTransformer() {

    override fun transform(inputPerson: InputPerson, outputPerson: OutputPerson) {
        outputPerson.name = inputPerson.lastName

        next?.transform(inputPerson, outputPerson)
    }

}
