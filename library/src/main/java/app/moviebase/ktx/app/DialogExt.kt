package app.moviebase.ktx.app

import android.app.Dialog
import android.view.WindowManager

fun Dialog.showSoftInputMode() = window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
