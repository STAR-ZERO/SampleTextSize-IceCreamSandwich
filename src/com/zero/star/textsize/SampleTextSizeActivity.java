package com.zero.star.textsize;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.util.TypedValue;
import android.widget.TextView;

public class SampleTextSizeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView text1 = (TextView) findViewById(R.id.text1);
        float scale = Settings.System.getFloat(getContentResolver(), Settings.System.FONT_SCALE, 1);
        float size = text1.getTextSize() / scale;
        text1.setTextSize(TypedValue.COMPLEX_UNIT_PX, size);
    }
}