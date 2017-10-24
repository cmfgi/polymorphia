package de.bild.codec;

import java.lang.reflect.Field;
import java.lang.reflect.Type;


public class FieldTypePair {
    final Field field;
    final Type realType;

    public FieldTypePair(Field field, Type realType) {
        this.field = field;
        this.realType = realType;
    }

    public Field getField() {
        return field;
    }


    public Type getRealType() {
        return realType;
    }
}