package com.android.project.app.converters;

public interface Converter <S, T> {

    T convert(S input);
}
