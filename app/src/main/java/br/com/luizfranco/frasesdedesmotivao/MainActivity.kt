package br.com.luizfranco.frasesdedesmotivao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
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
            "Daqui pra frente é só pra trás.",
            "Chegar no fundo do poço é sempre uma nova oportunidade para descobrir que ele é ainda mais fundo do que parece.",
            "Acredita em meritocracia? Melhor dar uma olhada no Instagram do filho do seu chefe =)",
            "Nunca desista! O resultado sempre pode ser pior.",
            "Tristêêza não tem fim... Feli...cidade... sim...",
            "Não fique preso às derrotas do seu passado! Você ainda vai ser derrotado muitas vezes no futuro também :)",
            "Tudo sempre passa. Nem que seja que nem um trator por cima de você.",
            "Trabalhe com o que você ama e você nunca mais vai amar nada na sua vida.",
            "Pare de reclamar! Aceite seu fracasso.",
            "Nada é tão ruim que não possa piorar."
        )

        val fraseAleatoria = listaDeFrases.random()
        txtMainFrase.text = fraseAleatoria

        btnMainFrase.setOnClickListener{
            val fraseAleatoria = listaDeFrases.random()
            txtMainFrase.text = fraseAleatoria
        }

        switchMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

    }
}