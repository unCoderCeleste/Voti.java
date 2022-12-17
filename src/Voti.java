import java.util.*;
public class Voti {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        float votoNum;
        System.out.println("Inserisca il voto: A / B / C / D / F");
        char votoLett= reader.next().charAt(0);
        System.out.println();
        switch (votoLett){
            case 'A':
            case 'a':
                votoNum=4.0f;
                break;
            case 'B':
            case 'b':
                votoNum=3.0f;
                break;
            case 'C':
            case 'c':
                votoNum=2.0f;
                break;
            case 'D':
            case 'd':
                votoNum=1.0f;
                break;
            case 'F':
            case 'f':
                votoNum=0.0f;
                break;
            default:
                votoNum=0.0f;
                System.out.println("Errore. Il voto deve essere compreso fra le lettere sopra menzionate.");
            }
        System.out.println("Hai inserito: "+votoLett +". Il voto numerico è: "+votoNum);
        }
    }