package gomez.roberto.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        var texto  = etUrl.toString()
        var navegador  = idwebView

        navegador !! .webChromeClient =  WebChromeClient ()

        val ajustes   = navegador!!.settings
                ajustes.javaScriptEnabled =  true

        button.setOnClickListener {

            navegador !! .loadUrl ((procesaUrl (etUrl !! .text.toString ())))
            procesaUrl ( " Funciona " )

            // wvone.loadUrl ("http: //" + etlink.text.toString ())


        }
        volver contenedor


    }
    fun  procesaUrl ( url : String ) : String {

        if (url.startsWith ( " https: // " )) {
            URL de retorno
        } else  if (url.startsWith ( " www " )) {

            devuelve  " https: // $ url "
        } más {
            volver  " https://www.google.com/search?q=hola&oq=$url "
        }

        URL de retorno
    }

    mensaje divertido ( mensaje : String ) {
        Toast .makeText (actividad !! .applicationContext, mensaje, Toast . LENGTH_LONG ) .show ()
    }



}
}
