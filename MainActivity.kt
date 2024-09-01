package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                tvResult.text = "Result: $result"
            } else {
                showError()
            }
        }

        btnSubtract.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                tvResult.text = "Result: $result"
            } else {
                showError()
            }
        }

        btnMultiply.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                tvResult.text = "Result: $result"
            } else {
                showError()
            }
        }

        btnDivide.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull()
            val num2 = etNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    tvResult.text = "Result: $result"
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
            } else {
                showError()
            }
        }
    }

    private fun showError() {
        Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
    }
}
