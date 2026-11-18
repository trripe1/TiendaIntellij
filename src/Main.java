/**
 * Programa principal de la tienda.
 */
public class Main {

    public static void main(String[] args) {
        Producto teclado = new Producto("Teclado", 25.00, 10);
        Producto raton = new Producto("Ratón", 12.50, 5);
        Producto monitor = new Producto("Monitor", 149.99, 2);

        Carrito carrito = new Carrito();
        carrito.anadir(teclado, 1);
        carrito.anadir(raton, 2);
        if (!carrito.anadir(monitor, 3)) {
            System.out.println("No hay stock suficiente de " + monitor.getNombre());
        }

        carrito.mostrarTicket();
    }
}
