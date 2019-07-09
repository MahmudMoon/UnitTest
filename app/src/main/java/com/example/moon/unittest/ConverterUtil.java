package com.example.moon.unittest;

public class ConverterUtil {
    public float cToF(float celcious){
        return ((9.0f/5.0f)*celcious)+32.0f;
    }

    public float fToC(float farenhite){
        return (5.0f/9.0f)*(farenhite-32.0f);
    }
}
