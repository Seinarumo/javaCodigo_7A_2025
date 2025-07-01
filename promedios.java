# Solicitar las tres evaluaciones al usuario
nota1 = float(input("Ingrese la primera nota: "))
nota2 = float(input("Ingrese la segunda nota: "))
nota3 = float(input("Ingrese la tercera nota: "))

# Calcular el promedio
promedio = (nota1 + nota2 + nota3) / 3

# Mostrar si está aprobado o reprobado con un solo if
if promedio >= 7:
    print("Aprobado")
else:
    print("Reprobado")
