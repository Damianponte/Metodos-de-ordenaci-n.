import java.util.Random;


public class algoritmosdeordenacion
{
    //Esta clase NO tiene main - no se ejecuta por sí misma.
    //La vamos a usar para guardar métodos/funciones que hacen diversos tipos de ordenación.
    //Esta clase tiene que tener los siguientes 4 métodos "public static":
    //insert.
    // Parámetros de entrada: un array de enteros que tendrá que ordenar.
    //Parámetro de salida: un nuevo array con el array original ordenado.
    //Funcionamiento: algoritmo de inserción.

            public static  int []insert(int[] numero) {   //copiamos array para no perder el original//
                int[] ordenado = numero.clone();

                // Algoritmo de inserción
                for (int i = 1; i < ordenado.length; i++) {
                    int key = ordenado[i];
                    int j = i - 1;

                    //movemos los elementos mayores a key una posicion a la derecha
                    while (j >= 0 && ordenado[j] > key)
                    {
                        ordenado[j + 1] = ordenado[j];
                        j--;
                    }
                    ordenado[j + 1] = key;
                }
                return ordenado;
            }

            public static int[] burbuja(int[] numero)
            {int[]arrayOrdenada=numero.clone();
                for(int i=0;i< numero.length;i++)
                {
                    for(int j=0;j< arrayOrdenada.length - 1;j++)
                    {
                        if(arrayOrdenada[j]>arrayOrdenada[j +1]){
                            int temp=arrayOrdenada[j];
                            arrayOrdenada[j]=arrayOrdenada[j+1];
                            arrayOrdenada[j+1]=temp;

                        }
                    }
                }
                return arrayOrdenada;
            }

    public static void main(String[] arg)
    {

        boolean mostrarResultados = false;

        //array que vamos a ordenar
        int[] numero =new int[50000];
        Random random=new Random();
        for (int i=0;i< numero.length;i++)
            numero[i]= random.nextInt(100000);
        // vamos a buscar el tiempo que tarda

        long tiempoInicioInserccion = System.currentTimeMillis();
        int[] ordenado=insert(numero);
        long tiempofinInserccion = System.currentTimeMillis();
        long transcurridoInserccion=tiempofinInserccion - tiempoInicioInserccion;
        System.out.println("el tiempo transcurrido es:" + transcurridoInserccion + " en ms");

        System.out.print("Array original: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }

        System.out.println();
        // parte ordenacion por inserccion
        System.out.print("Array ordenado(inserccion): ");
        for (int i=0;i< ordenado.length;i++) {
            System.out.print(ordenado[i] + " ");
        }

        System.out.print("\n");
        // parte ordenacion por burbuja
        long tiempoInicioBurbuja = System.currentTimeMillis();
        //ponemos la funcion antes y despues
       int [] arrayordenada=burbuja(numero);
        long tiempoFinBurbuja=System.currentTimeMillis();
        long transcurridoBurbuja=tiempoFinBurbuja-tiempoInicioBurbuja;
        System.out.println("el tiempo transcurrido es:" + transcurridoBurbuja + " en ms");

        System.out.print("array ordenada (burbuja) ");

        for(int i = 0; i < arrayordenada.length;i++)
        {
            System.out.print(arrayordenada[i] + " ");
        }


    }

}
