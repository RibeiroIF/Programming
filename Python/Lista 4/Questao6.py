# Faça um algoritmo que mostre os números de 1 à 30 sendo que qdo o número for 
# múltiplo de quatro apareça em seu lugar a palavra ‘pim’.
#FINALIZADO

n = 1

while (n>=1) and (n<=30):
    print(n," ")
    n=n+1
    if(n%4==0):
        print("Pim")
        n=n+1
        
#FINALIZADO