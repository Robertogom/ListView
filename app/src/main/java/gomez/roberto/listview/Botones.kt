package gomez.roberto.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_botones.*

class Botones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        btnHola.setOnClickListener {
            Toast.makeText(applicationContext,"hola mortal", Toast.LENGTH_LONG ).show()


        }
    }
}
