def codificar(mensaje, veces):
    mensaje_cifrado = ""
    for letra in mensaje:
        if letra.isalpha():
            if letra.islower():
                base_ascii = ord('a')
            else:
                base_ascii = ord('A')
            nuevo_ascii = (ord(letra) - base_ascii + veces) % 26 + base_ascii
            mensaje_cifrado += chr(nuevo_ascii)
        else:
            mensaje_cifrado += letra
    return mensaje_cifrado

def decodificar(mensaje, veces):
    mensaje_decifrado = ""
    for letra in mensaje:
        if letra.isalpha():
            if letra.islower():
                base_ascii = ord('a')
            else:
                base_ascii = ord('A')
            nuevo_ascii = (ord(letra) - base_ascii - veces) % 26 + base_ascii
            mensaje_decifrado += chr(nuevo_ascii)
        else:
            mensaje_decifrado += letra
    return mensaje_decifrado

def main():
    opciones = 0
    print("Bienvenido a tu programa de codificación y decodificación")

    while True:
        print("_____________________________")
        print("Ingresa la opción que desees")
        print("(1) Codificar")
        print("(2) Descodificar")
        print("(3) Salir")
        opcion = input()

        if opcion == "1":
            mensaje = input("Ingresa el mensaje que quieres codificar: ")
            veces = int(input("Cuántas veces quieres mover la letra: "))
            mensaje_cifrado = codificar(mensaje, veces)
            print("Tu mensaje cifrado es:", mensaje_cifrado)
        elif opcion == "2":
            mensaje = input("Ingresa el mensaje que quieras decodificar: ")
            veces = int(input("Cuál es tu llave: "))
            mensaje_decifrado = decodificar(mensaje, veces)
            print("Tu mensaje descifrado es:", mensaje_decifrado)
        elif opcion == "3":
            print("Adiós")
            break
        else:
            print("Opción inválida. Por favor, elige una opción válida.")

if __name__ == "__main__":
    main()
