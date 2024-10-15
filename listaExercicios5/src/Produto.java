public class Produto {

    private  String descricao;
    private  int estoqueMaximo;
    private  int estoqueMinimo;
    private  int quantidade;
    private int estoqueAtual;

    //construtor do produto
    public Produto(String descricao, int estoqueMaximo, int estoqueMinimo, int quantidade) {

        if (estoqueMaximo <= estoqueMinimo) {
            throw new IllegalArgumentException("O estoque máximo deve ser maior que o estoque mínimo.");
        }

        this.descricao = descricao;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
        this.quantidade = quantidade;
        this.estoqueAtual = 0;
    }

    //Deve a realizar a inclusão de n itens no estoque. Para ser realizada a inclusão deverá ser verificado
    //se o número de produtos em estoque, não ultrapassará o número de estoque máximo do produto. Caso isso
    //aconteça a operação não deverá ser executada e deverá ser exibido ao usuário quantos itens ele ainda pode incluir
    //no estoque.

    public int incluirItem(int quantidade){
        int podeAdicionar = estoqueMaximo - estoqueAtual;

        System.out.println("Inserindo itens");

        if(quantidade + estoqueAtual <= estoqueMaximo){
            this.estoqueAtual += quantidade;
            System.out.println("Itens inseridos com sucesso. Estoque atual: " + estoqueAtual);
        }else{
           System.out.println("Pode ser adicionado somente: " + podeAdicionar + " unidades desse produto");
        }
        alertaMaximo();
        return estoqueAtual;
    }

    //Deve a realizar a exclusão de n itens no estoque. Para ser realizada a exclusão deverá ser
    //verificado se o número de produtos em estoque, não ultrapassará o número de estoque mínimo do produto. Caso
    //isso aconteça a operação não deverá ser executada e deverá ser exibido ao usuário quantos itens ele ainda pode
    //excluir no estoque

    public int excluirItem (int quantidade){
        int podeExcluir = estoqueAtual - estoqueMinimo;

        System.out.println("Excluindo itens");

        if(estoqueAtual - quantidade >= estoqueMinimo){
            this.estoqueAtual -= quantidade;
            System.out.println("Itens excluidos com sucesso. Estoque atual: " + estoqueAtual);
        }else{
            System.out.println("Pode ser excluidos somente: " + podeExcluir + " unidades desse produto");
        }
        alertaMinimo();
        return estoqueAtual;
    }

    public void alertaMaximo (){
        if(estoqueAtual == estoqueMaximo){
            System.out.println("Estoque maximo atingido " + estoqueMaximo);
        }
    }
    public void alertaMinimo (){
        if(estoqueAtual == estoqueMinimo){
            System.out.println("Estoque minimo atingido " + estoqueMinimo);
        }
    }

    public void exibirDescricao(){
        System.out.println("Descricao: " + descricao);
        System.out.println("Estoque maximo: " + estoqueMaximo);
        System.out.println("Estoque minimo: " + estoqueMinimo);
        System.out.println("Estoque atual: " + estoqueAtual);
    }

}
