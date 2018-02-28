package com.transform.input

data class InputAddress (var street: String? = null)
data class InputPerson (var lastName: String? = null, var inputAddress: InputAddress? = null)
