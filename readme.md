
# Registro de Vehículos

En una empresa se necesita registrar información de vehículos; los mismos que pueden ser de 3 tipos: Autos, Camionetas y Camiones. Debe existir una sola clase `Vehículo` que permita obtener el costo de la matrícula (Definir los atributos necesarios), pero cada una de las subclases de `Vehículo` pueden especificar el cálculo del costo de la matrícula de manera diferente en cada uno de los vehículos según el tipo. 

No se puede saber de antemano la clase que se instanciará, ya que dependerá de un parámetro ingresado por el cliente.

## Atributos necesarios
- Tipo de Vehículo (Auto, Camioneta, Camión)
- Costo de la matrícula

## Subclases
- `Auto`: cálculo específico del costo de matrícula para autos.
- `Camioneta`: cálculo específico del costo de matrícula para camionetas.
- `Camión`: cálculo específico del costo de matrícula para camiones.

Cada subclase definirá su propio método para calcular el costo de matrícula.
