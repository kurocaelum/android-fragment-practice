package android.imd

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_result.*
import java.lang.StringBuilder

class ResultFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    fun invert(text: String){
        var inverted = StringBuilder(text).reverse().toString()

        txt_text.text = inverted
    }
}