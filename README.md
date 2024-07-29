# HomeWork - SOLID y Patrones de Diseño
## Integrantes

-  Cristian Fernando Fuentes Restrepo
-  Eduardo Jose Salguero Ospina
-  Miguel Angel Cendales Reyes
-  Sergio Daniel Torres Linares
-  Jhon Alexander Vasquez Forero

## Principos SOLID corregidos

**S - Responsabilidad Única**
Dimos a cada metodo una funcionalidad única, brindando la dando mayor cohecion posible.
Las clases EmployeeManager y EmployeeOperations no cumplen con la responsabildad unica, por estos dos métdos:

```sh
    double calculateSalary(String name);
    void saveToFile(String name);
```

Los cuales separaramos en clases independientes con sus respectivas interfaces.

**O - Abierto/Cerrado**
- Clase Employee
No cumple con el principio de Open/Closed principle, dado que los atributos name y department están definidos como públicos, ademas de que 
- Clase ReportGenerator
Esta clase originalmente no cumple con este principio, dado que si se quisiera añadir funcionalidad, esta debería ser modificada. En su lugar, creamos una interfaz que puede ser implementada y permite que se creen diferentes tipos de reporte sin necesidad de que sea intervenida.

**L - Sustitución de Liskov**
Mejoramos este prinicpio en la clase Employee y PartTimeEmployee, ya que, originalmente, un objeto de la case Employee no podría ser reemplazado por uno de su subclase (PartTimeEmployee) sin sufrir inconvenientes.

**I - Segregación de la Interfaz**
La interfaz EmployeeOperations, fue segregada y se agrego la interfaz: IFileOperations y de la misma interfaz de EmployeeOperations extragimos a calculateSalary como caso de uso, lo vemos como ua operacion propia del negocio

**D - Inversión de Dependencias**
Se crearon "capas de datos" para manejar responsabilidades de procesos por separado y darle manejo a la INVERSION de depencias 

##  Patrones de Diseño

**Exercise 1:**
```
  Prototype
  Builder  
```
**Exercise 2:**
```
  Observer
```

**Exercise 3:**
```
  Template Method
```

**Exercise 4:**
```
  Command
```

**Exercise 5:**
```
  Decorator
```