package io.github.louistsaitszho.logbook.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.louistsaitszho.logbook.databinding.PageFragmentBinding
import io.github.louistsaitszho.logbook.model.Page

class PageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = PageFragmentBinding.inflate(inflater, container, true)
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