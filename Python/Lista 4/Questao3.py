#Faça um algoritmo que mostre os números pares entre 1 e 27

go = "s"
def primeiracont():
    global a
    print(a," ")
    a = a+2
def segundacont():
    global a
    print(a," ")
    a = a+2
def invalidate():
    print("Não foi o número solicitado")
  
while (go == "s"):
    a = int(input("Qual o número determinado?: "))  
    if (a == 1):
        a = a+1
        while (a > 1) and (a < 27):
            primeiracont()
    elif (a == 2):
        while (a > 1) and (a < 27):
            segundacont()
    else:
            invalidate()
    go = input("Deseja refazer a operação? S/N: ")
            