package com.transform.transform

import com.transform.input.InputPerson
import com.transform.output.OutputPerson

abstract class AbstractTransformer : Transformer {

    private var next: Transformer? = null

    override fun setNextChain(transformer: Transformer) {
        next = transformer
    }

    override fun transform(inputPerson: InputPerson, outputPerson: OutputPerson) {
        if (next != null) {
            next?.transform(inputPerson, outputPerson)
        }
    }
}
