# Reto 3

## Diagrama UML

| ![UML_Diagram](https://github.com/gasiferox/Grupo43_GustavoRomeroNocua/blob/main/Reto_3/UML/Reto_3_UML_v2.jpg) |
|:--:|
| *Figura 1 - UML resultante del planteamiento del problema* |

## Diagrama de Interfaces

| ![Interfaces_Diagram](https://github.com/gasiferox/Grupo43_GustavoRomeroNocua/blob/main/Reto_3/UML/Reto_3_Interfaces.jpg) |
|:--:|
| *Figura 2 - INTERFACES planteadas para la capa vista* |


## Avance del proyecto

25JUL21 --> Se inicia el trabajo con el reto 3, se define la [primera versión del UML](https://github.com/gasiferox/Grupo43_GustavoRomeroNocua/blob/main/Reto_3/UML/Reto_3_UML_v1.jpg).

27JUL21 --> Se definen los paquetes del proyecto, se modifica el UML y se inicial con el trabajo del Cliente por medio del modelo vista y ejecutando la acción de añadir clientes.

08AGO21 --> Se inicia un nuevo planteamiento y se definen las [interfaces](https://github.com/gasiferox/Grupo43_GustavoRomeroNocua/blob/main/Reto_3/UML/Reto_3_Interfaces.jpg) a ser utilizadas.

## Enunciado

Se requiere un software para la gestión de pedidos. Dicho software debe cumplir con una serie de requerimientos que se enumeran a continuación:

1. Administrar clientes (nombre, dirección, teléfono celular y correo electrónico), los cuales realizan pedidos de productos, de los cuales se anota la cantidad en el inventario. Un cliente puede asociar previamente una o varias cuentas desde donde se  realiza el pago de los pedidos. Cada cuenta está asociada a una tarjeta de crédito, y tiene una cierta cantidad disponible de dinero, que el cliente debe aumentar periódicamente para poder realizar nuevos pedidos.

2. Un cliente puede empezar a realizar un pedido sólo si tiene alguna cuenta con dinero disponible. Al realizar un pedido, un cliente puede agruparlos en pedidos simples o compuestos. Los pedidos simples están asociados a una sola cuenta de pago y (por restricciones en la distribución) contienen un máximo de 20 unidades del mismo o distinto tipo de producto. A su vez, un pedido compuesto contiene dos o más pedidos, que pueden ser simples o compuestos. Como es de esperar, el sistema debe garantizar que todos los pedidos simples que componen un
pedido compuesto se paguen con cuentas del mismo cliente. Además, sólo es posible realizar peticiones de productos que existan en el inventario.

3. Existe una clase (de la cual debe haber una única instancia en la aplicación) responsable del cobro, orden de distribución y conﬁrmación de los pedidos. El cobro de los pedidos se hace una vez al día, y el proceso consiste en comprobar todos los pedidos pendientes de cobro, y cobrarlos de la cuenta de pago correspondiente. Si una cuenta no tiene suﬁciente dinero, el
pedido se rechaza (si es parte de un pedido compuesto, se rechaza el pedido entero). Una vez que el pedido está listo para enviarse, se ordena su distribución, y una vez entregado, pasa a
estar conﬁrmado.

A partir de lo anterior, la solución en UML se plantea en la [figura 1](https://github.com/gasiferox/Grupo43_GustavoRomeroNocua/blob/main/Reto_3/UML/Reto_3_UML_v2.jpg).  El reto consiste en desarrollar un proyecto Java con base en el diagrama UML de la ﬁgura 1, cumpliendo con la estandarización que se ha explicado y deﬁniendo una arquitectura MVC básica para que más adelante se pueda gestionar los datos en el ﬂujo deﬁnido en el mismo diagrama y en los requerimientos de la lista anterior.
