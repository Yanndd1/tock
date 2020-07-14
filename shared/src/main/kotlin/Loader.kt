/*
 * Copyright (C) 2017/2020 e-voyageurs technologies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.tock.shared

import java.util.ServiceLoader

/**
 * Helper methods to deal with [ServiceLoader].
 */
object Loader {

    /**
     * Load all services of class [T].
     */
    inline fun <reified T : Any> loadServices(): List<T> =
        ServiceLoader.load(T::class.java).iterator().toSafeList()
}