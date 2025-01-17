package com.example.baitap01

import android.app.Activity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ReverseTextActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.reverse_text_layout)  // Đảm bảo bạn có layout này

        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textViewResult)
        val button = findViewById<Button>(R.id.btnReverse)
        val buttonBack = findViewById<Button>(R.id.btnBack)

        // Nút quay lại
        buttonBack.setOnClickListener {
            // Quay lại activity trước đó
            onBackPressed()
        }

        button.setOnClickListener {
            val inputText = editText.text.toString()
            val reversedText = inputText.split(" ").reversed().joinToString(" ").toUpperCase()

            textView.text = reversedText
            Toast.makeText(this, reversedText, Toast.LENGTH_SHORT).show()
        }
    }
}

