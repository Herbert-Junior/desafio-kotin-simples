import java.util.*
import kotlin.collections.LinkedHashSet

class Formacao {

    private lateinit var nome:String

    private lateinit var nivel: Nivel

    private var cargaHoraria:Int = 0

    private  var conteudoEducaional : List<ConteudoEducacional> = mutableListOf()

    private var inscritos:List<Usuario> = mutableListOf<Usuario>()

    constructor(
        nome: String,
        nivel: Nivel,
        cargaHoraria: Int,
        conteudoEducaional: List<ConteudoEducacional>,
        inscritos: List<Usuario>
    ) {
        this.nome = nome
        this.nivel = nivel
        this.cargaHoraria = cargaHoraria
        this.conteudoEducaional = conteudoEducaional
        this.inscritos = inscritos
    }

    constructor(nome: String, cargaHoraria: Int, nivel: Nivel, conteudoEducaional: List<ConteudoEducacional>){
        this.nome = nome
        this.cargaHoraria = cargaHoraria
        this.nivel = nivel
        this.conteudoEducaional = conteudoEducaional
    }

    fun matricular(usuario:Usuario, formacao:Formacao){
        (formacao.inscritos as ArrayList).add(usuario)
    }

    fun adicionarConteudo(conteudoEducaional: ConteudoEducacional, formacao: Formacao){
        (formacao.conteudoEducaional as ArrayList).add(conteudoEducaional)
    }

    override fun toString(): String {
        return "Formacao(nome='$nome', nivel=$nivel, cargaHoraria=$cargaHoraria, conteudoEducaional=$conteudoEducaional, inscritos=$inscritos)"
    }


}