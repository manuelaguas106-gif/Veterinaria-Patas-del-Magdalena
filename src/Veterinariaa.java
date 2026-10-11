public class Veterinariaa {
    public static void main(String[] args) {

        Mascota[] mascotas = {
                new Mascota("Luna", "Perro", 28.5, 9),
                new Mascota("Michi", "Gato", 4.2, 3),
                new Mascota("Rocky", "Perro", 12.0, 5),
                new Mascota("Pepa", "Conejo", 2.1, 1)
        };

        int totalRecaudado = 0;

        for (Mascota mascota : mascotas) {
            System.out.println(mascota.descripcion());
            System.out.println("Valor de consulta: $"
                    + mascota.valorConsulta());
            System.out.println("-------------------------");

            totalRecaudado += mascota.valorConsulta();
        }

        System.out.println("Total recaudado: $" + totalRecaudado);

        System.out.println("\nPrueba del peso negativo:");

        Mascota michi = mascotas[1];
        michi.setPeso(-3);

        System.out.println(michi.descripcion());
    }
}
