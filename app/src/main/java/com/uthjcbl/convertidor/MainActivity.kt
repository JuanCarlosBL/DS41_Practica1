package com.uthjcbl.convertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.textView)
        val option = findViewById<Spinner> (R.id.temperature)
        val temp   = findViewById<EditText>(R.id.editTextNumberDecimal3)
        val button = findViewById<Button>  (R.id.covert)

        button.setOnClickListener {

            temperature = temp.text.toString()
            conversion()
        }


        if (option != null){

            val adapter = ArrayAdapter(

                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.conver_options)

                )
            option.adapter
            option.onItemSelectedListener = object :
                AdapterVieW.OnItemSeletedListener {
                override fun onTtemSeleted
            }
        }
    }
private fun conversion(option: Int){
    when(option) {

        0 ->{

        }

        1 -> { //tarea traer la 5 formulas de conversion

        }
        2 -> {

        }

        3 -> {

        }
        4 -> {

        }

        5 -> {

        }





    }
}

}