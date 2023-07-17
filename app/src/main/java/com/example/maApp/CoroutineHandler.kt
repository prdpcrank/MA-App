package com.example.maApp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class CoroutineHandler {

    companion object {

        @Volatile
        private var scopes: CoroutineHandler? = null

        fun get(): CoroutineHandler {
            synchronized(this) {
                if (scopes == null) {
                    scopes = CoroutineHandler()
                }
            }
            return scopes!!
        }
    }

    fun runOnMain(): CoroutineScope {
        return CoroutineScope(Dispatchers.Main)
    }

    fun runOnIO(): CoroutineScope {
        return CoroutineScope(Dispatchers.IO)
    }

}