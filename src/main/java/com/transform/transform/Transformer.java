package com.transform.transform;

import com.transform.input.InputPerson;
import com.transform.output.OutputPerson;

public interface Transformer {
    void setNextChain(Transformer transformer);
    void transform(InputPerson input, OutputPerson output);
}
