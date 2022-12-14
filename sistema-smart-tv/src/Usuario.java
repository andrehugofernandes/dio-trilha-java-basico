public class Usuario {
  public static void main(String[] args) {
    
      SmartTv smartTv = new SmartTv();
      
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.aumentarVolme();
      System.out.println("Volume Atual: " + smartTv.volume);

      System.out.println("TV ligada? " + smartTv.ligada);
      System.out.println("Canal atual?  " + smartTv.canal);
      System.out.println("Volume atual? " + smartTv.volume);

      smartTv.ligar();
      System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);




  }
  
}
