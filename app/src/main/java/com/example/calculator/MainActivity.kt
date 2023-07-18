package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textInputLayout = findViewById<TextInputLayout>(R.id.ip1)
        val editText = textInputLayout.editText
        textInputLayout.hint="number1"


    val btnsum=findViewById<Button>(R.id.btnSum)
       btnsum.setOnClickListener {
           val textInputLayout = findViewById<TextInputLayout>(R.id.ip1)
           val editText = textInputLayout.editText
           val v1 = editText?.text.toString().toInt()
           val textInputLayout2 = findViewById<TextInputLayout>(R.id.ip2)
           val editText2 = textInputLayout2.editText
           val v2 = editText2?.text.toString().toInt()
           val result=(v1+v2)
           val myTextView = findViewById<TextView>(R.id.textView)
           myTextView.text = result.toString()

       }

    }
}