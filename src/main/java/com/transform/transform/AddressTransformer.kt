package com.transform.transform

import com.transform.input.InputPerson
import com.transform.output.OutputAddress
import com.transform.output.OutputPerson

class AddressTransformer : AbstractTransformer() {

    override fun transform(inputPerson: InputPerson, outputPerson: OutputPerson) {
        outputPerson.outputAddress = OutputAddress(
                street = inputPerson.inputAddress?.street
        )
        super.transform(inputPerson, outputPerson)
    }
}
