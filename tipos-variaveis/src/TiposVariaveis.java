public class TiposVariaveis {
  public static void main(String[] args) {
    
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;
    System.out.println(numeroCurto2);

    int numero = 5;
    numero = 10;

    System.out.println(numero);
  }
}
