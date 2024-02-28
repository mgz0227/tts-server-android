package com.github.mgz0227.tts_server_android.ui.view

import androidx.lifecycle.ViewModel

class ErrorDialogViewModel : ViewModel() {
    internal val throwableList = mutableMapOf<String, Throwable>()
}