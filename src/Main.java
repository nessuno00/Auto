
    public class Main  {

    public static void main(String[] args) {
        // Creazione di un oggetto Auto
        Auto auto = new Auto(2000, "AB123CD", "Fiat", "Panda");
Auto auto1 = new Auto(1000,"DEG20V","Porsche","Turbo GT");

        // Utilizzo dei getter per ottenere informazioni sull'auto
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
        System.out.println("Cilindrata: " + auto.getCilindrata());
        System.out.println("Targa: " + auto.getTarga());

        // Utilizzo dei setter per modificare le informazioni sull'auto
        auto.setCilindrata(1800);
        auto.setModello("500");

        System.out.println("\nDati modificati:");
        System.out.println("Modello: " + auto.getModello());
        System.out.println("Cilindrata: " + auto.getCilindrata());


        System.out.println("\nMarca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());

        auto1.setModello("Aereo");
        auto1.setMarca("Jeep");
        auto1.setCilindrata(3000);

        System.out.println("\nDati modificati");


        System.out.println("\nMarca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Cilindrata: " + auto1.getCilindrata());



    }
}