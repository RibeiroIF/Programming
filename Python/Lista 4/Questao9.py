#Num frigorífico entrou um certo número de bois que deve ser fornecido como entrada. 
#Cada boi traz no seu pescoço um cartão contendo um número de identificação e seu peso. 
#Fazer um algoritmo que escreva: o número e o peso do boi mais magro; o número e o peso do boi 
#mais gordo e quantos bois entraram no frigorífico.
#FINALIZADO
def leve():
    global pesoMenor
    global idMenor
    pesoMenor = peso
    idMenor = id
def pesado():
    global pesoMaior
    global idMaior
    pesoMaior = peso
    idMaior = id
def variables():
    global idMaior, idMenor, pesoMaior, pesoMenor
    idMaior = id
    idMenor = id
    pesoMaior = peso
    pesoMenor = peso
def results():
    print ("Entraram",bois,"bois no frigorífico")
    print ("O bois mais pesado é o",idMaior,"e seu peso é de",pesoMaior,"Kg")
    print ("O bois mais leve é o",idMenor,"e seu peso é de",pesoMenor,"Kg")
    
cont = 1
bois = int(input("Quantos bois entraram no frigorífico:"))
id = int(input("Qual o número de identificação deste boi:"))
peso = float(input("Qual é o peso deste boi:"))

variables()

while(cont < bois):
    id = int(input("Qual o número de identificação deste boi:"))
    peso = float(input("Qual é o peso deste boi:"))
    cont = cont+1
    if(peso>pesoMaior):
        pesado()
    if(pesoMenor>peso):
        leve()
results()

#FINALIZADO