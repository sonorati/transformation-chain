package com.transform.transform

abstract class AbstractTransformer : Transformer {

    var next: Transformer? = null

    override fun setNextChain(transformer: Transformer) {
        next = transformer
    }
}
