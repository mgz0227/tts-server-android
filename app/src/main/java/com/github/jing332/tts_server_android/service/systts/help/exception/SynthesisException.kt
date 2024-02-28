package com.github.mgz0227.tts_server_android.service.systts.help.exception

import com.github.mgz0227.tts_server_android.model.speech.tts.ITextToSpeechEngine

open class SynthesisException(
    open val tts: ITextToSpeechEngine? = null,
    open val text: String? = null,
    override val message: String? = null,
    override val cause: Throwable? = null
) : TtsManagerException() {
}