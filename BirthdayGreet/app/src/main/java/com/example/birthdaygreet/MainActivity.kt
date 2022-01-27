package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createcard(view: android.view.View) {
        createbirthdaybutton.setOnClickListener {
            val name1 = nameInput.text.toString()
            if (name1.isEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("invalid ")
                    .setMessage("please enter the name ")
                    .setPositiveButton("ok") { dialog, _ -> dialog.dismiss() }
                    .setCancelable(false)
                    .show()
                return@setOnClickListener
            }


            val name = nameInput.editableText.toString()
            Toast.makeText(this, "Here we Go👀", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}