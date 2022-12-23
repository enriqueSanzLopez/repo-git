package ejercicio131;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos 2 clientes
		Cliente c1=new Cliente("Paco Perez", "666301220");
		Cliente c2=new Cliente("Gareth Bale", "654122322");
		//Creamos 2 mesas
		Mesa m1=new Mesa(2, "Terraza");
		Mesa m2=new Mesa(4, "Comedor interno");
		//Creo un restaurante y monto las 2 mesas
		Restaurante res1=new Restaurante("Bazofia para todos", "654312450");
		res1.montarMesa(m1);
		res1.montarMesa(m2);
		//Listamos las 2 mesas y deberían estar libres
		System.out.println("-Listado de las mesas:");
		res1.listarMesas();
		//Hago las reservas de las 2 mesas
		Reserva r1=new Reserva("01/06/2020", 20, 2, m1, c1);
		Reserva r2=new Reserva("01/06/2020", 22, 4, m2, c2);
		//Obtenemos los datos de la mesa de la terraza, ahora está ocupada
		System.out.println("-Estado de la mesa del comedor interno:");
		System.out.println(m2.obtenerDatosMesa());
		//Damos de alta 3 ingredientes
		Ingrediente in1=new Ingrediente("tomate", 100);
		Ingrediente in2=new Ingrediente("spaghetti", 200);
		Ingrediente in3=new Ingrediente("queso", 30);
		//Creamos un plato con esos 3 ingredientes
		Plato p1=new Plato("Spaghetti al plato");
		p1.anyadir_ingrediente(in1);
		p1.anyadir_ingrediente(in2);
		p1.anyadir_ingrediente(in3);
		System.out.println("-Ingredientes de los spaghetti:");
		System.out.println(p1.consultar_ingredientes());
		//Creamos otro plato con 2 ingredientes de antes y uno nuevo
		Plato p2=new Plato("Pizza barbacoa");
		Ingrediente in4=new Ingrediente("carne picada", 300);
		p2.anyadir_ingrediente(in1);
		p2.anyadir_ingrediente(in3);
		p2.anyadir_ingrediente(in4);
		System.out.println("-Ingredientes de la pizza:");
		System.out.println(p2.consultar_ingredientes());
		//Creamos un último plato con un nuevo ingrediente
		Plato p3=new Plato("Entrecot con salsa de queso");
		Ingrediente in5=new Ingrediente("entrecot", 500);
		p3.anyadir_ingrediente(in5);
		p3.anyadir_ingrediente(in3);
		System.out.println("-Ingredientes del entrecot:");
		System.out.println(p3.consultar_ingredientes());
		//Desde la mesa m1 se piden los 3 platos creados anteriormente
		m1.pedirPlato(p1);
		m1.pedirPlato(p2);
		m1.pedirPlato(p3);
		//Resumimos los 3 platos que se han pedido en esa mesa
		System.out.println("-Platos pedidos de la primera mesa:");
		m1.detalle_platos();
		//Piden la factura de la mesa y se van
		System.out.println("-La mesa ha gastado: "+m1.calcular_factura()+"€ y se van.");
		m1.liberarMesa();
		//La segunda mesa pide 4 entrecots
		m2.pedirPlato(p3);
		m2.pedirPlato(p3);
		m2.pedirPlato(p3);
		m2.pedirPlato(p3);
		System.out.println("-Platos pedidos de la segunda mesa:");
		m2.detalle_platos();
		//Piden la factura de la mesa y se van
		System.out.println("-La mesa ha gastado: "+m2.calcular_factura()+"€ y se van.");
		m2.liberarMesa();
		//Comprobamos el total de la caja
		System.out.println("El restaurante ha facturado: "+res1.calcular_caja()+"€.");
		res1.listarMesas();
		//Al finalizar el día desmontamos las mesas
		//Empezamos recogiendo la mesa m1
		res1.recogerMesa(m1);
		//Si listamos las mesas solo nos aparece la mesa m2, y que la m1 la hemos recogido
		res1.listarMesas();
		//Recogemos la mesa m2
		res1.recogerMesa(m2);
		//Comprobamos que todas las mesas están recogidas.
		//Esta llamada devuelve el mensaje "Todas las mesas están recogidas"
		res1.listarMesas();
	}
}