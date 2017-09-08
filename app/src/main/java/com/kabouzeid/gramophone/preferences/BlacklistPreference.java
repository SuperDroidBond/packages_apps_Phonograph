package com.kabouzeid.gramophone.preferences;

import android.content.Context;
import android.util.AttributeSet;

import android.preference.DialogPreference;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class BlacklistPreference extends DialogPreference {
    public BlacklistPreference(Context context) {
        super(context);
    }

    public BlacklistPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BlacklistPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BlacklistPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
