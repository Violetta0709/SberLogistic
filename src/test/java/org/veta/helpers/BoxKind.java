package org.veta.helpers;

public enum BoxKind {
    BOX("Короб"),
    PALLET("Палета");

    private final String description;

    BoxKind(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
