package com.example.moon.unittest;

import android.util.Log;

import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    public static final String TAG = "MyTag";
    ConverterUtil converterUtil;

    @Before
    public void setUp() throws Exception {
        System.out.println("Started");
        converterUtil = new ConverterUtil();
        //Log.i(TAG, "setUp: "+"START");
    }

    @Test
    public void TestcTof(){
        float[] args = {180.0f,100.0f,40.0f,37.0f};
        float[] exps = {356.0f,212.0f,104.0f,98.6f};
        for (int i=0;i<4;i++) {
            float f = converterUtil.cToF(args[i]);
            assertEquals("Result is okey",exps[i],f,.001);
        }

    }

    @Test
    public void TestfToc(){
        float c = converterUtil.fToC(356.0f);
        float expected_c = 180.0f;
        assertEquals("Result is okey",expected_c,c,0.001);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("END");
        converterUtil = null;
    }
}