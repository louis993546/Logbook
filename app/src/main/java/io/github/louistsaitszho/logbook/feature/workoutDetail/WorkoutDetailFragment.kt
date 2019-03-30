package io.github.louistsaitszho.logbook.feature.workoutDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.louistsaitszho.logbook.databinding.FragmentWorkoutDetailBinding
//import io.github.louistsaitszho.logbook.databinding.FragmentWorkoutDetailBinding
import org.koin.android.viewmodel.ext.viewModel
import org.koin.core.parameter.parametersOf
import java.util.*

class WorkoutDetailFragment : Fragment() {

    private val keyWorkoutId = "keyWorkoutId"

    private lateinit var workoutIdFromParent: UUID
    private val vm: WorkoutDetailViewModel by viewModel(parameters = { parametersOf(workoutIdFromParent) })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        workoutIdFromParent =
            (arguments?.getSerializable(keyWorkoutId) as UUID?)!!   //it's very bad if smallWorkout cannot be found
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentWorkoutDetailBinding.inflate(inflater, container, false)
//        binding.viewModel = vm
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }
}