package com.example.psychelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.FilterQueryProvider
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.TextView
import com.example.psychelp.Contact
import com.example.psychelp.User
import com.example.psychelp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val secondActbutton = findViewById<ImageButton>(R.id.button1)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)

        }


        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Notfallnummer: 116117"

        val contacts = arrayOf("test1","test2","test3")

        val ContactAdapter : ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,
            contacts
        )
        binding.userlist.adapter = ContactAdapter


        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.searchView.clearFocus()
                if (contacts.contains(query)){

                    ContactAdapter.filter.filter(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
              ContactAdapter.filter.filter(newText)
                return false
            }


        })
    }




}

