package edu.iesam.loginexam1eval.features.user.presentation

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import edu.iesam.loginexam1eval.R
import edu.iesam.loginexam1eval.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
        setupView()
    }

    /**
     * Método de prueba para acceder a los elementos de la vista
     */
    private fun setupView() {
        val username = findViewById<EditText>(R.id.username).text.toString()
        val password = findViewById<EditText>(R.id.password).text.toString()
        val reminderIsChecked = findViewById<CheckBox>(R.id.reminder).isChecked
        findViewById<Button>(R.id.action).setOnClickListener {
            //Hago algo con los datos
        }
        findViewById<Button>(R.id.singInButton).setOnClickListener {
            view ->
            view.findNavController().navigate(R.id.init)
        }
    }

}