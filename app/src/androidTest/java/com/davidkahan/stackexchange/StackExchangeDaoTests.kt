package com.davidkahan.stackexchange

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.davidkahan.stackexchange.data.database.StackExchangeDao
import com.davidkahan.stackexchange.data.database.StackExchangeDatabase
import com.davidkahan.stackexchange.datamodels.Question
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

/**
 * Created by David Kahan on 16/10/2020.
 */
@RunWith(AndroidJUnit4::class)
class StackExchangeDaoTests {

    private lateinit var stackExchangeDao: StackExchangeDao
    private lateinit var db: StackExchangeDatabase

    @Before
    fun createDb() {
        val context: Context = ApplicationProvider.getApplicationContext()
        // Using an in-memory database because the information stored here disappears when the
        // process is killed.
        db = Room.inMemoryDatabaseBuilder(context, StackExchangeDatabase::class.java)
            // Allowing main thread queries, just for testing.
            .allowMainThreadQueries()
            .build()
        stackExchangeDao = db.stackExchangeDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGetAllQuestions() {
        val question = Question(1,true,"firstQuestion",0,3,142421L,123412141L,0,"rtrth")
        val question1 = Question(2,false,"secondQuestion",0,3,142421L,123412141L,0,"rtrth")
        val list = listOf(question,question1)
        stackExchangeDao.insertQuestions(list)
        val allQuestions = stackExchangeDao.getAllLocalQuestions()
        assertEquals(allQuestions[0].id, question.id)
        assertEquals(allQuestions[1].id, question1.id)
    }
}