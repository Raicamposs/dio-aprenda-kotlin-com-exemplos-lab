// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val matricula: Int, val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    
    private val nivel = Nivel.INTERMEDIARIO
    
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
  val conteudos = mutableListOf<ConteudoEducacional>()
  conteudos.add(ConteudoEducacional("Entendendo DDD",10))
  conteudos.add(ConteudoEducacional("Linguagem Ubíqua",20))
  conteudos.add(ConteudoEducacional("Domínio e subdomínios",15))
  conteudos.add(ConteudoEducacional("Contextos delimitados",30))
  conteudos.add(ConteudoEducacional("Mapas de contextos",20))
  conteudos.add(ConteudoEducacional("Design patterns",40))
  
  val formacao = Formacao("Arquitetura de software", conteudos)
  
  formacao.matricular(Usuario(1,"Davi"))
  formacao.matricular(Usuario(2,"Ana"))
}
