#Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso
#ideal, utilizando as seguintes fórmulas:
#Para Homens: (72,7* altura) – 58
#Para Mulheres: (62,1 * altura) – 44.7
#• Na leitura do sexo só poderão ser aceitos M (masculino) ou F (feminino)
#• Realizar a seguinte pergunta ao usuário: ‘DESEJA CONTINUAR (S/N) ?’ e repetir caso a resposta for
#afirmativa.
#FINALIZADO
def variables():
    global gender, height
def men():
    weight = (72.7 * height) - 58 
    print ("Seu peso ideal é de:",weight) 
def women():
    weight = (62.1 * height) - 44.7 
    print ("Seu peso ideal é de:",weight)   

go = "s"

while(go == "s"):
    gender = str(input("Qual é o seu sexo?: "))
    height = float(input("Qual a sua altura?: "))
    if(gender == "m"):
        men()
    if(gender == "f"):
        women()
    go = str(input("Deseja continuar? S/N: "))
    if(go == "n"):
            print("Programa Finalizado")
            
#FINALIZADO