def Fibonacci(numero, memoria={}):
    #Esta función devuelve como resultado el valor del elemento
    #en la posición indicada por número en la sucesión de
    #Fibonacci de forma recursiba. En la sucesión de Fibonacci,
    #los dos primeros números son 1 y cada nuevo número es
    #resultado de la suma de los dos números anteriores de la
    #sucesión.
    if numero in memoria:
        #Comprueba primero si el valor se ha guardado en algún
        #momento en el pasado y si así ha sido, no se necesita
        #calcular.
        return memoria[numero];
    elif numero==0:
        return 0;
    elif(numero<=2):
        return 1;
    else:
        #En caso de que el valor no se haya guardado antes y no
        #sea 1, se guarda en la memoria y se devuelve.
        memoria[numero]=Fibonacci(numero-1, memoria)+Fibonacci(numero-2, memoria);
        return memoria[numero];