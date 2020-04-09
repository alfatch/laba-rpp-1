package com.amin.lw_01_1;

import android.app.Application;
import android.graphics.Color;
import android.util.Log;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class App extends Application
{
    private static final String LogTag = "amin_log";
    public static final int ListCount = 1000000;
    public static final int SplashDeleyMilis = 2000;
    public static final int[] Colors = new int[2];

    public static final RuleBasedNumberFormat RuleNumberFormat = new RuleBasedNumberFormat(
            new Locale("ru", "Ru"), RuleBasedNumberFormat.SPELLOUT);

    public App()
    {
        Colors[0] = Color.parseColor("#FFFFFFFF");
        Colors[1] = Color.parseColor("#CCCCCCCC");
    }

    public static void Log(String msg) { Log.d(LogTag, msg); }

    public static void Error(String msg)
    {
        Log.e(LogTag, msg);
    }
}
