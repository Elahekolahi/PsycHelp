package com.example.psychelp
import android.content.Context


data class Contact(val id: Int, val name: String, val phone: String, val place: String)



/*fun searchContacts(query: String, context: Context): List<Contact> {
    val dbHelper = ContactsDatabaseHelper(context)
    val db = dbHelper.readableDatabase

    val selection = "name LIKE ?"
    val selectionArgs = arrayOf("%$query%")
    val cursor = db.rawQuery("SELECT * FROM contacts WHERE $selection", selectionArgs)

    val searchResults = mutableListOf<Contact>()
    while (cursor.moveToNext()) {
        val id = cursor.getInt(cursor.getColumnIndex("id"))
        val name = cursor.getString(cursor.getColumnIndex("name"))
        val place = cursor.getString(cursor.getColumnIndex("place"))
        searchResults.add(Contact(id, name, place))
    }

    cursor.close()
    db.close()
    return searchResults
}*/

