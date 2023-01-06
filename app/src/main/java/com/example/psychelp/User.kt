package com.example.psychelp

class User(var username: String, var password: String) {
    private val contacts: MutableList<Contact>

    init {
        contacts = ArrayList()
    }

    fun getContacts(): List<Contact> {
        return contacts
    }

    fun addContact(contact: Contact) {
        contacts.add(contact)
    }
}
