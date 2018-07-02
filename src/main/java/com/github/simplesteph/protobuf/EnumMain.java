package com.github.simplesteph.protobuf;

import example.enumerations.EnumExample;
import example.enumerations.EnumExample.EnumMessage;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("Enum Example!");

        EnumMessage.Builder builder = EnumMessage.newBuilder();

        builder.setId(345)
                .setDayOfTheWeek(EnumExample.DayOfTheWeek.MONDAY);

        EnumMessage message = builder.build();
        System.out.println(message);
    }
}
