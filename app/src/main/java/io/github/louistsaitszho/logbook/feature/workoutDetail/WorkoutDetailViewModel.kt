package io.github.louistsaitszho.logbook.feature.workoutDetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.louistsaitszho.logbook.model.IntervalWorkout
import io.github.louistsaitszho.logbook.model.NormalWorkout
import io.github.louistsaitszho.logbook.model.Workout
import io.github.louistsaitszho.logbook.utils.LateinitObservable
import java.util.*

class WorkoutDetailViewModel(workoutId: UUID) : ViewModel() {

    private var workout: Workout by LateinitObservable(afterSet = { _, new ->
        progressBarLoading.value = false
        textViewDistance.value = new.overall.distance.toString()
        textViewDuration.value = new.overall.duration.toString()
        textViewStrokeRate.value = new.overall.strokeRate.toString()
        new.overall.heartRate?.let { textViewHeartRate.value = it.toString() }
        when (new) {
            is NormalWorkout -> {
                TODO("do it's own thing")
            }
            is IntervalWorkout -> {
                TODO("do it's own thing")
            }
        }
    })

    private val textViewDistance = MutableLiveData<String>()
    private val textViewDuration = MutableLiveData<String>()
    private val textViewStrokeRate = MutableLiveData<String>()
    private val textViewHeartRate = MutableLiveData<String>()
    private val progressBarLoading = MutableLiveData<Boolean>()
    //TODO matching number of public LiveData to expose the getter

    init {
        progressBarLoading.value = true
        TODO("use workout id to fetch the complete workout")
    }

}