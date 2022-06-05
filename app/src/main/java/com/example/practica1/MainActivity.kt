//El nombre de nuestro paquete.
package com.example.practica1

//Las herramientas necesarias para nuestro MainActivity
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

//enlazar elementos de la vista con el codigo
import com.example.practica1.databinding.ActivityMainBinding

//La actividad principal (MainActivity) contiene la lógica de nuestra pantalla.
class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //asignamos un valor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //anterior

        //Modificar el valor de textview
        /* var leyenda=findViewById<TextView>(R.id.text)
        leyenda.text="Bienvenido a mi primer aplicación para SmartWatch"*/
        //binding.text.text="Bienvenido a mi primer aplicación para SmartWatch"

    }
}