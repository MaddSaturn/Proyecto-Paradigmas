/**
 * Clase usada para guardar las preguntas requeridas en el juego
 * En: Nov 15 de 2024
 *
 * @autor: Maria Paula Rodriguez Diaz
 * @documentador: Giancarlo Ramirez Pulido, David Perez Alvarado
 * @QA: Maria Paula Rodriguez Diaz, Giancarlo Ramirez Pulido, David Perez Alvarado
 * Desc: Crea las preguntas del juego para añadir, remover o modificar
 */

package org.example.Data;
/**
 * Pertenece al paquete Data
 */



import org.example.Models.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de la gestion de la informacion de las preguntas y puntajes
 */

public class Data {
    public static int individualPoints = 100;
    public static int multiplayerPoints = 50;
    public static int rightAnswerPoints = 10;
    public static int wrongAnswerPoints = 0;

    public static ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<Question>();

        
        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 1?",
                        List.of(
                                "99",
                                "1",
                                "89",
                                "47"
                        ),
                        "1"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 2?",
                        List.of(
                                "49",
                                "92",
                                "2",
                                "84"
                        ),
                        "2"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 3?",
                        List.of(
                                "3",
                                "97",
                                "31",
                                "40"
                        ),
                        "3"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 4?",
                        List.of(
                                "64",
                                "13",
                                "4",
                                "65"
                        ),
                        "4"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 5?",
                        List.of(
                                "85",
                                "21",
                                "5",
                                "34"
                        ),
                        "5"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 6?",
                        List.of(
                                "40",
                                "47",
                                "10",
                                "6"
                        ),
                        "6"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 7?",
                        List.of(
                                "62",
                                "7",
                                "54",
                                "63"
                        ),
                        "7"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 8?",
                        List.of(
                                "43",
                                "35",
                                "74",
                                "8"
                        ),
                        "8"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 1 X 9?",
                        List.of(
                                "96",
                                "44",
                                "51",
                                "9"
                        ),
                        "9"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 1?",
                        List.of(
                                "2",
                                "62",
                                "91",
                                "14"
                        ),
                        "2"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 2?",
                        List.of(
                                "4",
                                "24",
                                "96",
                                "72"
                        ),
                        "4"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 3?",
                        List.of(
                                "6",
                                "34",
                                "26",
                                "26"
                        ),
                        "6"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 4?",
                        List.of(
                                "11",
                                "41",
                                "8",
                                "83"
                        ),
                        "8"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 5?",
                        List.of(
                                "45",
                                "55",
                                "43",
                                "10"
                        ),
                        "10"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 6?",
                        List.of(
                                "24",
                                "12",
                                "1",
                                "41"
                        ),
                        "12"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 7?",
                        List.of(
                                "40",
                                "14",
                                "98",
                                "25"
                        ),
                        "14"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 8?",
                        List.of(
                                "45",
                                "57",
                                "16",
                                "21"
                        ),
                        "16"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 2 X 9?",
                        List.of(
                                "18",
                                "84",
                                "47",
                                "89"
                        ),
                        "18"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 1?",
                        List.of(
                                "5",
                                "50",
                                "15",
                                "3"
                        ),
                        "3"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 2?",
                        List.of(
                                "6",
                                "74",
                                "95",
                                "33"
                        ),
                        "6"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 3?",
                        List.of(
                                "9",
                                "87",
                                "8",
                                "40"
                        ),
                        "9"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 4?",
                        List.of(
                                "12",
                                "34",
                                "26",
                                "23"
                        ),
                        "12"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 5?",
                        List.of(
                                "52",
                                "87",
                                "44",
                                "15"
                        ),
                        "15"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 6?",
                        List.of(
                                "3",
                                "58",
                                "13",
                                "18"
                        ),
                        "18"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 7?",
                        List.of(
                                "11",
                                "87",
                                "21",
                                "44"
                        ),
                        "21"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 8?",
                        List.of(
                                "24",
                                "32",
                                "57",
                                "87"
                        ),
                        "24"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 3 X 9?",
                        List.of(
                                "29",
                                "27",
                                "39",
                                "53"
                        ),
                        "27"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 1?",
                        List.of(
                                "55",
                                "48",
                                "4",
                                "76"
                        ),
                        "4"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 2?",
                        List.of(
                                "19",
                                "60",
                                "8",
                                "39"
                        ),
                        "8"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 3?",
                        List.of(
                                "64",
                                "79",
                                "12",
                                "48"
                        ),
                        "12"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 4?",
                        List.of(
                                "51",
                                "16",
                                "14",
                                "65"
                        ),
                        "16"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 5?",
                        List.of(
                                "48",
                                "71",
                                "68",
                                "20"
                        ),
                        "20"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 6?",
                        List.of(
                                "24",
                                "41",
                                "98",
                                "78"
                        ),
                        "24"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 7?",
                        List.of(
                                "20",
                                "61",
                                "28",
                                "97"
                        ),
                        "28"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 8?",
                        List.of(
                                "32",
                                "57",
                                "16",
                                "74"
                        ),
                        "32"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 4 X 9?",
                        List.of(
                                "31",
                                "75",
                                "36",
                                "45"
                        ),
                        "36"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 1?",
                        List.of(
                                "70",
                                "15",
                                "68",
                                "5"
                        ),
                        "5"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 2?",
                        List.of(
                                "34",
                                "35",
                                "10",
                                "81"
                        ),
                        "10"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 3?",
                        List.of(
                                "15",
                                "77",
                                "55",
                                "21"
                        ),
                        "15"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 4?",
                        List.of(
                                "58",
                                "61",
                                "20",
                                "100"
                        ),
                        "20"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 5?",
                        List.of(
                                "57",
                                "25",
                                "5",
                                "27"
                        ),
                        "25"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 6?",
                        List.of(
                                "30",
                                "78",
                                "68",
                                "68"
                        ),
                        "30"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 7?",
                        List.of(
                                "35",
                                "29",
                                "55",
                                "20"
                        ),
                        "35"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 8?",
                        List.of(
                                "23",
                                "40",
                                "49",
                                "58"
                        ),
                        "40"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 5 X 9?",
                        List.of(
                                "45",
                                "75",
                                "91",
                                "73"
                        ),
                        "45"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 1?",
                        List.of(
                                "54",
                                "94",
                                "6",
                                "96"
                        ),
                        "6"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 2?",
                        List.of(
                                "64",
                                "23",
                                "67",
                                "12"
                        ),
                        "12"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 3?",
                        List.of(
                                "5",
                                "18",
                                "70",
                                "57"
                        ),
                        "18"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 4?",
                        List.of(
                                "44",
                                "60",
                                "24",
                                "24"
                        ),
                        "24"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 5?",
                        List.of(
                                "48",
                                "30",
                                "28",
                                "62"
                        ),
                        "30"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 6?",
                        List.of(
                                "6",
                                "71",
                                "35",
                                "36"
                        ),
                        "36"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 7?",
                        List.of(
                                "55",
                                "10",
                                "42",
                                "59"
                        ),
                        "42"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 8?",
                        List.of(
                                "27",
                                "48",
                                "31",
                                "23"
                        ),
                        "48"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 6 X 9?",
                        List.of(
                                "23",
                                "54",
                                "15",
                                "56"
                        ),
                        "54"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 1?",
                        List.of(
                                "19",
                                "7",
                                "75",
                                "91"
                        ),
                        "7"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 2?",
                        List.of(
                                "19",
                                "99",
                                "97",
                                "14"
                        ),
                        "14"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 3?",
                        List.of(
                                "4",
                                "14",
                                "21",
                                "100"
                        ),
                        "21"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 4?",
                        List.of(
                                "73",
                                "28",
                                "72",
                                "11"
                        ),
                        "28"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 5?",
                        List.of(
                                "35",
                                "14",
                                "44",
                                "60"
                        ),
                        "35"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 6?",
                        List.of(
                                "42",
                                "72",
                                "86",
                                "19"
                        ),
                        "42"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 7?",
                        List.of(
                                "39",
                                "15",
                                "37",
                                "49"
                        ),
                        "49"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 8?",
                        List.of(
                                "11",
                                "56",
                                "39",
                                "82"
                        ),
                        "56"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 7 X 9?",
                        List.of(
                                "61",
                                "63",
                                "41",
                                "3"
                        ),
                        "63"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 1?",
                        List.of(
                                "27",
                                "83",
                                "39",
                                "8"
                        ),
                        "8"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 2?",
                        List.of(
                                "70",
                                "91",
                                "16",
                                "77"
                        ),
                        "16"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 3?",
                        List.of(
                                "6",
                                "24",
                                "38",
                                "88"
                        ),
                        "24"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 4?",
                        List.of(
                                "32",
                                "89",
                                "62",
                                "78"
                        ),
                        "32"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 5?",
                        List.of(
                                "6",
                                "40",
                                "95",
                                "41"
                        ),
                        "40"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 6?",
                        List.of(
                                "58",
                                "8",
                                "48",
                                "90"
                        ),
                        "48"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 7?",
                        List.of(
                                "56",
                                "13",
                                "58",
                                "16"
                        ),
                        "56"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 8?",
                        List.of(
                                "41",
                                "64",
                                "85",
                                "64"
                        ),
                        "64"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 8 X 9?",
                        List.of(
                                "80",
                                "11",
                                "72",
                                "11"
                        ),
                        "72"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 1?",
                        List.of(
                                "3",
                                "9",
                                "22",
                                "26"
                        ),
                        "9"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 2?",
                        List.of(
                                "18",
                                "18",
                                "32",
                                "6"
                        ),
                        "18"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 3?",
                        List.of(
                                "47",
                                "27",
                                "55",
                                "54"
                        ),
                        "27"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 4?",
                        List.of(
                                "36",
                                "83",
                                "94",
                                "19"
                        ),
                        "36"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 5?",
                        List.of(
                                "45",
                                "43",
                                "33",
                                "18"
                        ),
                        "45"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 6?",
                        List.of(
                                "54",
                                "83",
                                "66",
                                "24"
                        ),
                        "54"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 7?",
                        List.of(
                                "63",
                                "58",
                                "80",
                                "47"
                        ),
                        "63"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 8?",
                        List.of(
                                "72",
                                "37",
                                "92",
                                "58"
                        ),
                        "72"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 9 X 9?",
                        List.of(
                                "46",
                                "81",
                                "76",
                                "35"
                        ),
                        "81"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 1?",
                        List.of(
                                "10",
                                "62",
                                "20",
                                "33"
                        ),
                        "10"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 2?",
                        List.of(
                                "36",
                                "5",
                                "20",
                                "81"
                        ),
                        "20"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 3?",
                        List.of(
                                "30",
                                "36",
                                "61",
                                "58"
                        ),
                        "30"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 4?",
                        List.of(
                                "100",
                                "40",
                                "19",
                                "9"
                        ),
                        "40"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 5?",
                        List.of(
                                "80",
                                "9",
                                "50",
                                "96"
                        ),
                        "50"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 6?",
                        List.of(
                                "1",
                                "77",
                                "60",
                                "31"
                        ),
                        "60"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 7?",
                        List.of(
                                "81",
                                "49",
                                "70",
                                "68"
                        ),
                        "70"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 8?",
                        List.of(
                                "79",
                                "36",
                                "5",
                                "80"
                        ),
                        "80"
                )
        );  
        

        questions.add(new
                Question(
                        "¿Cuál es el producto de la multiplicación 10 X 9?",
                        List.of(
                                "85",
                                "98",
                                "21",
                                "90"
                        ),
                        "90"
                )
        );  
        


        return questions;
    }

}
