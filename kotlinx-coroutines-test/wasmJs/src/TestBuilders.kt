/*
 * Copyright 2016-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.test
import kotlinx.coroutines.*
import kotlin.js.*

@Suppress("ACTUAL_WITHOUT_EXPECT", "ACTUAL_TYPE_ALIAS_TO_CLASS_WITH_DECLARATION_SITE_VARIANCE")
public actual typealias TestResult = Promise<JsAny?>

internal actual fun systemPropertyImpl(name: String): String? = null

internal actual fun createTestResult(testProcedure: suspend CoroutineScope.() -> Unit): TestResult =
    GlobalScope.promise {
        testProcedure()
    }

internal actual fun dumpCoroutines() { }