from typing import List

class Fruta:
    def __init__(self, nombre: str, tipo: str, vitaminas: List[str]):
        self.nombre = nombre
        self.tipo = tipo
        self.nro_vitaminas = len(vitaminas)
        self.v = []
        for i in range(self.nro_vitaminas):
            self.v.append(vitaminas[i])

    def mostrar(self):
        for i in range(self.nro_vitaminas):
            print(self.v[i], end=" ")
        print()

    def vitaminas_citricas(self) -> int:
        acum = 0
        for i in range(self.nro_vitaminas):
            if self.v[i] in ["C", "A", "E"]:
                acum += 1
        return acum

    def get_nro_vitaminas(self) -> int:
        return self.nro_vitaminas

    def get_nombre(self) -> str:
        return self.nombre

    def vitaminas_concatenadas(self) -> str:
        resultado = ""
        for i in range(self.nro_vitaminas):
            resultado += self.v[i]
        return resultado


# Bloque principal (equivalente al main en Java)
if __name__ == "__main__":

    # a) Instanciar 3 frutas diferentes
    f1 = Fruta("Kiwi", "Subtropical", ["K", "C", "E"])
    f2 = Fruta("Platano", "Hierro", ["A", "B", "C"])
    f3 = Fruta("Naranja", "Tropical", ["C", "A"])

    frutas = [f1, f2, f3]

    # b) Verificar cuál es la fruta con más vitaminas
    cont = frutas[0]
    for i in range(1, len(frutas)):
        if frutas[i].get_nro_vitaminas() > cont.get_nro_vitaminas():
            cont = frutas[i]
    print("La fruta con mayor vitamina es:", cont.get_nombre())

    # c) Mostrar las vitaminas que tiene la fruta X
    print("\nVitaminas de la fruta Naranja:")
    f3.mostrar()

    # d) Cuántas vitaminas son cítricas
    acum_citricas = 0
    for i in range(len(frutas)):
        fruta_actual = frutas[i]
        cantidad_citricas = fruta_actual.vitaminas_citricas()
        acum_citricas += cantidad_citricas
    print("\nTotal de vitaminas cítricas:", acum_citricas)

    # e) Ordenar las frutas alfabéticamente según el nombre de sus vitaminas
    for i in range(len(frutas) - 1):
        for j in range(i + 1, len(frutas)):
            vit_i = frutas[i].vitaminas_concatenadas()
            vit_j = frutas[j].vitaminas_concatenadas()

            if vit_i > vit_j:  # compareTo equivalente
                frutas[i], frutas[j] = frutas[j], frutas[i]

    # Mostrar el resultado
    print("\n============================================================")
    print("Frutas ordenadas por el nombre de sus vitaminas:")
    for fruta in frutas:
        print(f"{fruta.get_nombre()} - {fruta.vitaminas_concatenadas()}")
