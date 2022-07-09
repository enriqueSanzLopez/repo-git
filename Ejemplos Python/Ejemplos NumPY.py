import numpy as np;
#Inicializar arrays con un tipo de dato específico
a=np.array([1,2,3], dtype='int16');
print(a);
b=np.array([[9.0,8.0,7.0],[6.0,5.0,4.0]]);
print(b);
#Conseguir el número de dimensiones de un array
print(b.ndim);
#Obtener la forma de un array
print(b.shape);
#Obtener el tipo de array
print(b.dtype);
#Obtener el espacio de memoria que ocupa en bytes de un elemento
print(b.itemsize);
#Conseguir un valor específico del array
print(b[1,2]);
#Conseguir una fila específica
print(b[0, :]);
#Conseguir una columna específica
print(b[:,2]);
#Iniciailizar un array a 0
c=np.zeros(5);
print(c);
#Inicializar un array a 1
c=np.ones(5);
print(c);
#Inicializar un array a cualquier valor
c=np.full(5, 2);
print(c);
#Inicializar un array con valores aleatorios
d=np.random.rand(4,2);
print(d);
#Inicializar un array con valores aleatorios para que tenga la
#misma forma que otro array
e=np.random.random_sample(b.shape);
print(e);
#Inicializar un array con valores aleatorios enteros
f=np.random.randint(4,7, size=(3,3));
print(f);
#Inicializar un array de identidad
g=np.identity(3);
print(g);
#Guardar el mismo array repetido n veces en otro array
h=np.repeat(a,3);
print(h);
#Cargar un array desde un txt
i=np.genfromtxt('Ejemplo.txt', delimiter=',');
print(i);
#Pasar un array de float a entero
i=i.astype('int32');
print(i);
#Averiguar las posiciones de los valores mayores que 4
print(i>4);
#Seleccionar los valores mayores que 4 en un array
print(i[i>4]);
#Comprobar si hay alguna columna en la que al menos 1 valor
#sea superior a 4
print(np.any(i>4,axis=0));
#Comprobar si hay alguna fila en la que al menos 1 valor
#sea superior a 4
print(np.any(i>4,axis=1));