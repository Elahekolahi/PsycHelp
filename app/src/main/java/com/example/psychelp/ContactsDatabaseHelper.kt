package com.example.psychelp


import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
private const val DATABASE_NAME = "contacts.db"
private const val DATABASE_VERSION = 1

class ContactsDatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        // Create the "contacts" table
        db.execSQL(
            "CREATE TABLE contacts (id INTEGER PRIMARY KEY, name TEXT, place TEXT)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Upgrade the database if the version changes
    }
}
