package com.kirgo.complejos;

class Complejo {

    private double real, imaginario;

    public Complejo(double real, double imaginario) {
        this.real= real;
        this.imaginario=imaginario;
    }

    public String toString() {
        return real + "+" + imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo
     * @param v el complejo que sumamos
     */
    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }
}