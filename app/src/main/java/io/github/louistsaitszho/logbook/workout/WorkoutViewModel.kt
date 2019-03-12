package io.github.louistsaitszho.logbook.workout

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.louistsaitszho.logbook.model.SingleWorkout
import kotlin.properties.Delegates

class WorkoutViewModel(smallWorkout: SingleWorkout) : ViewModel() {
    private var workout: SingleWorkout by Delegates.observable(initialValue = smallWorkout) { _, _, new ->
        textViewDistance.value = new.overall.distance.toString()
        textViewDuration.value = new.overall.duration.toString()
        textViewStrokeRate.value = new.overall.strokeRate.toString()
        new.overall.heartRate?.let { textViewHeartRate.value = it.toString() }
    }

    var textViewDistance = MutableLiveData<String>()
    var textViewDuration = MutableLiveData<String>()
    val textViewStrokeRate = MutableLiveData<String>()
    val textViewHeartRate = MutableLiveData<String>()

    init {
        TODO("fetch everything about the workout and update workout")
    }
}