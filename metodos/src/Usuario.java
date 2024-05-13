public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);

        smartTV.mudarCanal(13);

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV ligada? " + smartTV.ligada);

    }
}
