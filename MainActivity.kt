package com.example.unitconversion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue = findViewById<EditText>(R.id.input_value)
        val fromUnit = findViewById<Spinner>(R.id.spinner_from_unit)
        val toUnit = findViewById<Spinner>(R.id.spinner_to_unit)
        val resultView = findViewById<TextView>(R.id.result)
        val convertButton = findViewById<Button>(R.id.button_convert)

        convertButton.setOnClickListener {
            val value = inputValue.text.toString().toDouble()
            val from = fromUnit.selectedItem.toString()
            val to = toUnit.selectedItem.toString()
            val result = when {
                from == "Celsius" && to == "Fahrenheit" -> (value * 9 / 5) + 32
                from == "Fahrenheit" && to == "Celsius" -> (value - 32) * 5 / 9
                from == "Kilograms" && to == "Pounds" -> value * 2.205
                from == "Pounds" && to == "Kilograms" -> value / 2.205
                // Add more unit conversions as necessary
                else -> 0.0
            }
            resultView.text = result.toString()
        }
    }
}
