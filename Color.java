public enum Color {
    ROJO("#FF0000",1),
    VERDE("#00FF00",2),
    AZUL("#0000FF",3);

    // Atributo del enum
    private String codigoHex;
    private int num;

    // Constructor
    Color(String codigo,int num) {
        this.codigoHex = codigo;
        this.num = num;
    }

    // Método para obtener el código
    public String getCodigo() {
        return this.codigoHex;
    }

    // Método para obtener el numero
    public int getNum() {
        return this.num;
    }
}
