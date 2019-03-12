package io.github.louistsaitszho.logbook.workout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import io.github.louistsaitszho.logbook.databinding.FragmentWorkoutBinding
import io.github.louistsaitszho.logbook.model.SingleWorkout
import org.koin.android.viewmodel.ext.viewModel
import org.koin.core.parameter.parametersOf

class WorkoutFragment : Fragment() {

    private val keySmallWorkout = "keyForSmallWorkout"

    private lateinit var smallWorkout: SingleWorkout
    private val vm: WorkoutViewModel by viewModel(parameters = { parametersOf(smallWorkout) })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        smallWorkout = arguments?.getParcelable(keySmallWorkout)!!  //it's very bad if smallWorkout cannot be found
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentWorkoutBinding.inflate(inflater, container, false)
        binding.viewModel = vm
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    companion object {
        fun newInstance(smallWorkout: SingleWorkout) = WorkoutFragment().apply {
            arguments = bundleOf(keySmallWorkout to smallWorkout)
        }
    }
}