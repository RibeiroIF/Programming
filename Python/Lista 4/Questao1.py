#Faça um algoritmo que, dado o consumo em KWh, calcule o valor da energia elétrica consumida em um mês.
#Sabe-se que: de 0-150 cobra-se R$ 0,2262 por KWh e o excedente (>150) cobra-se R$ 0,26531 por KWh 
go = "s"

def lightless():
    global valor 
    valor = float((light * 0.2262))
def lightplus():
    global valor
    extra = int((light - 150))
    valor = float(((150 * 0.2262) + (extra * 0.26531)))
    
while go == "s":
    name = str (input ("Qual o seu nome?: "))
    light = int (input ("Quanto foi seu gasto de luz em KWh?: "))
    if (light <= 150):
        lightless()
        print (name, ", o valor a ser pago é de",valor)
    else:
        lightplus()
        print (name, ", o valor a ser pago é de",valor)
        
    go = (input("Repetir o programa? S/N: "))

    

    
