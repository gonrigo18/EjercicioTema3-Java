public class EjercicioTema3 {
    public static void main(String[] args) {

        String[] palabra = {"Gonzalo","Delfina","Benjamin","Ciro"};
        String concatenacion = "";
        for (int j=0; j<palabra.length; j++){
            concatenacion = (concatenacion + " " + palabra[j]);
        }
        System.out.println(concatenacion);
        }
    }
