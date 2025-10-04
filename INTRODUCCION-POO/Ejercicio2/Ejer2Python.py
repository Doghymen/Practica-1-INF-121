class Bus:
    def __init__(self, pasaje: float, asientos: int):
        self.pasajeros = 0
        self.pasaje = pasaje
        self.asientos = asientos

    def subir_pasajeros(self, x: int):
        if x <= self.asientos - self.pasajeros:
            self.pasajeros += x
            print(f"La cantidad de pasajeros que subieron es de: {self.pasajeros}")
        else:
            print("No hay suficientes asientos disponibles para subir esa cantidad de pasajeros.")

    def cobrar_pasaje(self) -> float:
        total = self.pasajeros * self.pasaje
        print(f"El total de pasaje cobrado es Bs: {total}")
        return total

    def mostrar_asientos_disponibles(self) -> int:
        disponibles = self.asientos - self.pasajeros
        print(f"La cantidad de asientos disponibles es de: {disponibles} asientos de: {self.asientos}")
        return disponibles


if __name__ == "__main__":
    primer_bus = Bus(1.50, 40)

    primer_bus.subir_pasajeros(5)
    primer_bus.cobrar_pasaje()
    primer_bus.mostrar_asientos_disponibles()