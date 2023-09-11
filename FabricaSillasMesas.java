public class FabricaSillas implements FabricaProductos {
    @Override
    public Producto crearProducto() {
        return new Silla();
    }
}

public class FabricaMesas implements FabricaProductos {
    @Override
    public Producto crearProducto() {
        return new Mesa();
    }
}