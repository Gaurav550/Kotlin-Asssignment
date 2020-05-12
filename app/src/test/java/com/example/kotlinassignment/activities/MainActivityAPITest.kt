package com.example.kotlinassignment.activities

import com.example.kotlinassignment.models.Items
import org.junit.After
import org.junit.Before

import org.junit.Test
import org.mockito.*
import org.mockito.Mockito.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityAPITest {

    @Captor
    private lateinit var argumentCaptor: ArgumentCaptor<Callback<Items>>
    @Mock
    private lateinit var callback: Callback<Items>
    @Mock
    private lateinit var call: Call<Items>
    private lateinit var response: Response<Items>
    private lateinit var mainActivity: MainActivity

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        mainActivity = MainActivity()
        response = mock(Response::class.java) as Response<Items>

    }

    @Test
    fun testApi() {
        mainActivity.retrofitCall()

        call.enqueue(argumentCaptor.capture())
        argumentCaptor.value.onResponse(call, response)
        verify(callback).onResponse(call, response)
    }

    @After
    fun tearDown() {
    }
}