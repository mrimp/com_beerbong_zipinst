/*
 * Copyright 2013 ZipInstaller Project
 *
 * This file is part of ZipInstaller.
 *
 * ZipInstaller is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ZipInstaller is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ZipInstaller.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.beerbong.zipinst.util;

import java.util.HashMap;
import java.util.Map;

public class CloudEntry {

    private String mFileName;
    private String mPath;
    private Map<String, String> mExtras = new HashMap<String, String>();

    public CloudEntry(String fileName, String path) {
        mFileName = fileName;
        mPath = path;
    }

    public String getFileName() {
        return mFileName;
    }

    public String getPath() {
        return mPath;
    }

    public void putExtra(String id, String value) {
        mExtras.put(id, value);
    }

    public String getExtra(String id) {
        return mExtras.get(id);
    }

    public Map<String, String> getExtras() {
        return mExtras;
    }
}
