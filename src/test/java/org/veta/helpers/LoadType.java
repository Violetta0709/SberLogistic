package org.veta.helpers;

public enum LoadType {
    BACK("Задняя загрузка"),
    UP("Верхняя загрузка"),
    SIDE("Боковая загрузка");

    private final String description;

    LoadType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
