/*
 * Copyright (C) 2012 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * This file is part of NTPSync.
 * 
 * NTPSync is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NTPSync is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NTPSync.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.ntpsync.util;

import org.ntpsync.R;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {
    public static boolean getSetOnBoot(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.PREFS_NAME,
                Context.MODE_PRIVATE);
        return prefs.getBoolean(context.getString(R.string.pref_set_on_boot_key),
                Boolean.parseBoolean(context.getString(R.string.pref_set_on_boot_def)));
    }

    public static String getNtpServer(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.PREFS_NAME,
                Context.MODE_PRIVATE);
        return prefs.getString(context.getString(R.string.pref_ntp_server_key),
                context.getString(R.string.pref_ntp_server_def));
    }

    public static boolean getSyncDaily(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.PREFS_NAME,
                Context.MODE_PRIVATE);
        return prefs.getBoolean(context.getString(R.string.pref_sync_daily_key),
                Boolean.parseBoolean(context.getString(R.string.pref_sync_daily_def)));
    }

    public static boolean getSyncOnlyOnWifi(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.PREFS_NAME,
                Context.MODE_PRIVATE);
        return prefs.getBoolean(context.getString(R.string.pref_sync_only_on_wifi_key),
                Boolean.parseBoolean(context.getString(R.string.pref_sync_only_on_wifi_def)));
    }

    public static boolean getShowSyncToast(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(Constants.PREFS_NAME,
                Context.MODE_PRIVATE);
        return prefs.getBoolean(context.getString(R.string.pref_show_sync_toast_key),
                Boolean.parseBoolean(context.getString(R.string.pref_show_sync_toast_def)));
    }

}