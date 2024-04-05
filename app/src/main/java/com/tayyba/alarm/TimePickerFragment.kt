package com.tayyba.alarm

import android.app.Dialog
import android.app.DialogFragment
import android.app.TimePickerDialog
import android.os.Bundle
import java.util.*

class TimePickerFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val calendar: Calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR)
        val minute = calendar.get(Calendar.MINUTE)

        return TimePickerDialog(
            activity,
            activity as TimePickerDialog.OnTimeSetListener,
            hour,
            minute,
            true)
    }
}