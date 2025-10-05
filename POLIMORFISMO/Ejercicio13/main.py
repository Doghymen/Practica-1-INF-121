class Cancion:
    def __init__(self, nombre="", artista="", pesoKb=0):
        self.nombre = nombre
        self.artista = artista
        self.pesoKb = pesoKb

    def mostrar(self):
        print("Canción:", self.nombre)
        print("Artista:", self.artista)
        print("Peso (Kb):", self.pesoKb)
        print("--------------------------------")

class Video:
    def __init__(self, nombre="", artista="", pesoMb=0):
        self.nombre = nombre
        self.artista = artista
        self.pesoMb = pesoMb

    def mostrar(self):
        print("Video:", self.nombre)
        print("Artista:", self.artista)
        print("Peso (Mb):", self.pesoMb)
        print("--------------------------------")

class Mp4:
    def __init__(self, marca="", capacidadGb=0.0):
        self.marca = marca
        self.capacidadGb = capacidadGb
        self.nroCanciones = 0
        self.nroVideos = 0
        self.canciones = []
        self.videos = []

    def borrar_cancion(self, nombre, artista, pesoKb):
        encontrado = False
        for c in self.canciones:
            if c.nombre == nombre and c.artista == artista and c.pesoKb == pesoKb:
                self.canciones.remove(c)
                self.nroCanciones -= 1
                encontrado = True
                print("✅ Canción eliminada correctamente.")
                break
        if not encontrado:
            print("⚠️ Canción no encontrada.")

    def capacidad_usada_Kb(self):
        total = 0
        for c in self.canciones:
            total += c.pesoKb
        for v in self.videos:
            total += v.pesoMb * 1000
        return total

    def capacidad_disponible_Kb(self):
        capacidad_total = self.capacidadGb * 1000000
        return capacidad_total - self.capacidad_usada_Kb()

    def __add__(self, cancion):
        if isinstance(cancion, Cancion):
            espacio_disp = self.capacidad_disponible_Kb()
            if espacio_disp >= cancion.pesoKb:
                existe = False
                for c in self.canciones:
                    if c.nombre == cancion.nombre and c.artista == cancion.artista:
                        existe = True
                        break
                if not existe:
                    self.canciones.append(cancion)
                    self.nroCanciones += 1
                    print("Canción añadida correctamente.")
                else:
                    print("La canción ya existe en el MP4.")
            else:
                print("No hay suficiente espacio para añadir la canción.")
        else:
            print("No se puede añadir, el objeto no es una canción.")
        return self
    def __sub__(self, video):
        if isinstance(video, Video):
            espacio_disp = self.capacidad_disponible_Kb()
            pesoKb = video.pesoMb * 1000
            if espacio_disp >= pesoKb:
                existe = False
                for v in self.videos:
                    if v.nombre == video.nombre and v.artista == video.artista:
                        existe = True
                        break
                if not existe:
                    self.videos.append(video)
                    self.nroVideos += 1
                    print("Video añadido correctamente.")
                else:
                    print("El video ya existe en el MP4.")
            else:
                print("No hay suficiente espacio para añadir el video.")
        else:
            print("No se puede añadir, el objeto no es un video.")
        return self

    def mostrar(self):
        print("================================")
        print("Marca del MP4:", self.marca)
        print("Capacidad total (Gb):", self.capacidadGb)
        print("Capacidad disponible (Kb):", self.capacidad_disponible_Kb())
        print("--------------------------------")
        print("Canciones almacenadas:", self.nroCanciones)
        for c in self.canciones:
            c.mostrar()
        print("Videos almacenados:", self.nroVideos)
        for v in self.videos:
            v.mostrar()
        print("================================")

if __name__ == "__main__":
    mp4 = Mp4("Sony", 1.0)

    c1 = Cancion("Back To Black", "Amy Winehouse", 100)
    c2 = Cancion("Lost On You", "LP", 150)
    c3 = Cancion("Shape Of You", "Ed Sheeran", 200)

    v1 = Video("Heathens", "twenty one pilots", 50)
    v2 = Video("Harmonica Andromeda", "KSHMR", 70)
    v3 = Video("Without Me", "Halsey", 30)

    mp4 + c1
    mp4 + c2

    mp4 - v1
    mp4 - v2

    print("\n--- CONTENIDO INICIAL DEL MP4 ---")
    mp4.mostrar()

    print("\n--- ELIMINANDO CANCIÓN ---")
    mp4.borrar_cancion("Lost On You", "LP", 150)

    print("\n--- AÑADIENDO NUEVA CANCIÓN ---")
    mp4 + c3

    print("\n--- ESTADO FINAL DEL MP4 ---")
    mp4.mostrar()
