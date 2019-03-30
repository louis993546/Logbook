package io.github.louistsaitszho.logbook.feature.logbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.louistsaitszho.logbook.databinding.FragmentLogbookBinding

class LogbookFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentLogbookBinding.inflate(inflater, container, false)
        return binding.root
    }

}