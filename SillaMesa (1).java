public class Silla implements Producto {
    @Override
    public void crear() {
        System.out.println("Se ha creado una silla.");
    }
}

public class Mesa implements Producto {
    @Override
    public void crear() {
        System.out.println("Se ha creado una mesa.");
    }
}