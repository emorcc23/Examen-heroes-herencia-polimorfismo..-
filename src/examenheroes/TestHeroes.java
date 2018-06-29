/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenheroes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class TestHeroes {

    static ArrayList<Heroe> listaHeroes = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        crearHeroes();

        while (!salir) {
            System.out.println("\n\n\n\n\n");
            System.out.println("1-Consultar heroe");
            System.out.println("2-Modificar datos personales");
            System.out.println("3-Limpiar poderes");
            System.out.println("4-Salir");

            System.out.println("Elige una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    //Consultar heroe

                    System.out.println("¿Qúe heroe quieres elegir?");
                    for (int i = 0; i < listaHeroes.size(); i++) {
                        System.out.println(i + "- " + listaHeroes.get(i).getNombre());
                    }
                    int elegir = entrada.nextInt();
                    if (elegir == 0) {
                        //ALVARO
                        mostrarDatosHulk(elegir);
                    } else if (elegir == 1) {
                        //ISAIN
                        mostrarDatosSpiderman(elegir);
                    }
                    break;

                case 2:
                    //Modificar datos personales
                    System.out.println("¿Qúe heroe quieres elegir?");
                    for (int i = 0; i < listaHeroes.size(); i++) {
                        System.out.println(i + "- " + listaHeroes.get(i).getNombre());
                    }
                    elegir = entrada.nextInt();
                    if (elegir == 0) {
                        //ALVARO
                        mostrarDatosHulk(elegir);
                        modifyDatosHulk(elegir);
                    } else if (elegir == 0) {
                        //ISAIN
                        mostrarDatosSpiderman(elegir);
                        modifyDatosSpiderman(elegir);
                    }

                    break;
                case 3:
                    //Limpiar poderes
                    System.out.println("¿Qúe heroe quieres elegir?");
                    for (int i = 0; i < listaHeroes.size(); i++) {
                        System.out.println(i + "- " + listaHeroes.get(i).getNombre());
                    }
                    elegir = entrada.nextInt();
                    limpiarPoderes(elegir);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("No has pulsado una opción correcta.");

            }
        }

    }

    public static void crearHeroes() {
        String[] arrayPoderes1 = {"velocidad", "puñetazo", "agilidad", "destreza"};
        String[] arrayPoderes2 = {"trepar", "saltar", "lanzar tela de araña", "pelear"};

        Hulk heroe1 = new Hulk("alvaro", "verde", 20, arrayPoderes1, 80.5);
        Spiderman heroe2 = new Spiderman("isain", "araña", 25, arrayPoderes2);

        listaHeroes.add(heroe1);
        listaHeroes.add(heroe2);
    }

    public static void mostrarDatosHulk(int elegir) {
        System.out.println("Has elegido a " + listaHeroes.get(elegir).getNombre());
        System.out.println("Ahora vamos a mostrar sus datos\n");

        System.out.println("\t Nombre: " + listaHeroes.get(elegir).getNombre());
        System.out.println("\t Apodo: " + listaHeroes.get(elegir).getApodo());
        System.out.println("\t Edad: " + listaHeroes.get(elegir).getEdad());
        System.out.println("Sus poderes son: ");
        listaHeroes.get(elegir).showPoderes();
        if (listaHeroes.get(elegir) instanceof Hulk) {
            Hulk aux = (Hulk) listaHeroes.get(elegir);
            aux.getPeso();
            System.out.println("\t Peso: " + aux.getPeso());
            System.out.println("\t Potencia: " + listaHeroes.get(elegir).calcularPotencia(elegir));
        }
    }

    public static void limpiarPoderes(int elegir) {

        listaHeroes.get(elegir).showPoderes();
        System.out.println("¿Seguro que deseas borrar todos los poderes?");
        System.out.println("1- Si");
        System.out.println("2- No");
        int delete = entrada.nextInt();
        if (delete == 1) {
            listaHeroes.get(elegir).borrarPoderes();
            System.out.println("Poderes eliminados. Para comprobarlo, los muestro ");
            listaHeroes.get(elegir).showPoderes();
        } else {
            System.out.println("Bien hecho, mejor guarda tus poderes.");
        }
    }

    public static void mostrarDatosSpiderman(int elegir) {
        System.out.println("Has elegido a " + listaHeroes.get(elegir).getNombre());
        System.out.println("Ahora vamos a mostrar sus datos\n");

        System.out.println("\t Nombre: " + listaHeroes.get(elegir).getNombre());
        System.out.println("\t Apodo: " + listaHeroes.get(elegir).getApodo());
        System.out.println("\t Edad: " + listaHeroes.get(elegir).getEdad());
        System.out.println("Sus poderes son: ");
        listaHeroes.get(elegir).showPoderes();
        if (listaHeroes.get(elegir) instanceof Hulk) {
            Hulk aux = (Hulk) listaHeroes.get(elegir);
            System.out.println("\t Peso: " + aux.getPeso());

        }

        if (listaHeroes.get(elegir) instanceof Spiderman) {
            Spiderman auxi = (Spiderman) listaHeroes.get(elegir);
            System.out.println("Poder aracnido: " + auxi.isPoderAracnido());
            System.out.println("\t Potencia: " + listaHeroes.get(elegir).calcularPotencia(elegir));
        }
    }

    public static void modifyDatosHulk(int elegir) {
        System.out.println("Introduce el nombre del dato que quieres modificar");
        String modify = entrada.next();
        if (null != modify) {
            switch (modify) {
                case "nombre":
                case "NOMBRE":
                    System.out.println("Introduce tu nuevo nombre:");
                    String n = entrada.next();
                    listaHeroes.get(elegir).setNombre(n);
                    System.out.println("Modificado con exito");
                    break;
                case "apodo":
                    System.out.println("Introduce tu nuevo apodo:");
                    String a = entrada.next();
                    listaHeroes.get(elegir).setApodo(a);
                    System.out.println("Modificado con exito");
                    break;
                case "edad":
                    System.out.println("Introduce tu nueva edad:");
                    int ed = entrada.nextInt();
                    listaHeroes.get(elegir).setEdad(ed);
                    System.out.println("Modificado con exito");
                    break;
                case "poderes":
                case "poder":
                    System.out.println("Introduce el nombre de tu nuevo poder:");
                    String po = entrada.next();
                    System.out.println("¿En qué posicion quieres añadirlo?");
                    int pos = entrada.nextInt();
                    listaHeroes.get(elegir).setPoder(po, pos);
                    System.out.println("Modificado con exito");
                    break;
                case "peso":
                    System.out.println("Introdudce tu nuevo peso:");
                    int pe = entrada.nextInt();
                    if (listaHeroes.get(elegir) instanceof Hulk) {
                        Hulk aux = (Hulk) listaHeroes.get(elegir);
                        aux.setPeso(pe);
                        System.out.println("Modificado con exito");
                    } else {
                        System.out.println("No se ha podido moficiar ya que tu heroe no es HULK");
                    }
                    break;
                default:
                    System.out.println("Algo ha ido mal seleccionando heroe");
                    break;
            }
        }
    }

    public static void modifyDatosSpiderman(int elegir) {
        System.out.println("Introduce el nombre del dato que quieres modificar");
        String modify = entrada.next();
        if (null != modify) {
            switch (modify) {
                case "nombre":
                    System.out.println("Introduce tu nuevo nombre:");
                    String n = entrada.next();
                    listaHeroes.get(elegir).setNombre(n);
                    System.out.println("Modificado con exito");
                    break;
                case "apodo":
                    System.out.println("Introduce tu nuevo apodo:");
                    String a = entrada.next();
                    listaHeroes.get(elegir).setApodo(a);
                    System.out.println("Modificado con exito");
                    break;
                case "edad":
                    System.out.println("Introduce tu nueva edad:");
                    int ed = entrada.nextInt();
                    listaHeroes.get(elegir).setEdad(ed);
                    System.out.println("Modificado con exito");
                    break;
                case "poderes":
                    System.out.println("Introduce el nombre de tu nuevo poder:");
                    String po = entrada.next();
                    System.out.println("¿En qué posicion quieres añadirlo?");
                    int pos = entrada.nextInt();
                    listaHeroes.get(elegir).setPoder(po, pos);
                    System.out.println("Modificado con exito");
                    break;
                case "peso":
                    System.out.println("Introdudce el valor del poder aracnido:");
                    System.out.println("1- True");
                    System.out.println("2- False");
                    int pe = entrada.nextInt();
                    if (pe == 1) {
                        if (listaHeroes.get(elegir) instanceof Spiderman) {
                            Spiderman aux = (Spiderman) listaHeroes.get(elegir);
                            aux.setPoderAracnido(true);
                            System.out.println("Modificado con exito");
                        } else {
                            System.out.println("No se ha podido moficiar ya que tu heroe no es SPIDERMAN");
                        }
                    } else if (pe == 2) {
                        if (listaHeroes.get(elegir) instanceof Spiderman) {
                            Spiderman aux = (Spiderman) listaHeroes.get(elegir);
                            aux.setPoderAracnido(false);
                            System.out.println("Modificado con exito");
                        } else {
                            System.out.println("No se ha podido moficiar ya que tu heroe no es SPIDERMAN");
                        }
                    }

                    break;
                default:
                    System.out.println("Algo ha ido mal seleccionando heroe");
                    break;
            }
        }
    }

}
