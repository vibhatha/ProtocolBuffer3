package com.github.simplesteph.protobuf;

import example.complex.Complex;
import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex Example");

        DummyMessage oneDummy = newDummyMessage(55, "one message");


        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        builder.setOneDummy(oneDummy);

        builder.addMultipleDummy(newDummyMessage(1, "message 1"));
        builder.addMultipleDummy(newDummyMessage(2, "message 2"));
        builder.addMultipleDummy(newDummyMessage(3, "message 3"));

        ComplexMessage message = builder.build();
        System.out.println(message.toString());

    }

    public static DummyMessage newDummyMessage (Integer id, String name) {
        DummyMessage.Builder builder = DummyMessage.newBuilder();

        DummyMessage message = builder.setName(name)
                .setId(id)
                .build();

        return  message;
    }
}
