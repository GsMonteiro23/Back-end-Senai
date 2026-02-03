//package //aula3;

import java.awt.image.ImagingOpException;//public class //ifEelse {
    static void main() {
        //  int //idade = 18;
        //if///(//idade <18){
        //       IO.println("Foi //arrado na porta");
        //   }else {
        //     IO.println("//Liberado");
        // }
        //}

///int nota1 = 10;
///int nota2 = 8;
///int nota3 = 6;

        Scanner sc = new Scanner(System.in);
        IO.println("digite sua nota 1"); //saida de texto no terminal//
        int nota1 = sc.nextInt();

        IO.println("digite sua nota 2");
        int nota2 = sc.nextInt();

        IO.println("digite sua nota3");
        int nota3 = sc.nextInt();

int media = (nota1 + nota2 + nota3) / 3; // calculo média
        IO.println(media);
if (media < 4) {
    IO.println("reprovado");
        }
if (media <=6) {
    IO.println("Recuperaçao");
}else{
    IO.println("Aprovado");
}
    }



