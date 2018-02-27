package com.transform.output;

public class OutputPerson {

    private String name;
    private  OutputAddress outputAddress;

    public OutputAddress getOutputAddress() {
        return outputAddress;
    }

    public void setOutputAddress(OutputAddress outputAddress) {
        this.outputAddress = outputAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
