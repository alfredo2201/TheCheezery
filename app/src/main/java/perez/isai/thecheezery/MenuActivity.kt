package perez.isai.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold:Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot:Button = findViewById(R.id.button_hot_drinks) as Button

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, productsActivity::class.java)

            startActivity(intent)
        }

        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, productsActivity::class.java)
            startActivity(intent)
        }
    }
}