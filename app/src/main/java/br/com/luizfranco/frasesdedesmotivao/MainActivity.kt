package br.com.luizfranco.frasesdedesmotivao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaDeFrases = arrayListOf(
            "Seja sempre a pior versão de si.",
            "Nunca deixe que ninguém te diga que você não consegue. Diga você mesmo: Eu não consigo!",
            "Já dizia Renato Russo: Quem acredita nunca alcança.",
            "Pra que fazer algo hoje se você pode deixar pra amanhã?",
            "Feche os olhos, encha os pulmões e diga: Eu nunca vou conseguir!",
            "Tempos fáceis constroem pessoas preguiçosas. Tempos difíceis... Bem, tempos difíceis apenas destroem.",
            "Não há nada mais recompensador do que a doce sensação de saber que você não se esforçou o bastante - porque não quis!",
            "O importante não é o destino - mas sim o cochilo que você vai poder tirar depois que chegar nele.",
            "O que é um peido pra quem já está todo cagado?",
            "Durma enquanto eles trabalham.",
            "Se não está ruim o bastante, é porque ainda não chegou ao final.",
            "Sorria! Tem alguém roubando seus dados =)",
            "Sem saber que era impossível, foi lá e soube.",
            "Daqui pra frente é só pra trás."
        )

        val fraseAleatoria = listaDeFrases.random()
        frase.text = fraseAleatoria

        btnMainFrase.setOnClickListener{
            val fraseAleatoria = listaDeFrases.random()
            frase.text = fraseAleatoria
        }
    }
}