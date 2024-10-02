import java.util.Scanner;

public class Ativdade_4 {
    public static void main(String[] args) {
        //Declarando variaveis e o scanner
        Scanner sc = new Scanner(System.in);
        int n_pessoas = 0;
        int votos_taffe = 0;
        int votos_rodrigo = 0;
        int votos_lucas = 0;
        int votos_alessandro = 0;
        int confirma = 0;
        //Recolhendo o número de pessoas que irão votas
        System.out.println("Quantas pessoas irão votar?");
        n_pessoas = sc.nextInt();
        int voto = 0;
        for(int i = 0; i < n_pessoas; i++){
            //Usando o do-while para recolher os votos possiveis
            do{
                System.out.println("Numero de voto dos participantes: ");
                System.out.println("80 - Taffe; 70 - Rodrigo; 60 - Lucas; 50- Alessandro");
                System.out.println("Por favor, insira seu voto, Pessoa "+(i+1));
                voto = sc.nextInt();
                if(voto == 80 || voto == 70 || voto == 60|| voto == 50){
                    confirma = 0;
                    //Se os voto fore valido, sairá do loop do-while
                } else{
                    confirma = 1;
                    //Se os voto for invalido, não sairá do loop do-while
                    System.out.println("Este candidato não existe, por favor, tente novamente");
                }
            }while(confirma == 1);
            //Computa os votos de cada participante
            if(voto ==80){
                votos_taffe++;
            }else if(voto ==70){
                votos_rodrigo++;
            }else if(voto ==60){
                votos_lucas++;
            }else if(voto ==50){
                votos_alessandro++;
            }
        }
        //Compara entre eles quem tem o maior voto e anuncia o ganhador
        if(votos_taffe > votos_rodrigo && votos_taffe > votos_lucas && votos_taffe > votos_alessandro){
            System.out.println("O vencedor foi o taffe, com "+votos_taffe+" voto(s)");
        }else if(votos_rodrigo > votos_alessandro && votos_rodrigo > votos_lucas && votos_rodrigo > votos_taffe){
            System.out.println("O vencedor foi o rodrigo, com "+votos_rodrigo+" voto(s)");
        }else if(votos_alessandro > votos_lucas && votos_alessandro > votos_taffe && votos_alessandro > votos_rodrigo) {
            System.out.println("O vencedor foir alessandro, com "+votos_alessandro+" voto(s)");
        }else if(votos_lucas > votos_alessandro && votos_lucas > votos_taffe && votos_lucas > votos_rodrigo) {
            System.out.println("O vencedor foi lucas, com "+votos_lucas+" voto(s)");
        }else{
            System.out.println("Parece que ocorreu um empate, a votação terá que ser refeita!");
        }
    }
}
