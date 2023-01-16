package org.veta.helpers;

import jdk.nashorn.internal.ir.VarNode;

public enum TransportType {
    ISOTERM("Изотермический кузов"),
    REFRIGERATOR("Рефрижератор"),
    VAN("Фургон (будка)");

    private final String description;

    TransportType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
