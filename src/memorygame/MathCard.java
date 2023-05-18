/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Clase que implementa una carta matemática.
 *
 * @author Miguel Bastos Gándara.
 */
public class MathCard extends Card {

    private int operator1;
    private int operator2;
    private char operation;

    /**
     * Hace referencia al operador suma.
     */
    public static final char SUM = '+';

    /**
     * Hace referencia al operador resta.
     */
    public static final char SUB = '-';

    /**
     * Hace referencia al operador multiplicación.
     */
    public static final char MULT = '*';

    /**
     * Hace referencia al tipo de la carta operación.
     */
    public static final int CARD_OPERATION = 0;

    /**
     * Hace referencia al tipo de la carta resultado.
     */
    public static final int CARD_RESULT = 1;

    /**
     * Constructor de la clase MathCard.
     *
     * @param operator1 Primer número a operar.
     * @param operator2 Segundo número a operar.
     * @param operation Tipo de operación.
     * @param cardType Tipo de la carta.
     */
    public MathCard(int operator1, int operator2, char operation, int cardType) {
        super("");
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operation = operation;
        if (cardType == CARD_OPERATION) {
            this.text = Integer.toString(operator1) + "" + operation + "" + Integer.toString(operator2);
        } else {
            this.text = Integer.toString(getValue());
        }
    }

    private int getValue() {
        int result = 0;
        switch (operation) {
            case SUM:
                result = operator1 + operator2;
                break;
            case SUB:
                result = operator1 - operator2;
                break;
            case MULT:
                result = operator1 * operator2;
                break;
            default:
                break;
        }
        return result;
    }

    /**
     * Método que comprueba si dos cartas forman una pareja.
     *
     * @param card Carta a checkear.
     * @return True si hace pareja, false si no.
     */
    @Override
    public boolean isEquals(Card card) {
        return card instanceof MathCard && getValue() == ((MathCard) card).getValue();
    }

}
