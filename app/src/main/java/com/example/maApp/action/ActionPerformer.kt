package com.example.maApp.action

interface ActionPerformer<ACTION> {
    fun performAction(action: ACTION)
}