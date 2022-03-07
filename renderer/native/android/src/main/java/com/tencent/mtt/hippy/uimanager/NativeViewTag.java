/* Tencent is pleased to support the open source community by making Hippy available.
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tencent.mtt.hippy.uimanager;

import android.view.View;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

public class NativeViewTag {

    private final static String TAG_CLASS_NAME = "className";

    @NonNull
    public static Map<String, Object> createViewTag(@NonNull String className) {
        Map<String, Object> tagMap = new HashMap<>();
        tagMap.put(TAG_CLASS_NAME, className);
        return tagMap;
    }

    @NonNull
    public static String getClassName(@NonNull View view) {
        Object tagObj = view.getTag();
        if (tagObj instanceof Map) {
            Map<String, Object> tagMap = (Map) tagObj;
            Object value = tagMap.get(TAG_CLASS_NAME);
            if (value != null) {
                return value.toString();
            }
        }
        return "";
    }
}
