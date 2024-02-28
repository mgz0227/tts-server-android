package com.github.mgz0227.tts_server_android.service.forwarder.system

import kotlinx.serialization.Serializable

@Serializable
data class VoiceInfo(
    val name: String,
    val locale: String,
    val localeName: String,
    val features: List<String>? = null
)