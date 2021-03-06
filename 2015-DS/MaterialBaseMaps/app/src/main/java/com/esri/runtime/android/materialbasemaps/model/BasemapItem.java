/* Copyright 2015 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * A copy of the license is available in the repository's
 * https://github.com/Esri/arcgis-runtime-demos-android/blob/master/license.txt
 *
 * For information about licensing your deployed app, see
 * https://developers.arcgis.com/android/guide/license-your-app.htm
 *
 */

package com.esri.runtime.android.materialbasemaps.model;


import android.app.Application;
import android.graphics.Bitmap;

import com.esri.core.portal.PortalItem;

public class BasemapItem {

    private PortalItem item;
    private Bitmap image;

    public BasemapItem(PortalItem item, Bitmap image){
        this.item = item;
        this.image = image;
    }

    public PortalItem getItem(){ return item; }

    public Bitmap getImage(){ return image; }

}
