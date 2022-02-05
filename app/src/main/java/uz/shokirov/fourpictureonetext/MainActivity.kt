package uz.shokirov.fourpictureonetext

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var spinner: Spinner? = null
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner1)
        textView = findViewById(R.id.numberText)

        val numberList = ArrayList<String>()
        numberList.add("number")
        numberList.add("One")
        numberList.add("Two")
        numberList.add("Three")
        numberList.add("Four")
        numberList.add("Five")
        numberList.add("Six")
        numberList.add("Seven")
        numberList.add("Eight")
        numberList.add("Nine")
        numberList.add("Ten")
        // Spinner uchun list yaratib oldim

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, numberList)
        spinner?.adapter = adapter
        //adapter tayyorladik va uladik
        spinner?.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, positions: Int, l: Long) {
                if (positions == 0) {
                    Toast.makeText(this@MainActivity, "Please number click", Toast.LENGTH_SHORT).show()
                    textView?.text = ""
                } else {
                    val number = adapterView.getItemAtPosition(positions).toString()
                    textView?.text = number
                }
            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
        })


    }
}