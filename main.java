package Ejercicio3_Pedidos;

public class main {

    public static void  ImprimirEstado(EstadoPedido pedido){
        switch (pedido) {
            case PENDIENTE:
                System.out.println("Tu pedido esta " + pedido);
                break;
            case EN_PROCESO:
                System.out.println("Tu pedido esta " + pedido);
                break;
            case ENVIADO:
                System.out.println("Tu pedido esta " + pedido);
                break;
            case ENTREGADO:
                System.out.println("Tu pedido esta " + pedido);
                break;
            case CANCELADO:
                System.out.println("Tu pedido esta " + pedido);
                break;
            default:
                System.out.println("Tu pedido esta perdido");
                break;
        }
    }
    public static void main(String[] args) {
        EstadoPedido a = EstadoPedido.PENDIENTE;
        EstadoPedido b = EstadoPedido.PENDIENTE;
        EstadoPedido c = EstadoPedido.PENDIENTE;

        System.out.println("Tus pedidos estan pendientes");
        a = EstadoPedido.EN_PROCESO;
        b = EstadoPedido.CANCELADO;
        c = EstadoPedido.ENTREGADO;

        ImprimirEstado(a);
        ImprimirEstado(b);
        ImprimirEstado(c);


    }
}