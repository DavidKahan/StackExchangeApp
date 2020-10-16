package com.davidkahan.stackexchange.ui.main

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.davidkahan.stackexchange.R
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @Rule
    @JvmField
    var activityRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test
    fun checkRecyclerDisplayed() {
        onView(withId(R.id.questionsRecycler))
            .check(matches(ViewMatchers.isDisplayed()))
    }

}