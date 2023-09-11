public class Main {
    public static void main(String[] args) {
        FabricaProductos fabricaSillas = new FabricaSillas();
        Producto silla = fabricaSillas.crearProducto();
        silla.crear();

        FabricaProductos fabricaMesas = new FabricaMesas();
        Producto mesa = fabricaMesas.crearProducto();
        mesa.crear();
    }
}