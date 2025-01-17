package com.example.baitap01

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.baitap01.ui.theme.Baitap01Theme
import kotlin.random.Random
import android.util.Log

class NumbersActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContent {
            // Số lượng phần tử và phạm vi giá trị số ngẫu nhiên
            val numberCount = 10 // Tổng số phần tử trong mảng
            val numberRange = 1..100 // Phạm vi giá trị từ 1 đến 100

            // Tạo mảng số ngẫu nhiên
            val numbers = List(numberCount) { Random.nextInt(numberRange.first, numberRange.last) }
            val evenNumbers = numbers.filter { it % 2 == 0 }
            val oddNumbers = numbers.filter { it % 2 != 0 }

            // In kết quả ra Logcat
            Log.d("NumbersActivity", "Mảng gốc: $numbers")
            Log.d("NumbersActivity", "Số chẵn: $evenNumbers")
            Log.d("NumbersActivity", "Số lẻ: $oddNumbers")
            // Hiển thị số chẵn và lẻ
            Baitap01Theme {
                Column(modifier = Modifier.padding(16.dp)) {
                    // Hiển thị mảng số ngẫu nhiên và các số chẵn lẻ
                    Text("Mảng gốc: $numbers", fontSize = 20.sp)
                    Text("Số chẵn: $evenNumbers", fontSize = 20.sp)
                    Text("Số lẻ: $oddNumbers", fontSize = 20.sp)

                    // Nút quay lại
                    Button(onClick = {
                        finish() // Đóng activity hiện tại và quay lại màn hình trước đó
                    }) {
                        Text("Quay lại")
                    }
                }
            }
        }
    }
}
