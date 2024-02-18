// Classe para representar um item da lista de compras
class Item(val nome: String, val quantidade: Int)

fun main() {
    // Criando uma lista de compras
    val listaCompras = mutableListOf(
        Item("Maçã", 2),
        Item("Banana", 3),
        Item("Laranja", 1),
        Item("Leite", 1),
        Item("Ovos", 12),
    )

    // Imprimindo a lista de compras
    println("Lista de compras:")
    for (item in listaCompras) {
        println(" - ${item.nome} (${item.quantidade})")
    }

    // Adicionando um novo item à lista
    listaCompras.run {
        add(Item("Pão", 1))

        // Removendo um item da lista
        removeAt(2)

        // Verificando se um item está na lista
        var Anyval = contains(Item("Ovos", 12))
    }

    // Ordenando a lista por nome
    listaCompras.sortBy { it.nome }

    // Imprimindo a lista ordenada
    println("Lista ordenada por nome:")
    for (item in listaCompras) {
        println(" - ${item.nome} (${item.quantidade})")
    }
}