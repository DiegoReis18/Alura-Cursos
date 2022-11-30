import random 

print("**********************************")
print("Bem vindo ao jogo de adivinhação!")
print("**********************************")
num_secreto = random.randrange(1,101)
tentativas = 3

print(num_secreto)

for rodada in range (1, tentativas+1):
    print("Tentativa {0} de {1} ".format(rodada,tentativas))
    chute = int(input("Digite o seu número: "))
    print("Você digitou ", chute)

    if(chute<1 or chute>100):
        print("Você deve digitar entre 1 e 100! Rodada perdida!\n")
        continue

    if(num_secreto==chute):
        print("Você acertou!!")
        break
    elif(num_secreto>chute):
        print("Maior!\n")
        rodada = rodada+1
    else:
        print("Menor!\n")
        rodada = rodada+1
        
print("\nFIM!")
