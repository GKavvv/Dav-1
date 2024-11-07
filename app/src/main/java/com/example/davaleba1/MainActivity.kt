package com.example.davaleba1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.davaleba1.ui.theme.Davaleba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newlayout)

        val nextbutton = findViewById<Button>(R.id.nextbtn)
        val okaybutton = findViewById<Button>(R.id.okaybtn)
        val edittext = findViewById<EditText>(R.id.nameinput)
        val textview = findViewById<TextView>(R.id.textView)

        okaybutton.setOnClickListener{
            val name = edittext.text.toString()

            if(name.isNotEmpty()) {
                textview.text = "Hello, $name"
            }
        }
        nextbutton.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
} }