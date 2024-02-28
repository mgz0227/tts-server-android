package com.github.mgz0227.tts_server_android.service.systts.help.exception

import com.github.mgz0227.tts_server_android.model.speech.tts.ITextToSpeechEngine

class ConfigLoadException(
    override val message: String? = null,
    override val cause: Throwable? = null
) : TtsManagerException() {
}