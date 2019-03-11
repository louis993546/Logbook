package io.github.louistsaitszho.logbook.logbook

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import io.github.louistsaitszho.logbook.model.Page
import io.github.louistsaitszho.logbook.page.PageFragment

class LogbookPagesAdapter(
    private val pages: List<Page>,
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int = pages.size

    override fun getItem(position: Int) = PageFragment.newInstance(pages[position])

}