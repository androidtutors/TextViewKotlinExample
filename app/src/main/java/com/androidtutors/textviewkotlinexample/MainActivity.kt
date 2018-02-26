package com.androidtutors.textviewkotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 6 : Change the text of textview_hello to "Learning Kotlin"
        textview_hello.text = "Learnig Kotlin"

        //TODO 7 : Adding onClickListener on textview_hello
        //TODO 8 : Changing the text of textview_hello to "You clicked me!"

    }
}
