public abstract class BentukGeometri {
    String nama;

    void setNama (String nama) {
        this.nama = nama; 
    }
    
String getNama() {
    return this.nama;
}

abstract float getArea();

}