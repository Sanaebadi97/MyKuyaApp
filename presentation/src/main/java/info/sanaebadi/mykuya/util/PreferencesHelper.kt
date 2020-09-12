package info.sanaebadi.mykuya.util

import android.content.Context

class PreferencesHelper(private val context: Context) {

    fun saveInt(key: String, value: Int) {
        val preferences =
            context.getSharedPreferences(Constants.PLACE_APP_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun loadInt(key: String): Int? {
        val preferences =
            context.getSharedPreferences(Constants.PLACE_APP_SHARED_PREF, Context.MODE_PRIVATE)
        return preferences.getInt(key, 0)
    }

    fun saveString(key: String, value: String) {
        val preferences =
            context.getSharedPreferences(Constants.PLACE_APP_SHARED_PREF, Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun loadString(key: String): String? {
        val preferences =
            context.getSharedPreferences(Constants.PLACE_APP_SHARED_PREF, Context.MODE_PRIVATE)
        return preferences.getString(key, null)
    }
}