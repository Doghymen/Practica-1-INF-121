class Persona:
    def __init__(self, nombre: str, paterno: str, materno: str, edad: int, ci: int):
        self.nombre = nombre
        self.paterno = paterno
        self.materno = materno
        self.edad = edad
        self.ci = ci

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre}")
        print(f"Ap Paterno: {self.paterno}")
        print(f"Ap Materno: {self.materno}")
        print(f"Edad: {self.edad}")
        print(f"Ci: {self.ci}")

    def mayor_edad(self) -> bool:
        return self.edad > 18

    def modificar_edad(self, nuevo: int):
        edad_antigua = self.edad
        self.edad = nuevo
        print(f"La edad {edad_antigua} fue modificada correctamente a {self.edad}")

    def get_paterno(self) -> str:
        return self.paterno


# Bloque principal
if __name__ == "__main__":
    p1 = Persona("Luis", "Ulo", "Poma", 24, 8333828)
    p2 = Persona("Damariz", "Cusi", "Uscamayta", 21, 1234567)

    print("======= DATOS PRIMERA PERSONA =======")
    p1.mostrar_datos()

    print("======= DATOS SEGUNDA PERSONA =======")
    p2.mostrar_datos()

    print("======= CONSULTA MAYOR DE EDAD =======")
    print(f"{p1.get_paterno()} es mayor de edad?: {p1.mayor_edad()}")

    print("======= MODIFICAR EDAD =======")
    p1.modificar_edad(18)

    print("======= COMPARANDO APELLIDOS PATERNOS =======")
    if p1.get_paterno() == p2.get_paterno():
        print("Tienen el mismo apellido paterno")
    else:
        print("No tienen el mismo apellido paterno")
