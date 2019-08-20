package android.imd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), TextFragment.OnInverterListener {

    var resultFragment:ResultFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultFragment = supportFragmentManager
            .findFragmentById(R.id.frag_result) as ResultFragment
    }

    override fun onInvert(text: String) {
        resultFragment?.invert(text)
    }
}
