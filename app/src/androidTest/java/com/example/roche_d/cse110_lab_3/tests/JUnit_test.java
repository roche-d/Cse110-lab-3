package com.example.roche_d.cse110_lab_3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.roche_d.cse110_lab_3.MainActivity;
import com.example.roche_d.cse110_lab_3.R;

/**
 * Created by roche_d on 14/04/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>
{
    MainActivity mainActivity;

    public JUnit_test ()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);

        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
