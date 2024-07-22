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
Viola el principio de Open/Closed principle, dado que los atributos name y department están definidos como públicos, ademas de que 

**L -Sustitución de Liskov**

**I -Segregación de la Interfaz**

**D -Inversión de Dependencias**
