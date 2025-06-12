#Faça um algoritmo para ler 15 números é informar se cada número é maior, menor ou igual a 0 (zero).
#FINALIZADO
def cond_um():
    print("Este número é maior que zero")
def cond_dois():
    print("Este número é menor que zero")
def cond_tres():
    print("Este número é igual a zero")
def cond_quebra():
    print("Este número foi contabilizado, já chegamos ao limite")
    print("Fim da sessão.")
    
global cont
cont = 0

while(cont>=1) or (cont<=16):
    n =int(input("Selecione um número:"))
    if (n>0):
        cond_um()
        cont=cont+1
    elif (n<0):
        cond_dois()
        cont=cont+1
    elif (n==0):
        cond_tres()
        cont=cont+1
    if (cont == 14):
        cond_quebra()
        break
    
#FINALIZADO