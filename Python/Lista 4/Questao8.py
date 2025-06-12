#Construa um algoritmo para pagamento de comissão de vendas. A quantidade de vendedores deve ser lida no
#início do algoritmo e considere que a comissão é de 5%. Os dados de cada vendedor são os seguintes: nome do vendedor e o valor vendido
#Para cada vendedor, deve ser apresentado o valor da comissão.
#Ao final, mostrar os seguintes resultados: A quantidade de vendedores lidos, o valor total vendido; o valor pago
#às comissões e o nome do melhor vendedor e seu respectivo valor de venda e comissão.
#Saber primeiro: Quantidade de vendedores; valor total vendido ; valor pago às comissões
#Saber depois: melhor vendedor ; melhor valor e sua comissão
#FINALIZADO
def variables():
    global name, nameM, venda, vendaM, vendatotal, comissaototal
    name = ""
    nameM = ""
    venda = 0
    vendaM = 0
    vendatotal = 0
    comissaototal = 0

cont = 0
vendedores = int(input("Qual a quantidade de vendedores:")) 
variables()

while(cont < vendedores):
    name = str(input("Qual o nome deste vendedor: "))
    venda = float(input("Quanto este vendedor vendeu:"))
    cont=cont+1
    if (venda>vendaM):
        vendaM = venda
        nameM = name
        comissaoM = vendaM*0.05
        
    vendatotal+=venda
    comissaototal=vendatotal*0.05
print("O vendedor que mais vendeu foi",nameM,"seu valor de venda foi de",vendaM,"e a comissao recebida foi de",comissaoM)
print("Foram lidos",vendedores,"vendedores, vendendo no total R$",vendatotal,"e rendendo um total de comissões de",comissaototal)

#FINALIZADO
