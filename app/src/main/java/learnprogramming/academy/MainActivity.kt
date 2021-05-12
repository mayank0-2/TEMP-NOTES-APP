package learnprogramming.academy

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"
private const val Text_contents = "TextContent"
class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: TextView = findViewById<TextView>(R.id.editTextText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.text = ""
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG, ("onClick:called"))
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.text = ""

            }
        })


    }

    override fun onStart() {
        Log.d(TAG, "onstart is called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onrestoreinstancestate is called")
        super.onRestoreInstanceState(savedInstanceState)
        textView?.text = savedInstanceState?.getString(Text_contents,"")

    }

    override fun onRestart() {
        Log.d(TAG, "onrestart is called")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG,"onstop is called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "ondestroy is called")
        super.onDestroy()
    }

    override fun onResume() {
        Log.d(TAG, "onresume is called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onpause is called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onsaveinstancestate is called")
        super.onSaveInstanceState(outState)
        outState?.putString(Text_contents, textView?.text.toString());
    }
}