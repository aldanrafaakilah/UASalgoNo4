class PersegiPanjang extends BentukGeometri {
    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(String nama, double panjang, double lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi metode untuk menghitung luas persegi panjang
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}