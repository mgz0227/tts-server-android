package com.github.mgz0227.tts_server_android.service.systts.help.exception

import com.github.mgz0227.tts_server_android.data.entities.replace.ReplaceRule

data class TextReplacerException(
    val replaceRule: ReplaceRule? = null,
    override val cause: Throwable?,
    override val message: String? = null,
) :
    TtsManagerException() {
}