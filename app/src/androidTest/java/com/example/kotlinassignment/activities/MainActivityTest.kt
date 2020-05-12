package com.example.kotlinassignment.activities

import android.view.View
import androidx.test.rule.ActivityTestRule
import com.example.kotlinassignment.R
import kotlinx.android.synthetic.main.activity_main.view.*
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
    private var mActivity: MainActivity? = null;

    @Before
    fun setUp() {
        mActivity = activityRule.activity
    }

    @Test
    fun testLaunchActiviy() {
        val view: View = mActivity!!.findViewById(R.id.recyclerList)
        assertNotNull(view)
    }

    @After
    fun tearDown() {
        mActivity = null;
    }
}