package com.example.application.trial.remindrr;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity
{
    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(R.layout.preferences);
    }
}
