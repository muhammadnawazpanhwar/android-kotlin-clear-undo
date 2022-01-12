package com.example.clearundoapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.lang.String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<EditText>(R.id.message)
        val undo = findViewById<Button>(R.id.undo)
        val clear = findViewById<Button>(R.id.clear)
        var input =" "
        undo.setOnClickListener(View.OnClickListener { message.setText(input) })
        clear.setOnClickListener(View.OnClickListener {
            input = String.valueOf(message.getText())
            message.setText("")
        })

    }
}