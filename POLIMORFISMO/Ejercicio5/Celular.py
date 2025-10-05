class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio
        self.ram = ram
        self.nroApp = nroApp

    def mostrar(self):
        print("Número de teléfono:", self.nroTel)
        print("Dueño:", self.dueño)
        print("Espacio:", self.espacio, "GB")
        print("Memoria RAM:", self.ram, "GB")
        print("Número de aplicaciones:", self.nroApp)
        print("----------------------------------")

    def __add__(self, otro):
        nuevo = Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp)
        nuevo.nroApp = self.nroApp + 10
        return nuevo

    def __sub__(self, otro):
        nuevo = Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp)
        nuevo.espacio = self.espacio - 5
        return nuevo



cel = Celular("777-12345", "Luis Ulo", 64, 8, 30)

print("DATOS INICIALES:")
cel.mostrar()

cel_mas = cel + 1
print("Después del operador ++ (aumenta nroApp en 10):")
cel_mas.mostrar()

cel_menos = cel - 1
print("Después del operador -- (disminuye espacio en 5 GB):")
cel_menos.mostrar()
