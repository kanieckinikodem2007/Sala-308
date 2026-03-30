class Samochod {
    String marka;
    String model;
    int rokProdukcji;

    Samochod(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    void wyswietlInfo() {
        System.out.println(marka + " " + model + " " + rokProdukcji);
    }
}

