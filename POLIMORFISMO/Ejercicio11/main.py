class Pasajero:
    def __init__(self, nombre="", edad=0, genero="", nroHabitacion=0, costoPasaje=0):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero
        self.nroHabitacion = nroHabitacion
        self.costoPasaje = costoPasaje

    def incrementar(self):
        print("=== Ingreso de datos del pasajero ===")
        self.nombre = input("Nombre: ")
        self.edad = int(input("Edad: "))
        self.genero = input("Género (M/F): ")
        self.nroHabitacion = int(input("Número de habitación: "))
        self.costoPasaje = int(input("Costo del pasaje: "))

    def decrementar(self):
        print("=== Datos del pasajero ===")
        print("Nombre:", self.nombre)
        print("Edad:", self.edad)
        print("Género:", self.genero)
        print("Número de habitación:", self.nroHabitacion)
        print("Costo del pasaje:", self.costoPasaje)

class Crucero:
    def __init__(self, nombre="", paisOrigen="", paisDestino=""):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.pasajeros = []

    def incrementar(self):
        print("=== Ingreso de datos del crucero ===")
        self.nombre = input("Nombre del crucero: ")
        self.paisOrigen = input("País de origen: ")
        self.paisDestino = input("País de destino: ")

    def decrementar(self):
        print("=== Datos del crucero ===")
        print("Nombre:", self.nombre)
        print("País de origen:", self.paisOrigen)
        print("País de destino:", self.paisDestino)
        print("Cantidad de pasajeros:", len(self.pasajeros))
        print("--------------------------------------")
        for p in self.pasajeros:
            p.decrementar()

    def __eq__(self, otro):
        total1 = 0
        for p in self.pasajeros:
            total1 += p.costoPasaje

        total2 = 0
        for p in otro.pasajeros:
            total2 += p.costoPasaje

        print("La suma total de los pasajes del crucero 1 es:", total1)
        print("La suma total de los pasajes del crucero 2 es:", total2)
        return total1 == total2

    def __add__(self, otro):
        print("Comparando cantidad de pasajeros...")
        if len(self.pasajeros) == len(otro.pasajeros):
            print("Ambos cruceros tienen la misma cantidad de pasajeros.")
        else:
            print("Los cruceros tienen diferente cantidad de pasajeros.")
        return None
    def __sub__(self, otro):
        hombres = 0
        mujeres = 0
        for p in self.pasajeros:
            if p.genero.upper() == "M":
                hombres += 1
            elif p.genero.upper() == "F":
                mujeres += 1
        print("Cantidad de hombres:", hombres)
        print("Cantidad de mujeres:", mujeres)
        return None

if __name__ == "__main__":
    c1 = Crucero("Sol del Mar", "Bolivia", "Chile")
    c2 = Crucero("Océano Azul", "Perú", "Argentina")

    p1 = Pasajero("Juan Vargas", 30, "M", 502, 500)
    p2 = Pasajero("Martina Vasques", 25, "F", 603, 1000)
    p3 = Pasajero("Wilmer Montero", 28, "M", 401, 925)
    p4 = Pasajero("Lucía Pérez", 22, "F", 701, 750)
    p5 = Pasajero("Carlos López", 35, "M", 205, 600)

    c1.pasajeros.append(p1)
    c1.pasajeros.append(p2)
    c1.pasajeros.append(p3)

    c2.pasajeros.append(p4)
    c2.pasajeros.append(p5)

    c1.decrementar()
    c2.decrementar()

    print("\n--- Comparación de suma total de pasajes (==) ---")
    resultado = (c1 == c2)
    print("\n--- Comparación cantidad de pasajeros (+) ---")
    c1 + c2
    print("\n--- Cantidad de hombres y mujeres (-) ---")
    c1 - c2
