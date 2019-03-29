package io.github.louistsaitszho.logbook.feature.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.louistsaitszho.logbook.databinding.FragmentPageBinding
import io.github.louistsaitszho.logbook.model.Page

class PageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentPageBinding.inflate(inflater, container, false)
        //TODO use the binding to set viewModel
        return binding.root
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    companion object {
        fun <T : Page> newInstance(page: T) = PageFragment()
    }

}