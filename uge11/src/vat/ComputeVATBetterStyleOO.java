/*
 * FORMÅL:
 * At omskrive en procesorienteret løsning til en objektorienteret løsning
 *
 * OPGAVE:
 * Du skal forbedre denne kode ved at flytte de forskellige metoder
 * ud i passende klasser
 *
 * Fremgangsmåden er altså flg:
 * 1) kopier eksisterende kode
 * 2) gem hver metode i en klasse med passende naven (doDiag bliver til Dialog)
 * 3) åbn hver fil og sørg for passende "inventar" (fields, constructor and method)
 * 4) sørg for at lave en DogKennel.Main som kun rummer flg:
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runController();
    }
    *
    * TEST kørsel:
    * Indtast varens pris:
345,6
Du betaler 86,40 Kr i MOMS
*  5) Dokumenter programmet med et klassediagram - brug PlantUML
 *
 */
package vat;

/**
 * PlantUML code (or see classDiagram.png):
 * @startuml
 * Controller "1" *-- "1" View : has
 * Controller "1" *-- "1" Model : has
 * class Controller {
 *     - model : Model
 *     - view : View
 *     + run()
 * }
 *
 * class Model {
 *     + VAT() : double
 *     + getPrice() : double
 * }
 *
 * class View {
 *     + show(result : double)
 * }
 * @enduml
 */
public class ComputeVATBetterStyleOO {

    public static void main(String[] args){
        // runController();
        Controller controller = new Controller();
        controller.run();

    }
}
