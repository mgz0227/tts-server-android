package com.github.mgz0227.tts_server_android.service.systts.help.exception

import com.github.mgz0227.tts_server_android.model.speech.tts.ITextToSpeechEngine

class PlayException(
    override val text: String? = null,
    override val tts: ITextToSpeechEngine?,
    override val cause: Throwable?,
    override val message: String? = null
) :
    SynthesisException() {
}