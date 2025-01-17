package com.example.baitap01

import android.os.Bundle
import android.view.Window
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
import com.example.baitap01.ui.theme.Baitap01Theme
import android.view.WindowManager
import android.widget.Button
import android.content.Intent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.student_layout) // Sử dụng XML layout

        // Lấy tham chiếu đến nút trong layout
        val button = findViewById<Button>(R.id.btnShowNumbers)
        val btnReverse = findViewById<Button>(R.id.btnReverse)
        // Xử lý sự kiện khi bấm nút
        button.setOnClickListener {
            // Chuyển sang Activity NumbersActivity khi bấm nút
            val intent = Intent(this, NumbersActivity::class.java)
            startActivity(intent)
        }
        btnReverse.setOnClickListener {
            // Tạo Intent để mở ReverseTextActivity
            val intent = Intent(this, ReverseTextActivity::class.java)
            startActivity(intent)
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Baitap01Theme {
        Greeting("Android")
    }
}