def esAnagrama(cadena1, cadena2):
    cadena1=cadena1.upper();
    cadena2=cadena2.upper();
    s1=sorted(cadena1);
    s2=sorted(cadena2);
    if s1==s2:
        return True;
    else:
        return False;