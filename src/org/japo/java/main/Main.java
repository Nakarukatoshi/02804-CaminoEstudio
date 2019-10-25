/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        final double CAMINO = 980;

        //Variables
        double traslado;
        double jornadas;

        //Recorrido diario
        System.out.print("Desplazamiento diario...: ");

        //Bloque principal
        try {
            //Entrada del usuario
            traslado = SCN.nextDouble();

            //Las jornadas necesarias
            jornadas = CAMINO / traslado;

            //Salida
            System.out.printf(Locale.ENGLISH,
                    "Días de Clases / Camino...: %d%n",
                    (int) jornadas < jornadas
                            ? (int) jornadas + 1
                            : (int) jornadas);
        } catch (Exception e) {
            System.out.println("Valor no válido.");
        }
    }
}
