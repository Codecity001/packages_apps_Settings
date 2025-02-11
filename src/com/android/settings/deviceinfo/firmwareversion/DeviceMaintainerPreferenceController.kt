/*
 * Copyright (C) 2021-2022 AOSP-Krypton Project
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

package com.android.settings.deviceinfo.firmwareversion

import android.content.Context

import com.android.settings.R
import com.android.settings.core.BasePreferenceController

class DeviceMaintainerPreferenceController(
    context: Context,
    preferenceKey: String?
) : BasePreferenceController(context, preferenceKey) {

    override fun getAvailabilityStatus(): Int =
        if (getSummary().isNotBlank())
            AVAILABLE
        else
            UNSUPPORTED_ON_DEVICE

    override fun getSummary(): CharSequence =
        mContext.getString(R.string.device_maintainer_name)
}