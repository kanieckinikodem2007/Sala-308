class KontoBankowe {
    private double saldo;

    void wplac(double kwota) {
        saldo += kwota;
    }

    void wyplac(double kwota) {
        if (saldo >= kwota) {
            saldo -= kwota;
        } else {
            System.out.println("Brak srodkow!");
        }
    }

    double getSaldo() {
        return saldo;
    }
}

