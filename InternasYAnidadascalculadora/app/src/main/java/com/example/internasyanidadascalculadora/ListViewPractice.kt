package com.example.internasyanidadascalculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ListViewPractice : AppCompatActivity() {
    lateinit var lvlenguajes:ListView;
    private var tvresultado:TextView? = null;

    //arreglo
    private val lenguajes = arrayOf("Kotlin","Java","C++","C#","PHP","VB.net");
    private val posicion = arrayOf("1","6","3","2","4","5");
    private val id = arrayOf(1,2,3,4,5,6);

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_practice)
        //vinculando variables con los elementos de la activity
        lvlenguajes = findViewById(R.id.lv_lenguajes);
        tvresultado = findViewById(R.id.txt_resultado);


        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.activity_list_view_practice, lenguajes);
        println(id.size);
        lvlenguajes.adapter = adapter;

        lvlenguajes.onItemClickListener= object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                tvresultado?.text = "La posición del lenguaje ${lvlenguajes.getItemAtPosition(p2)} es ${posicion[p2]}";
            }


        }




    }

}