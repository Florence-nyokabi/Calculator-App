package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculator.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {

        super.onResume()
        binding.btnAdd.setOnClickListener { calculate("+") }
        binding.btnSubtract.setOnClickListener { calculate("-") }
        binding.btnMultiply.setOnClickListener { calculate("*") }
        binding.btnDivide.setOnClickListener { calculate("%") }
    }

    fun calculate(operation: String) {
        clearErrors()
        val num1 = binding.etFirstInput.text.toString()
        val num2 = binding.etSecondInput.text.toString()
        var error = false

        if (num1.isBlank()) {
            binding.tilFirstInput.error = "Num1 is required"
            error = true

        }
        if (num2.isBlank()) {
            binding.tilFirstInput.error = "Num2 is required"
            error = true


        }
        if (!error) {
            val firstNum = num1.toDouble()
            val secondNum = num2.toDouble()


            val result = when (operation) {
                "+" -> firstNum + secondNum
                "-" -> firstNum + secondNum
                "*" -> firstNum * secondNum
                "%" -> {
                    firstNum % secondNum
                }
                else -> throw Exception("Invalid operator")

            }
            binding.tvResult.text = result.toString()
        }

    }

    fun clearErrors(){
        binding.tilFirstInput.error=null
        binding.tilSecondInput.error=null


    }
}
