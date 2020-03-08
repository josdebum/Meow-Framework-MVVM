package meow.utils

import android.os.Build

/*
 * Copyright (C) 2020 Hamidreza Etebarian & Ali Modares.
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

/**
 * The Extensions of OS & Build.
 *
 * @author  Hamidreza Etebarian
 * @version 1.0.0
 * @since   2020-03-06
 */

fun getDeviceModel(): String {
    val manufacturer = Build.MANUFACTURER
    val model = Build.MODEL ?: return manufacturer ?: "Unknown Device"
    return if (model.startsWith(manufacturer)) {
        model.capitalizeFirst()
    } else {
        manufacturer.capitalizeFirst() + " " + model
    }
}
 