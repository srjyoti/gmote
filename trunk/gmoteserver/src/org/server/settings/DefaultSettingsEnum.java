/**
 * Copyright 2009 Marc Stogaitis and Mimi Sun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gmote.server.settings;

public enum DefaultSettingsEnum {
  // Note: When you add a setting here, make sure to add it to the DefaultSettings.createDefaultFile()
  // Note: PORT is deprecated. Use PreferredPorts. 
  PORT, PLAYER, LOG_VLC, VOLUME, MONITOR_X, MONITOR_Y, SHOW_ALL_FILES, UDP_PORT, SHUFFLE_SONGS;
}
