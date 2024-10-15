public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("cadeira", 100, 10, 5);

        produto.incluirItem(100);
        produto.excluirItem(90);
        produto.exibirDescricao();

    }
}