# HomeWork - SOLID y Patrones de Diseño
## Integrantes

-  Cristian Fernando Fuentes Restrepo
-  Eduardo Jose Salguero Ospina
-  Miguel Angel Cendales Reyes
-  Sergio Daniel Torres Linares
-  Jhon Alexander Vasquez Forero

## Principos SOLID corregidos

**S - Responsabilidad Única**
Dimos a cada metodo una funcionalidad unica, brindadndo la dando mayor Cohecion posible.
estas clases: Clase EmployeeManager and EmployeeOperations no cumple con la responsabildad unica, por estos dos metdos:

```sh
    double calculateSalary(String name);
    void saveToFile(String name);
```

Los cuales separaremos en class indepencientes con sus respectivas interfaces  

**O - Abierto/Cerrado - Clasa Employee**
No cumple con el principio de Open/Closed principle, dado que los atributos name y department están definidos como públicos, ademas de que 

**L - Sustitución de Liskov**
Mejoramos este prinicpio en la clase Employee y PartTimeEmployee

**I - Segregación de la Interfaz**
La interfaz EmployeeOperations, fue segregada y se agrego la interfaz: IFileOperations y de la misma interfaz de EmployeeOperations extragimos a calculateSalary como caso de uso, lo vemos como ua operacion propia del negocio

**D - Inversión de Dependencias**
Se crearon "capas de datos" para manejar responsabilidades de procesos por separado y darle manejo a la INVERSION de depencias 
