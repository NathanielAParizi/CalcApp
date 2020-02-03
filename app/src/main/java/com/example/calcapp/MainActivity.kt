package com.example.calcapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    var sb = StringBuilder()
    var inputInit = true
    var total = 0.0

    //Instance Variables*********************************************

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Operators and Commands
        var inputLine = findViewById<TextView>(R.id.input_line)
        var buttonMulti = findViewById<Button>(R.id.btn_multiplication)
        var buttonDivision = findViewById<Button>(R.id.btn_division)
        var buttonAddition = findViewById<Button>(R.id.btn_addition)
        var buttonSubtraction = findViewById<Button>(R.id.btn_subtraction)
        var buttonPoint = findViewById<Button>(R.id.btn_point)
        var buttonEqual = findViewById<Button>(R.id.btn_equal)
        var buttonDelete = findViewById<Button>(R.id.btn_delete)

        Log.v("TAG","ok!")

        // Digits
        var button1 = findViewById<Button>(R.id.btn1)
        var button2 = findViewById<Button>(R.id.btn2)
        var button3 = findViewById<Button>(R.id.btn3)
        var button4 = findViewById<Button>(R.id.btn4)
        var button5 = findViewById<Button>(R.id.btn5)
        var button6 = findViewById<Button>(R.id.btn6)
        var button7 = findViewById<Button>(R.id.btn7)
        var button8 = findViewById<Button>(R.id.btn8)
        var button9 = findViewById<Button>(R.id.btn9)
        var button0 = findViewById<Button>(R.id.btn0)

        button0.setOnClickListener {

            if (sb.isEmpty()) {

                if (inputInit == true) {
                    sb.clear()
                    printInput()
                    inputInit = false
                }

                sb.append("0")

                printInput()

            } else if (!sb.get(0).equals('0')) {
                sb.append("0")

                printInput()
            }


        }

        button1.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }

            sb.append("1")


            printInput()


        }
        button2.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("2")


            printInput()


        }
        button3.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("3")


            printInput()


        }
        button4.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("4")


            printInput()


        }
        button5.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("5")


            printInput()


        }
        button6.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("6")


            printInput()


        }
        button7.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("7")


            printInput()


        }
        button8.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("8")


            printInput()


        }
        button9.setOnClickListener {

            if (inputInit == true) {
                sb.clear()
                printInput()
                inputInit = false
            }


            sb.append("9")


            printInput()


        }
        buttonPoint.setOnClickListener {


            if (sb.isNotEmpty() && !sb.get(sb.length - 1).equals('.')) {


                when (sb.get(sb.length - 1)) {
                    '/' -> {
                        sb.set(sb.length - 1, '.')
                    }
                    '+' -> {
                        sb.set(sb.length - 1, '.')
                    }
                    '-' -> {
                        sb.set(sb.length - 1, '.')
                    }
                    else -> {

                        sb.append(".")


                    }
                }

                printInput()


            }


        }
        buttonMulti.setOnClickListener {


            if (sb.isNotEmpty() && !sb.get(sb.length - 1).equals('*')) {


                when (sb.get(sb.length - 1)) {
                    '/' -> {
                        sb.set(sb.length - 1, '*')
                    }
                    '+' -> {
                        sb.set(sb.length - 1, '*')
                    }
                    '-' -> {
                        sb.set(sb.length - 1, '*')
                    }
                    else -> {

                        sb.append("*")


                    }
                }

                printInput()


            }

        }
        buttonDivision.setOnClickListener {


            if (sb.isNotEmpty() && !sb.get(sb.length - 1).equals('/')) {

                when (sb.get(sb.length - 1)) {
                    '*' -> {
                        sb.set(sb.length - 1, '/')
                    }
                    '+' -> {
                        sb.set(sb.length - 1, '/')
                    }
                    '-' -> {
                        sb.set(sb.length - 1, '/')
                    }
                    else -> {
                        sb.append("/")

                    }
                }

                printInput()

            }



        }
        buttonAddition.setOnClickListener {

            if (sb.isNotEmpty() && !sb.get(sb.length - 1).equals('+')) {

                when (sb.get(sb.length - 1)) {
                    '/' -> {
                        sb.set(sb.length - 1, '+')
                    }
                    '*' -> {
                        sb.set(sb.length - 1, '+')
                    }
                    '-' -> {
                        sb.set(sb.length - 1, '+')
                    }
                    else -> {

                        sb.append("+")


                    }
                }

                printInput()

            }

        }
        buttonSubtraction.setOnClickListener {

            if (sb.isNotEmpty() && !sb.get(sb.length - 1).equals('-')) {

                when (sb.get(sb.length - 1)) {
                    '/' -> {
                        sb.set(sb.length - 1, '-')
                    }
                    '+' -> {
                        sb.set(sb.length - 1, '-')
                    }
                    '*' -> {
                        sb.set(sb.length - 1, '-')
                    }
                    else -> {

                        sb.append("-")


                    }
                }

                printInput()

            }

        }
        buttonDelete.setOnClickListener {

            if (sb.isNotEmpty()) {
                sb.deleteCharAt(sb.length - 1)

                printInput()
            }

        }
        buttonEqual.setOnClickListener {

            if (inputInit == true) {


            } else {

                when (sb.get(sb.length - 1)) {
                    '/' -> {
                        sb.set(sb.length - 1, ' ')
                    }
                    '+' -> {
                        sb.set(sb.length - 1, ' ')
                    }
                    '*' -> {
                        sb.set(sb.length - 1, ' ')
                    }
                    '-' -> {
                        sb.set(sb.length - 1, ' ')
                    }
                    else -> {

                        sb.append(" ")

                    }
                }

                val expression = ExpressionBuilder(sb.toString()).build()
                val result = expression.evaluate()
                val doubleResult = result.toDouble()

                Log.v("WTF", doubleResult.toString())

                var answer = doubleResult.toString()

                sb.clear()
                sb.append(answer)

                inputInit = true

                printInput()
            }


        }


    }
    //
    fun printInput() {


        input_line.text = sb.toString()


    }

}
