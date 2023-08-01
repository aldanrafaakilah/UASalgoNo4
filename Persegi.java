class Persegi extends BentukGeometri {
    private double sisi;

    // Konstruktor
    public Persegi(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    // Implementasi metode untuk menghitung luas persegi
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}