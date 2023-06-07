import java.util.*

data class Usuario(var nome:String, val cpf:String?, var idade:Int, var sexo:String) {

    private lateinit var id:String

    fun create() : Boolean {
        if(nome.equals(null) || cpf.equals(null) || idade.equals(null) || sexo.equals(null)){
            throw Exception("Necessário preencher todos os campos do formulário")
        }
        id =  UUID.randomUUID().toString();
        return true;
    }

}

