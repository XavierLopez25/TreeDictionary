import Controller.FactoryTree;
import Controller.ReadFile;
import Model.TreeStructure;
import Model.Word;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            // Lectura de archivos
            ArrayList<Word> diccionario = new ArrayList<>();
            ArrayList<String> verificar = new ArrayList<>();
            ArrayList<String> lineas = ReadFile.readLines("C:\\Users\\Xavier\\Documents\\IntelliJ-Projects\\TreeDictionary\\src\\Spanish.txt");
            ArrayList<String> oraciones = ReadFile.readLines("C:\\Users\\Xavier\\Documents\\IntelliJ-Projects\\TreeDictionary\\src\\Text.txt");

            // Creación del diccionario
            for (String palabras : lineas) {
                String[] palabra = palabras.split(",");
                diccionario.add(new Word(palabra[0], palabra[1]));
                verificar.add(palabra[0]);
            }

            // Creación del árbol
            Scanner sc = new Scanner(System.in);
            FactoryTree factory = new FactoryTree();
            System.out.println("¿Qué tipo de árbol desea usar?: \n1. RBT \n2. SPT \n3. BST\n4. AVL Tree");
            String tipo = sc.nextLine();
            TreeStructure<Word> arbol = factory.getInstance(tipo);
            for (Word val1 : diccionario) {
                arbol.add(val1);
            }

            // Traducción de las oraciones
            for (String oracion : oraciones) {
                String[] oracionSeparada = oracion.split(" ");
                ArrayList<String> oracionTraducida = new ArrayList<>();
                String traduccion = "";
                for (String individual : oracionSeparada) {
                    if (verificar.contains(individual)) {
                        Word val2 = arbol.get(new Word(individual, ""));
                        oracionTraducida.add(val2.getSpanish());
                    } else {
                        String val3 = "*" + individual + "*";
                        oracionTraducida.add(val3);
                    }
                }
                for (String palabra : oracionTraducida) {
                    traduccion = traduccion + palabra + " ";
                }
                System.out.println("Oración traducida: ");
                System.out.println(traduccion);
            }
        }
    }