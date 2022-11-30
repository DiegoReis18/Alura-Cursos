print("**********************************")
print("Bem vindo ao jogo de adivinhação!")
print("**********************************")
num_secreto = 42
chute = int(input("Digite o seu número: "))
print("Você digitou ", chute)

if(num_secreto==chute):
    print("Você acertou!!")
elif(num_secreto>chute):
    print("Maior!")
else:
    print("Menor!")
