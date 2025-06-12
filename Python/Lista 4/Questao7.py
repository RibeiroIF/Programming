#Construa um algoritmo para ler a cotação do dólar e, na sequência, ler um determinado valor em dólar 
#mostrando seu respectivo valor em reais. Repita a operação enquanto o valor for diferente de 0 
#FINALIZADO

a = float(input("Qual a cotação do dólar: "))
b = float(input("Qual o valor em dólares: "))
reais = b*a

while (reais!=0):
    print("O valor convertido para reais é de:",reais)
    a = float(input("Qual a cotação do dólar: "))
    b = float(input("Qual o valor em dólares: "))
    reais = b*a
    if (reais==0):
        print("Operação encerrada.")
        break

#FINALIZADO