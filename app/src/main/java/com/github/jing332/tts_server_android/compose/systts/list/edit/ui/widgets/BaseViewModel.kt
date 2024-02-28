package com.github.mgz0227.tts_server_android.compose.systts.list.edit.ui.widgets

import androidx.lifecycle.ViewModel
import com.github.mgz0227.tts_server_android.app
import com.github.mgz0227.tts_server_android.help.audio.AudioPlayer

open class BaseViewModel : ViewModel() {
    val audioPlayer by lazy { AudioPlayer(app) }

    override fun onCleared() {
        super.onCleared()

        audioPlayer.release()
    }
}