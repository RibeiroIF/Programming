#Dados 3 valores numéricos A,B e C, verificar se eles podem ser comprimentos de lados de um triângulo e, se
#forem, verificar (classificados quanto ao lado) se é triângulo: equilátero, isósceles ou escaleno. Caso não seja um
#triângulo, escrever uma mensagem.
#Obs. 1: Triângulos: Equilátero: todos os lados iguais; Isósceles: dois lados iguais; Escaleno: todos os lados diferentes
#Obs. 2: Para que seja um triângulo, cada lado deve ser menor que a soma dos outros dois. 
#FINALIZADO
def equilatero():
    print("O triângulo analisado é equilátero")
def isosceles():
    print("O triângulo analisado é isosceles")
def escaleno():
    print("O triângulo analisado é escaleno")
def invalido():
    print("Este não é um triângulo")
  
go = "s"

while go == "s":
    l1 = int (input ("Qual o valor do primeiro lado do triângulo?: "))
    l2 = int (input("Qual o valor do segundo lado do triângulo?: "))
    l3 = int (input("E qual o valor do terceiro lado do triângulo?: "))

    if (l1 + l2 < l3) or (l2 + l3 < l1) or (l1 + l3 < l2):
        invalido()
    elif (l1 == l2) and (l2 == l3) and (l1 == l3):
        equilatero()
    elif (l1 == l2) or (l2 == l3) or (l1 == l3):
        isosceles()
    elif (l1 != l2) and (l2 != l3) and (l1 != l3):
        escaleno()
        
    go = (input("Deseja refazer a operação?: "))
    
#FINALIZADO
    

