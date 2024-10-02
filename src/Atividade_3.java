import java.util.Arrays;
import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        //Declaração de variaveis e importação do scan
        Scanner sc = new Scanner(System.in);
        int nota_boa = 0;
        int nota_ruim = 0;
        int quant_cars = 0;
        //Pegando a quantidade de carros que serão avaliados
        System.out.println("Informe a quantidade de carros");
        quant_cars = sc.nextInt();
        //Criando um vetor com tamanho igual a quantidade de carros
        Double[] avalia_carros = new Double[quant_cars];
        //Iniciando a avaliação dos carros
        for(int i = 0; i < quant_cars; i++){
            //Iniciando um do-while, que salva as avaliações dos carros, avisa caso esteja fora do limite e salva as notas boas e ruins
            do{
                System.out.println("Informe a nota do "+(i+1)+"º carro (1-10)");
                avalia_carros[i] = sc.nextDouble();
                if(avalia_carros[i]>10 || avalia_carros[i]<0){
                    System.out.println("Nota acima ou abaixo do limite dado, por favor, insira novamente");
                    //Avisa caso a nota for digitada errada
                }
                if(avalia_carros[i]>=6 && avalia_carros[i]<=10){
                    nota_boa++;
                    //Salva as notas boas
                } else if (avalia_carros[i]>=0 && avalia_carros[i]<6) {
                    nota_ruim++;
                    //Salva as notas ruins
                }
            }while(avalia_carros[i]>10 || avalia_carros[i]<0);
        }
        //Abaixo as informações obtidas
        System.out.println("A quantidade de carros avaliados foram: "+quant_cars);
        System.out.println("A quantidade de notas boas (=>6) forma: "+nota_boa);
        System.out.println("A quantidade de notas ruins (<6) forma: "+nota_ruim);


    }
}
