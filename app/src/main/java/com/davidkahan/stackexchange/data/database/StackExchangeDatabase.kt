package com.davidkahan.stackexchange.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.davidkahan.stackexchange.datamodels.Question
import com.davidkahan.stackexchange.utils.Constants

/**
 * Created by David Kahan on 15/10/2020.
 */
@Database(entities = [Question::class], version = 1, exportSchema = false)
abstract class StackExchangeDatabase : RoomDatabase() {

    abstract fun stackExchangeDao(): StackExchangeDao

    companion object {
        @Volatile
        private var INSTANCE: StackExchangeDatabase? = null

        fun getDatabase(appContext: Context): StackExchangeDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    appContext,
                    StackExchangeDatabase::class.java,
                    Constants.DATA_BASE_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }

}