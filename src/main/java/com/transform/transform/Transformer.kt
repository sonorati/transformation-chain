package com.transform.transform

import com.transform.input.InputPerson
import com.transform.output.OutputPerson

interface Transformer {
    fun setNextChain(transformer: Transformer)
    fun transform(input: InputPerson, output: OutputPerson)
}
