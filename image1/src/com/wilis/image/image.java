package com.wilis.image;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class image extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImageButton dua = new ImageButton(this);
        dua.setImageResource(R.drawable.logo2);
        setContentView(dua);          
    }
}