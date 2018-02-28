package com.transform

import com.transform.input.InputAddress
import com.transform.input.InputPerson
import com.transform.output.OutputPerson
import com.transform.transform.AddressTransformer
import com.transform.transform.PersonTransformer
import com.transform.transform.Transformer

object Orchestrator {

    private fun transform() {

        val inputPerson = InputPerson(
                lastName = "joe",
                inputAddress = InputAddress(street = "greenfield")
        )
        val personTransformer = PersonTransformer()
        personTransformer.setNextChain(AddressTransformer())

        val outputPerson = OutputPerson()
        personTransformer.transform(inputPerson, outputPerson)

        println(outputPerson)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        transform()
    }
}
