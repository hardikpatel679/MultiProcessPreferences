package com.treefrogapps.multiprocesspreferences.multi_preferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Preference Interactor class
 *
 * - Accesses Shared Preferences and returns a (Matrix) Cursor Object
 */
public class PreferenceInteractor {

    private Context mContext;
    private String mPreferenceName;
    private SharedPreferences mSharedPreferences;

    public PreferenceInteractor(Context context, String preferenceName){

        this.mContext = context;
        this.mPreferenceName = preferenceName;

        this.mSharedPreferences
                = mContext.getSharedPreferences(mPreferenceName, Context.MODE_PRIVATE);
    }




    public String getString(String key, String defaultVal){
     return mSharedPreferences.getString(key, defaultVal);
    }

    public void setString(String key, String value){
        mSharedPreferences.edit().putString(key, value).apply();
    }

    public int getInt(String key, int defaultVal){
        return mSharedPreferences.getInt(key, defaultVal);

    }

    public void setInt(String key, int value){
        mSharedPreferences.edit().putInt(key, value).apply();
    }

    public long getLong(String key, long defaultVal){
        return mSharedPreferences.getLong(key, defaultVal);

    }

    public void setLong(String key, long value){
        mSharedPreferences.edit().putLong(key, value).apply();
    }

    public boolean getBoolean(String key, boolean defaultVal){
        return mSharedPreferences.getBoolean(key, defaultVal);
    }

    public void setBoolean(String key, boolean value){
        mSharedPreferences.edit().putBoolean(key, value).apply();
    }


    public void removePref(String key) {
        mSharedPreferences.edit().remove(key).apply();
    }

    public void clearPreference() {
        mSharedPreferences.edit().clear().apply();
    }
}
