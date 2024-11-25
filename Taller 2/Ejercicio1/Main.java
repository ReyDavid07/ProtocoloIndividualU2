public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Asus", 1500);
        producto.mostrarProducto();

        producto.setNombre("Iphone");
        producto.setPrecio(800);
        System.out.println("\nActualización del producto:");
        producto.mostrarProducto();
    }
}
