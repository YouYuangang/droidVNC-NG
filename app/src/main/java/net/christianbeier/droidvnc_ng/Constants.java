/*
 * DroidVNC-NG constants definitions.
 *
 * Author: Christian Beier <info@christianbeier.net>
 *
 * Copyright (C) 2020 Kitchen Armor.
 *
 * You can redistribute and/or modify this program under the terms of the
 * GNU General Public License version 2 as published by the Free Software
 * Foundation.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place Suite 330, Boston, MA 02111-1307, USA.
 */

package net.christianbeier.droidvnc_ng;

public class Constants {
    /*
        user settings
     */
    public static final String PREFS_KEY_SETTINGS_PORT = "settings_port";
    public static final String PREFS_KEY_SETTINGS_PASSWORD = "settings_password" ;
    public static final String PREFS_KEY_SETTINGS_START_ON_BOOT = "settings_start_on_boot" ;
    public static final String PREFS_KEY_SETTINGS_SCALING = "settings_scaling" ;
    public static final String PREFS_KEY_SETTINGS_VIEW_ONLY = "settings_view_only" ;
    public static final String PREFS_KEY_SETTINGS_ACCESS_KEY = "settings_access_key";
    public static final String PREFS_KEY_SETTINGS_FILE_TRANSFER = "settings_file_transfer";

    /*
        persisted runtime values
     */
    public static final String PREFS_KEY_REVERSE_VNC_LAST_HOST = "reverse_vnc_last_host" ;
    public static final String PREFS_KEY_REPEATER_VNC_LAST_HOST = "repeater_vnc_last_host" ;
    public static final String PREFS_KEY_REPEATER_VNC_LAST_ID = "repeater_vnc_last_id" ;
    public static final String PREFS_KEY_SERVER_LAST_PORT = "server_last_port" ;
    public static final String PREFS_KEY_SERVER_LAST_PASSWORD = "server_last_password" ;
    public static final String PREFS_KEY_SERVER_LAST_SCALING = "server_last_scaling" ;
    public static final String PREFS_KEY_SERVER_LAST_FILE_TRANSFER = "server_last_file_transfer" ;
    public static final String PREFS_KEY_SERVER_LAST_START_REQUEST_ID = "server_last_start_request_id" ;
    public static final String PREFS_KEY_INPUT_LAST_ENABLED = "input_last_enabled" ;
}
