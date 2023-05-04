package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstInput: TextInputLayout
    lateinit var etFirstInput: TextInputEditText
    lateinit var tilSecondInput: TextInputLayout
    lateinit var etSecondInput: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilFirstInput = findViewById(R.id.tilFirstInput)
        etFirstInput = findViewById(R.id.etFirstInput)
        tilSecondInput = findViewById(R.id.tilSecondInput)
        etSecondInput = findViewById(R.id.etSecondInput)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val num1 = etFirstInput.text.toString().toInt()
            val num2 = etSecondInput.text.toString().toInt()
            val finalResult = num1 + num2
            tvResult.text = "Result: $finalResult"
        }

        btnSubtract.setOnClickListener {
            val num1 = etFirstInput.text.toString().toInt()
            val num2 = etSecondInput.text.toString().toInt()
            val finalResult = num1 - num2
            tvResult.text = "Result: $finalResult"
        }

        btnMultiply.setOnClickListener {
            val num1 = etFirstInput.text.toString().toInt()
            val num2 = etSecondInput.text.toString().toInt()
            val finalResult = num1 * num2
            tvResult.text = "Result: $finalResult"
        }

        btnDivide.setOnClickListener {
            val num1 = etFirstInput.text.toString().toInt()
            val num2 = etSecondInput.text.toString().toInt()
            val finalResult = num1 / num2
            tvResult.text = "Result: $finalResult"
        }

    }
}