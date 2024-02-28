package com.github.mgz0227.tts_server_android.model.rhino

import com.github.mgz0227.tts_server_android.utils.rootCause
import com.script.ScriptException

object ExceptionExt {
    fun ScriptException.lineMessage(): String {
        return "第 $lineNumber 行错误：${rootCause?.message ?: this}"
    }
}