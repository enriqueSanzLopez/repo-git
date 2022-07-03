def NumeroCaminos(m, n, memoria={}):
    #Esta función trata de calcular el número de caminos
    #que pueden tomarse para llegar a un extremo de una
    #cuadrícula desde el otro extremo.
    numero=str(m)+","+str(n);
    if numero in memoria:
        return memoria[numero];
    elif m==0 or n==0:
        return 0;
    elif m==1 or n==1:
        return 1;
    else:
        memoria[numero]=NumeroCaminos(m-1, n, memoria)+NumeroCaminos(m, n-1, memoria);
        return memoria[numero];