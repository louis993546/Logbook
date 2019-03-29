package io.github.louistsaitszho.logbook.feature.logbook

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import io.github.louistsaitszho.logbook.feature.page.PageFragment
import io.github.louistsaitszho.logbook.model.Page

class LogbookPagesAdapter(
    private val pages: List<Page>,
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int = pages.size

    override fun getItem(position: Int) = PageFragment.newInstance(pages[position])

}