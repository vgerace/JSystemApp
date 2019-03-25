package com.example.jsystem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.)

        // encontra objeto pelo id
        val imagem = findViewById<ImageView>(R.id.ImgJegues)
        imagem.setImageResource(R.drawable.jegues)

        val texto = findViewById<TextView>(R.id.UserMsg)
        texto.text = getString(R.string.mensagem_login)


        val botaoLogin = findViewById<Button>(R.id.BtnLogin)

        // evento no botao de login forma 1
//        botaoLogin.setOnClickListener {
//            val campoUsuario = findViewById<EditText>(R.id.campo_usuario)
//            val campoSenha = findViewById<EditText>(R.id.campo_senha)
//            val valorUsuario = campoUsuario.text.toString()
//            val valorSenha = campoSenha.text.toString()
//            Toast.makeText(this, "$valorUsuario : $valorSenha", Toast.LENGTH_LONG).show()
//        }

        // segunda forma: delegar para método
        botaoLogin.setOnClickListener {onClickLogin() }

    }

    fun onClickLogin(){
        val campoUsuario = findViewById<EditText>(R.id.UserLogin)
        val campoSenha = findViewById<EditText>(R.id.UserPassword)
        val valorUsuario = campoUsuario.text.toString()
        val valorSenha = campoSenha.text.toString()
        Toast.makeText(this, "$valorUsuario : $valorSenha", Toast.LENGTH_LONG).show()
    }

}
