package com.transform.output

data class OutputAddress(var street: String? = null)
data class OutputPerson(var name: String? = null, var outputAddress: OutputAddress? = null)

