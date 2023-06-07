import java.util.*
import kotlin.collections.ArrayList
import Usuario as Usuario

fun main() {

    val user = Usuario("Herbert", "39393", 21, "M")
    var users : List<Usuario> = mutableListOf()

    if(user.create()){
        println("Usuário ${user.nome}, Criado com sucesso")

        (users as ArrayList).add(user)

        var aberturaJavascript = ConteudoEducacional("Abertura", Nivel.BASICO, 1)
        var iniciandoJavascript = ConteudoEducacional("Variáveis, Métodos e Funções", Nivel.BASICO, 2)

        var conteudos: List<ConteudoEducacional> = mutableListOf(aberturaJavascript, iniciandoJavascript)


        var formacao = Formacao("Javascript start", Nivel.BASICO, 44, conteudos, users)

        println(formacao.toString())
    }

    val user2 = Usuario("Roberti", "49393", 44, "M")

    if(user2.create()){
        println("Usuário ${user.nome}, Criado com sucesso")
        (users as ArrayList).add(user2)

        var aberturaOracle = ConteudoEducacional("Abertura", Nivel.BASICO, 1)
        var iniciandoOracle = ConteudoEducacional("Comando DDDL, Reionamentos e Procedures", Nivel.INTERMEDIARIO, 3)

        var conteudo:List<ConteudoEducacional> = mutableListOf(aberturaOracle, iniciandoOracle)

        var formacao = Formacao("Formação Oracle", 4, Nivel.INTERMEDIARIO, conteudo)

        formacao.matricular(user2, formacao)

        println(formacao.toString())

        formacao.matricular(user, formacao)

        println(formacao.toString())
    }
}




