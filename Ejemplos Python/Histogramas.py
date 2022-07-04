def rectanguloMaximo(alturas):#Versión simple
    max=0;
    for i in range(len(alturas)):
        left=i;
        while left-1>=0 and alturas[left-1]>=alturas[i]:
            left=left-1;
        right=i;
        while right+1<len(alturas) and alturas[right+1]>=alturas[i]:
            right=right+1;
        area=(right-left+1)*alturas[i];
        if area>max:
            max=area;
    return max;
#Versión complicada
def rectangulo(alturas, bajo, alto):
    if bajo>alto:
        return 0;
    elif bajo==alto:
        return alturas[bajo];
    else:
        alturaMin=min(alturas[bajo:alto+1]);
        posicionMin=alturas.index(alturaMin, bajo, alto+1);
        izquierda=rectangulo(alturas, bajo, posicionMin-1);
        derecha=rectangulo(alturas, posicionMin+1, alto);
        return max(izquierda, derecha, alturaMin*(alto-bajo+1));
def rectanguloGrande(alturas):
    return rectangulo(alturas, 0, len(alturas)-1);