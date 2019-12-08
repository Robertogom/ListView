package gomez.roberto.listview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val opciones = arrayOf("Botones", "Imagenes", "Web View","Swtch","CAJA 1","CAJA 2","CAJA 3","CAJA 4","CAJA 5","CAJA 2","CAJA 2","CAJA 2")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opciones)

        miListView.adapter = adaptador

        miListView.setOnItemClickListener{adapterView, view, i, l ->
            var intento = Intent()
           when(i){
               0 -> intento = Intent(this,Botones::class.java)
               1 -> intento = Intent(this,Imagenes::class.java)



           }

            startActivity(intento)

        }



    }
}
